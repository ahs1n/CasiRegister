package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.contracts.ChildInformationContract;
import edu.aku.hassannaqvi.naunehal.contracts.FormsContract;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection01hhBinding;
import edu.aku.hassannaqvi.naunehal.models.Form;

public class Section01HHActivity extends AppCompatActivity {

    ActivitySection01hhBinding bi;
    private DatabaseHelper db;
    private String ucCode = "", dCode = "";

    List<String> ucName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_01hh);

        /** ONLY in First Section of every Table
         *
         *  Below statement will be called only in first section (in identification or section A ).
         *  We will decide this later after checking functionality and flow of the app
         */
        MainApp.form = new Form();

        // TODO: Check if form already exist in database.
        if (/*!formExists()*/ false)  //<== If form exist in database formExists() will also populateForm() and return true;
        {
            initForm(); //<== If form does not exist in database (New Form)
        }

        bi.setForm(MainApp.form);
        setupSkips();
    }

    private void setupSkips() {
        rgListener(bi.hh11, bi.hh1102, bi.llhh11);
        rgListener(bi.hh18, bi.hh1801, bi.llhh18);
    }


    private void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) vg.setVisibility(View.GONE);
        });
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        initForm(); //<== This function is no longer needed after DataBinding

        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, ChildrenListActivity.class));
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.dbHelper;
        Long updcount = db.addForm(MainApp.form);
        MainApp.form.setId(updcount.toString());
        if (updcount > 0) {
            MainApp.form.setUid(MainApp.form.getDeviceId() + MainApp.form.getId());
            int count = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_UID, MainApp.form.getUid());
            if (count > 0)
                count = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_S01HH, MainApp.form.getS01HH());
            if (count > 0)
                return true;
            else {
                Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
                return false;
            }
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;

        int totalmember = (TextUtils.isEmpty(bi.hh22.getText()) ? 0 : Integer.parseInt(bi.hh22.getText().toString().trim()))
                + (TextUtils.isEmpty(bi.hh23.getText()) ? 0 : Integer.parseInt(bi.hh23.getText().toString().trim()));

        if (totalmember == 0) {
            return Validator.emptyCustomTextBox(this, bi.hh21, "Invalid Count");
        } else if (totalmember != Integer.parseInt(bi.hh21.getText().toString())) {
            return Validator.emptyCustomTextBox(this, bi.hh21, "Invalid Count");
        } else if (Integer.parseInt(bi.hh24.getText().toString()) >= Integer.parseInt(bi.hh22.getText().toString())) {
            return Validator.emptyCustomTextBox(this, bi.hh24, "Total male childs cannot be greater or equal than HH22");
        } else if (Integer.parseInt(bi.hh25.getText().toString()) >= Integer.parseInt(bi.hh23.getText().toString())) {
            return Validator.emptyCustomTextBox(this, bi.hh25, "Total female childs cannot be greater or equal than HH22");
        }
        return true;
    }

    // Only in First Section of every Table.
    public void initForm() {
        // TODO: need work on appinfo
        MainApp.form.setSysDate(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(new Date().getTime()));
        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setDcode(dCode);
        MainApp.form.setUcode(ucCode);
        MainApp.form.setCluster(bi.hh08.getText().toString());
        MainApp.form.setHhno(bi.hh09.getText().toString());
        MainApp.form.setDeviceId(MainApp.appInfo.getDeviceID());
        MainApp.form.setDeviceTag(MainApp.appInfo.getTagName());
        MainApp.form.setAppver(MainApp.appInfo.getAppVersion());
        MainApp.form.setGps(getGPS(this).toString());
        // MainApp.setGPS({"gpsLng":"12444",...});
    }

    private JSONObject getGPS(Activity activity) {
        JSONObject json = new JSONObject();
        SharedPreferences GPSPref = activity.getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);
        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");

            if (lat.equals("0") && lang.equals("0")) {
                Toast.makeText(activity, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(activity, "GPS set", Toast.LENGTH_SHORT).show();
            }

            String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();
            json.put("gpslat", GPSPref.getString("Latitude", "0"));
            json.put("gpslng", GPSPref.getString("Longitude", "0"));
            json.put("gpsacc", GPSPref.getString("Accuracy", "0"));
            json.put("gpsdate", date);

            return json;
        } catch (Exception e) {
            Log.e("GPS", "setGPS: " + e.getMessage());
        }
        return null;
    }

}