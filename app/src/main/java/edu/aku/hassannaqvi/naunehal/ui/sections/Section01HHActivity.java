package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection01hhBinding;
import edu.aku.hassannaqvi.naunehal.models.Form;

public class Section01HHActivity extends AppCompatActivity {

    ActivitySection01hhBinding bi;
    private DatabaseHelper db;


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
            initializeForm(); //<== If form does not exist in database (New Form)
        }

        bi.setForm(MainApp.form);
        setupSkips();
    }

    private void setupSkips() {

    }


    public void BtnContinue() {
        if (!formValidation()) return;

        // SaveDraft(); //<== This function is no longer needed after DataBinding
        if (/*UpdateDB()*/ true) {
            finish();
            startActivity(new Intent(this, Section02CBActivity.class));
        }
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);

    }

    // Only in First Section of every Table.
    public void initializeForm() {
        MainApp.form.setSysDate(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(new Date().getTime()));
        MainApp.form.setUserName(MainApp.userName);
        MainApp.form.setDeviceId(MainApp.appInfo.getDeviceID());
        MainApp.form.setDeviceTag(MainApp.appInfo.getTagName());
        MainApp.form.setAppver(MainApp.appInfo.getAppVersion());
        MainApp.setGPS(this);
        // TODO: From now on we will save GPS as JSON
        // MainApp.setGPS({"gpsLng":"12444",...});
    }
}