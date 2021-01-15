package edu.aku.hassannaqvi.casiregister.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.casiregister.R;
import edu.aku.hassannaqvi.casiregister.contracts.FormsContract;
import edu.aku.hassannaqvi.casiregister.core.MainApp;
import edu.aku.hassannaqvi.casiregister.database.DatabaseHelper;
import edu.aku.hassannaqvi.casiregister.databinding.ActivitySection07cvBinding;
import edu.aku.hassannaqvi.casiregister.ui.MainActivity;

import static edu.aku.hassannaqvi.casiregister.core.MainApp.form;

public class Section07CVActivity extends AppCompatActivity {

    ActivitySection07cvBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_07cv);
        bi.setForm(MainApp.form);
        setupSkips();

    }


    private void setupSkips() {
        rgListener(bi.cv01, bi.cv0102, bi.llcv01);
        rgListener(bi.cv11, bi.cv1102, bi.fldGrpCVcv12);
        rgListener(bi.cv17, bi.cv1702, bi.fldGrpCVcv18);
    }


    private void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) vg.setVisibility(View.GONE);
        });
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_S07CV, form.s07CVtoString());
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
            startActivity(new Intent(this, Section081SEActivity.class));
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