package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection04imBinding;
import edu.aku.hassannaqvi.naunehal.ui.MainActivity;

public class Section04IMActivity extends AppCompatActivity {

    ActivitySection04imBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section
        //MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04im);
        bi.setForm(MainApp.form);
        setupSkips();

    }

    private void setupSkips() {

        bi.im02.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVim01);
            Clear.clearAllFields(bi.fldGrpCVim03);
            bi.fldGrpCVim01.setVisibility(View.GONE);
            bi.fldGrpCVim03.setVisibility(View.GONE);
            if (i == bi.im021.getId()) {
                bi.fldGrpCVim01.setVisibility(View.VISIBLE);
            }
            if (i == bi.im022.getId()) {
                bi.fldGrpCVim03.setVisibility(View.VISIBLE);
            }
        });

    }


    public void BtnContinue() {
        if (!formValidation()) return;

        // SaveDraft(); //<== This function is no longer needed after DataBinding
        if (/*UpdateDB()*/ true) {
            finish();
            startActivity(new Intent(this, Section05PDActivity.class));
        }
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);

    }


    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


}