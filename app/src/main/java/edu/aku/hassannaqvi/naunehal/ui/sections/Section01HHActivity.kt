package edu.aku.hassannaqvi.naunehal.ui.sections

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.text.format.DateFormat
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.validatorcrawler.aliazaz.Clear
import com.validatorcrawler.aliazaz.Validator
import edu.aku.hassannaqvi.naunehal.R
import edu.aku.hassannaqvi.naunehal.contracts.FormsContract
import edu.aku.hassannaqvi.naunehal.core.MainApp
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection01hhBinding
import edu.aku.hassannaqvi.naunehal.models.Form
import org.json.JSONObject
import org.threeten.bp.Instant
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneId
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class Section01HHActivity : AppCompatActivity() {
    lateinit var bi: ActivitySection01hhBinding
    private val ucCode = ""
    private val dCode = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_01hh)
        bi.hh05.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList("....", "Test"))
        bi.hh06.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList("....", "Test"))

        // TODO: Check if form already exist in database.
        if ( /*!formExists()*/true) //<== If form exist in database formExists() will also populateForm() and return true;
        {
            initForm() //<== If form does not exist in database (New Form)
        }
        bi.form = MainApp.form
        setupSkips()
    }

    private fun setupSkips() {
        rgListener(bi.hh11, bi.hh1102, bi.llhh11)
        rgListener(bi.hh18, bi.hh1801, bi.llhh18)
    }

    private fun rgListener(rg: RadioGroup, rb: RadioButton, vg: ViewGroup) {
        rg.setOnCheckedChangeListener { radioGroup: RadioGroup?, i: Int ->
            Clear.clearAllFields(vg)
            vg.visibility = View.VISIBLE
            if (i == rb.id) vg.visibility = View.GONE
        }
    }

    fun BtnContinue(view: View) {
        if (!formValidation()) return
        initForm() //<== This function is no longer needed after DataBinding
        if (updateDB()) {
            finish()
            startActivity(Intent(this, ChildrenListActivity::class.java))
        }
    }

    fun checkHHExist(view: View) {
        Clear.clearAllFields(bi.fldGrpcheck)
        bi.fldGrpcheck.visibility = View.VISIBLE
    }

    private fun updateDB(): Boolean {
        val db = MainApp.appInfo.dbHelper
        val updcount = db.addForm(MainApp.form)
        MainApp.form.id = updcount.toString()
        return if (updcount > 0) {
            MainApp.form.uid = MainApp.form.deviceId + MainApp.form.id
            var count = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_UID, MainApp.form.uid)
            if (count > 0) count = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_S01HH, MainApp.form.s01HH)
            if (count > 0) true else {
                Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show()
                false
            }
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show()
            false
        }
    }

    private fun formValidation(): Boolean {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false
        val totalMembers = ((if (TextUtils.isEmpty(bi.hh22.text)) 0 else bi.hh22.text.toString().trim().toInt())
                + if (TextUtils.isEmpty(bi.hh23.text)) 0 else bi.hh23.text.toString().trim().toInt())
        if (totalMembers == 0) {
            return Validator.emptyCustomTextBox(this, bi.hh21, "Invalid Count")
        } else if (totalMembers != bi.hh21.text.toString().toInt()) {
            return Validator.emptyCustomTextBox(this, bi.hh21, "Invalid Count")
        } else if (bi.hh24.text.toString().toInt() >= bi.hh22.text.toString().toInt()) {
            return Validator.emptyCustomTextBox(this, bi.hh24, "Total male Children cannot be greater or equal than HH22")
        } else if (bi.hh25.text.toString().toInt() >= bi.hh23.text.toString().toInt()) {
            return Validator.emptyCustomTextBox(this, bi.hh25, "Total female Children cannot be greater or equal than HH22")
        } else if (bi.hh24.text.toString().toInt() == 0 && bi.hh25.text.toString().toInt() == 0) return Validator.emptyCustomTextBox(this, bi.hh21, "Male & Female Children cannot be zero")
        return true
    }

    // Only in First Section of every Table.
    private fun initForm() {
        MainApp.form = Form()
        MainApp.form.sysDate = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH).format(Date().time)
        MainApp.form.userName = MainApp.user.userName
        MainApp.form.dcode = dCode
        MainApp.form.ucode = ucCode
        MainApp.form.cluster = bi.hh08.text.toString()
        MainApp.form.hhno = bi.hh09.text.toString()
        MainApp.form.deviceId = MainApp.appInfo.deviceID
        MainApp.form.deviceTag = MainApp.appInfo.tagName
        MainApp.form.appver = MainApp.appInfo.appVersion
        MainApp.form.gps = getGPS(this).toString()

        //Setting Date
        try {
            bi.aa01.text?.let {
                val instant = Instant.parse(SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
                        .format(
                                SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(it.toString())
                        ) + "T06:24:01Z")
                MainApp.form.localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate()
            }
        } catch (e: ParseException) {
            e.printStackTrace()
        }
    }

    private fun getGPS(activity: Activity): JSONObject? {
        val json = JSONObject()
        val gpsPref = activity.getSharedPreferences("GPSCoordinates", MODE_PRIVATE)
        try {
            val lat = gpsPref.getString("Latitude", "0")
            val lang = gpsPref.getString("Longitude", "0")
            if (lat == "0" && lang == "0") {
                Toast.makeText(activity, "Could not obtained GPS points", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(activity, "GPS set", Toast.LENGTH_SHORT).show()
            }
            val date = DateFormat.format("dd-MM-yyyy HH:mm", gpsPref.getString("Time", "0")!!.toLong()).toString()
            json.put("gpslat", gpsPref.getString("Latitude", "0"))
            json.put("gpslng", gpsPref.getString("Longitude", "0"))
            json.put("gpsacc", gpsPref.getString("Accuracy", "0"))
            json.put("gpsdate", date)
            return json
        } catch (e: Exception) {
            Log.e("GPS", "setGPS: " + e.message)
        }
        return null
    }


}