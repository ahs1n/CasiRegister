package edu.aku.hassannaqvi.casiregister.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.casiregister.R;
import edu.aku.hassannaqvi.casiregister.contracts.FormsContract;
import edu.aku.hassannaqvi.casiregister.core.MainApp;
import edu.aku.hassannaqvi.casiregister.database.DatabaseHelper;
import edu.aku.hassannaqvi.casiregister.databinding.ActivitySection05pdBinding;
import edu.aku.hassannaqvi.casiregister.ui.MainActivity;

import static edu.aku.hassannaqvi.casiregister.core.MainApp.form;

public class Section05PDActivity extends AppCompatActivity {

    ActivitySection05pdBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section
        //MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_05pd);
        bi.setForm(form);
        setupSkips();

    }


    private void setupSkips() {

        bi.pd04.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVpd05);
            Clear.clearAllFields(bi.fldGrpCVpd06);
            Clear.clearAllFields(bi.fldGrpCVpd07);
            bi.fldGrpCVpd05.setVisibility(View.VISIBLE);
            bi.fldGrpCVpd06.setVisibility(View.VISIBLE);
            bi.fldGrpCVpd07.setVisibility(View.VISIBLE);
            if (i == bi.pd0402.getId()) {
                bi.fldGrpCVpd05.setVisibility(View.GONE);
                bi.fldGrpCVpd06.setVisibility(View.GONE);
                bi.fldGrpCVpd07.setVisibility(View.GONE);
            }
        });

        bi.pd09.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVpd10);
            Clear.clearAllFields(bi.fldGrpCVpd11);
            bi.fldGrpCVpd10.setVisibility(View.VISIBLE);
            bi.fldGrpCVpd11.setVisibility(View.VISIBLE);
            if (i == bi.pd0902.getId()) {
                bi.fldGrpCVpd10.setVisibility(View.GONE);
                bi.fldGrpCVpd11.setVisibility(View.GONE);
            }
        });

        bi.pd13.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVpd14);
            bi.fldGrpCVpd14.setVisibility(View.VISIBLE);
            if (i == bi.pd1301.getId() || i == bi.pd1302.getId()) {
                bi.fldGrpCVpd14.setVisibility(View.GONE);
            }
        });

        bi.pd15.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVpd16);
            Clear.clearAllFields(bi.fldGrpCVpd17);
            Clear.clearAllFields(bi.fldGrpCVpd18);
            bi.fldGrpCVpd16.setVisibility(View.GONE);
            bi.fldGrpCVpd17.setVisibility(View.GONE);
            bi.fldGrpCVpd18.setVisibility(View.GONE);
            if (i == bi.pd1501.getId()) {
                bi.fldGrpCVpd16.setVisibility(View.VISIBLE);
                bi.fldGrpCVpd17.setVisibility(View.VISIBLE);
                bi.fldGrpCVpd18.setVisibility(View.VISIBLE);
            }
        });

        bi.pd19.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVpd20);
            Clear.clearAllFields(bi.fldGrpCVpd21);
            Clear.clearAllFields(bi.fldGrpCVpd22);
            bi.fldGrpCVpd20.setVisibility(View.GONE);
            bi.fldGrpCVpd21.setVisibility(View.GONE);
            bi.fldGrpCVpd22.setVisibility(View.GONE);
            if (i == bi.pd1901.getId()) {
                bi.fldGrpCVpd20.setVisibility(View.VISIBLE);
                bi.fldGrpCVpd21.setVisibility(View.VISIBLE);
                bi.fldGrpCVpd22.setVisibility(View.VISIBLE);
            }
        });

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_S05PD, form.s05PDtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, Section06BFActivity.class));
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);

    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }

}