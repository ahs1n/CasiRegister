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
import edu.aku.hassannaqvi.casiregister.databinding.ActivitySection06bfBinding;
import edu.aku.hassannaqvi.casiregister.ui.MainActivity;

import static edu.aku.hassannaqvi.casiregister.core.MainApp.form;

public class Section06BFActivity extends AppCompatActivity {

    ActivitySection06bfBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section
        //MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_06bf);
        bi.setForm(MainApp.form);
        setupSkips();
    }


    private void setupSkips() {

        bi.bf04.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVbf05);
            Clear.clearAllFields(bi.fldGrpCVbf06);
            Clear.clearAllFields(bi.fldGrpCVbf07);
            Clear.clearAllFields(bi.fldGrpCVbf08);
            Clear.clearAllFields(bi.fldGrpCVbf09);
            Clear.clearAllFields(bi.fldGrpCVbf10);
            bi.fldGrpCVbf05.setVisibility(View.GONE);
            bi.fldGrpCVbf06.setVisibility(View.GONE);
            bi.fldGrpCVbf07.setVisibility(View.GONE);
            bi.fldGrpCVbf08.setVisibility(View.GONE);
            bi.fldGrpCVbf09.setVisibility(View.GONE);
            bi.fldGrpCVbf10.setVisibility(View.GONE);
            if (i == bi.bf0401.getId()) {
                bi.fldGrpCVbf05.setVisibility(View.VISIBLE);
                bi.fldGrpCVbf06.setVisibility(View.VISIBLE);
                bi.fldGrpCVbf07.setVisibility(View.VISIBLE);
                bi.fldGrpCVbf08.setVisibility(View.VISIBLE);
                bi.fldGrpCVbf09.setVisibility(View.VISIBLE);
                bi.fldGrpCVbf10.setVisibility(View.VISIBLE);
            }
        });

        bi.bf06.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVbf07);
            bi.fldGrpCVbf07.setVisibility(View.VISIBLE);
            if (i == bi.bf0601.getId()) {
                bi.fldGrpCVbf07.setVisibility(View.GONE);
            }
        });

        bi.bf08.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVbf09);
            bi.fldGrpCVbf09.setVisibility(View.GONE);
            if (i == bi.bf0801.getId()) {
                bi.fldGrpCVbf09.setVisibility(View.VISIBLE);
            }
        });

        bi.bf10.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVbf11);
            bi.fldGrpCVbf11.setVisibility(View.VISIBLE);
            if (i == bi.bf1001.getId()) {
                bi.fldGrpCVbf11.setVisibility(View.GONE);
            }
        });

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_S06BF, form.s06BFtoString());
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
            startActivity(new Intent(this, Section07CVActivity.class));
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