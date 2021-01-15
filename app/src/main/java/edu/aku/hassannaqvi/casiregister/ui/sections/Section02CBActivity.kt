package edu.aku.hassannaqvi.casiregister.ui.sections

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.validatorcrawler.aliazaz.Clear
import com.validatorcrawler.aliazaz.Validator
import edu.aku.hassannaqvi.casiregister.BR
import edu.aku.hassannaqvi.casiregister.R
import edu.aku.hassannaqvi.casiregister.core.MainApp
import edu.aku.hassannaqvi.casiregister.databinding.ActivitySection02cbBinding
import edu.aku.hassannaqvi.casiregister.utils.datecollection.AgeModel
import edu.aku.hassannaqvi.casiregister.utils.datecollection.DateRepository.Companion.getCalculatedAge
import edu.aku.hassannaqvi.casiregister.utils.openWarningDialog
import org.threeten.bp.Instant
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneId
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class Section02CBActivity : AppCompatActivity() {
    lateinit var bi: ActivitySection02cbBinding
    var dtFlag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_02cb)
        bi.callback = this

        // TODO: Move this line to onCreate of childlist activity (recycler) and implement fetchChildrenByUUID() from TABLE_FAMILY in Database.
//        MainApp.childInfo = new ChildInfo();

        // TODO: After itemClick on childlist fetchChildByUID() from TABLE_FAMILY and update contents MainApp.Family before entering this activity.
        bi.setVariable(BR.childInformation, MainApp.childInformation)
        setupSkips()

        /*
         * Setup Listeners
         * */
        val txtListener = arrayOf<EditText>(bi.cb04dd, bi.cb04mm)
        for (txtItem in txtListener) {
            txtItem.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                    bi.cb0501.text = null
                    bi.cb0502.text = null
                    bi.cb04yy.text = null
                }

                override fun afterTextChanged(s: Editable) {}
            })
        }
    }

    private fun setupSkips() {
        bi.cb06.setOnCheckedChangeListener { radioGroup: RadioGroup?, i: Int ->
            Clear.clearAllFields(bi.fldGrpCVcb07)
            Clear.clearAllFields(bi.fldGrpCVcb08)
            Clear.clearAllFields(bi.fldGrpCVcb09)
            Clear.clearAllFields(bi.fldGrpCVcb10)
            Clear.clearAllFields(bi.fldGrpCVcb12)
            Clear.clearAllFields(bi.fldGrpCVcb13)
            Clear.clearAllFields(bi.fldGrpCVcb14)
            bi.fldGrpCVcb07.visibility = View.VISIBLE
            bi.fldGrpCVcb08.visibility = View.VISIBLE
            bi.fldGrpCVcb09.visibility = View.VISIBLE
            bi.fldGrpCVcb10.visibility = View.VISIBLE
            bi.fldGrpCVcb12.visibility = View.VISIBLE
            bi.fldGrpCVcb13.visibility = View.VISIBLE
            bi.fldGrpCVcb14.visibility = View.VISIBLE
            if (i == bi.cb0601.id) {
                bi.fldGrpCVcb07.visibility = View.GONE
                bi.fldGrpCVcb08.visibility = View.GONE
                bi.fldGrpCVcb09.visibility = View.GONE
                bi.fldGrpCVcb10.visibility = View.GONE
            } else if (i == bi.cb0602.id) {
                bi.fldGrpCVcb12.visibility = View.GONE
                bi.fldGrpCVcb13.visibility = View.GONE
                bi.fldGrpCVcb14.visibility = View.GONE
            }
        }
    }

    fun BtnContinue(view: View) {
        if (!formValidation()) return
        initForm()
        // SaveDraft(); //<== This function is no longer needed after DataBinding
        if (updateDB()) {
            finish()
        }
    }

    private fun updateDB(): Boolean {
        val db = MainApp.appInfo.dbHelper
        val updcount = db.addChildInformation(MainApp.childInformation)
        MainApp.childInformation.id = updcount.toString()
        return if (updcount > 0) {
            MainApp.childInformation.uid = MainApp.childInformation.deviceId + MainApp.childInformation.id
            var count = db.updatesChildInformationColumn(ChildInformationContract.ChildInfoTable.COLUMN_UID, MainApp.childInformation.uid)
            if (count > 0) count = db.updatesChildInformationColumn(ChildInformationContract.ChildInfoTable.COLUMN_SCB, MainApp.childInformation.sCBtoString())
            if (count > 0) true else {
                Toast.makeText(this, "SORRY! Failed to update DB)", Toast.LENGTH_SHORT).show()
                false
            }
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show()
            false
        }
    }

    private fun formValidation(): Boolean {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false
        val totalMonths = bi.cb0501.text.toString().toInt() * 12 + bi.cb0502.text.toString().toInt()
        if (totalMonths > 59) {
            this.openWarningDialog("Warning", "Add children having age of less then or equal to 59 Months")
            return false
        }
        return true
    }

    fun BtnEnd(view: View) {
        finish()
    }

    // Only in First Section of every Table.
    private fun initForm() {
        MainApp.childInformation.sysDate = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH).format(Date().time)
        MainApp.childInformation.uuid = MainApp.form.uid
        MainApp.childInformation.userName = MainApp.user.userName
        MainApp.childInformation.dcode = MainApp.form.dcode
        MainApp.childInformation.ucode = MainApp.form.ucode
        MainApp.childInformation.cluster = MainApp.form.cluster
        MainApp.childInformation.hhno = MainApp.form.hhno
        MainApp.childInformation.deviceId = MainApp.appInfo.deviceID
        MainApp.childInformation.deviceTag = MainApp.appInfo.tagName
        MainApp.childInformation.appver = MainApp.appInfo.appVersion
    }

    fun cb04yyOnTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        bi.cb0502.isEnabled = false
        bi.cb0502.text = null
        bi.cb0501.isEnabled = false
        bi.cb0501.text = null
        MainApp.childInformation.calculatedDOB = null
        if (TextUtils.isEmpty(bi.cb04dd.text) || TextUtils.isEmpty(bi.cb04mm.text) || TextUtils.isEmpty(bi.cb04yy.text)) return
        if (!bi.cb04dd.isRangeTextValidate || !bi.cb04mm.isRangeTextValidate || !bi.cb04yy.isRangeTextValidate) return
        if (bi.cb04dd.text.toString() == "98" && bi.cb04mm.text.toString() == "98" && bi.cb04yy.text.toString() == "9998") {
            bi.cb0502.isEnabled = true
            bi.cb0501.isEnabled = true
            dtFlag = true
            return
        }
        val day = if (bi.cb04dd.text.toString() == "98") 15 else bi.cb04dd.text.toString().toInt()
        val month = bi.cb04mm.text.toString().toInt()
        val year = bi.cb04yy.text.toString().toInt()
        val age: AgeModel?
        age = if (MainApp.form.localDate != null) getCalculatedAge(MainApp.form.localDate, year, month, day) else getCalculatedAge(year = year, month = month, day = day)
        if (age == null) {
            bi.cb04yy.error = "Invalid date!!"
            dtFlag = false
            return
        }
        dtFlag = true
        bi.cb0502.setText(age.month.toString())
        bi.cb0501.setText(age.year.toString())

        //Setting Date
        try {
            val instant = Instant.parse(SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(
                    "$day-$month-$year"
            )) + "T06:24:01Z")
            MainApp.childInformation.calculatedDOB = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate()
        } catch (e: ParseException) {
            e.printStackTrace()
        }
    }
}