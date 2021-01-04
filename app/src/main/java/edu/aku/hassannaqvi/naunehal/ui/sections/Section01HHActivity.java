package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;

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
        rgListener(bi.hh11, bi.hh1102, bi.llhh11);
        rgListener(bi.hh18, bi.hh1801, bi.llhh18);
    }


    public void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) vg.setVisibility(View.GONE);
        });
    }


    public void BtnContinue(View view) {
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
        // TODO: need work on appinfo
        //ainApp.form.setSysDate(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(new Date().getTime()));
        //ainApp.form.setUserName(MainApp.userName);
        //ainApp.form.setDeviceId(MainApp.appInfo.getDeviceID());
        //ainApp.form.setDeviceTag(MainApp.appInfo.getTagName());
        //ainApp.form.setAppver(MainApp.appInfo.getAppVersion());
        //ainApp.setGPS(this);
        // TODO: From now on we will save GPS as JSON
        // MainApp.setGPS({"gpsLng":"12444",...});
    }
}