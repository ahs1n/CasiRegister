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
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection02cbBinding;
import edu.aku.hassannaqvi.naunehal.models.Family;
import edu.aku.hassannaqvi.naunehal.ui.MainActivity;

public class Section02CBActivity extends AppCompatActivity {

    ActivitySection02cbBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_02cb);

        // TODO: Move this line to onCreate of childlist activity (recycler) and implement fetchChildrenByUUID() from TABLE_FAMILY in Database.
        MainApp.family = new Family();

        // TODO: After itemClick on childlist fetchChildByUID() from TABLE_FAMILY and update contents MainApp.Family before entering this activity.
        bi.setFamily(MainApp.family);
        setupSkips();

    }

    private void setupSkips() {

        bi.cb06.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVcb07);
            Clear.clearAllFields(bi.fldGrpCVcb08);
            Clear.clearAllFields(bi.fldGrpCVcb09);
            Clear.clearAllFields(bi.fldGrpCVcb12);
            Clear.clearAllFields(bi.fldGrpCVcb13);
            bi.fldGrpCVcb07.setVisibility(View.VISIBLE);
            bi.fldGrpCVcb08.setVisibility(View.VISIBLE);
            bi.fldGrpCVcb09.setVisibility(View.VISIBLE);
            bi.fldGrpCVcb12.setVisibility(View.VISIBLE);
            bi.fldGrpCVcb13.setVisibility(View.VISIBLE);
            if (i == bi.cb0601.getId()) {
                bi.fldGrpCVcb07.setVisibility(View.GONE);
                bi.fldGrpCVcb08.setVisibility(View.GONE);
                bi.fldGrpCVcb09.setVisibility(View.GONE);
            } else if (i == bi.cb0602.getId()) {
                bi.fldGrpCVcb12.setVisibility(View.GONE);
                bi.fldGrpCVcb13.setVisibility(View.GONE);
            }
        });

    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        // SaveDraft(); //<== This function is no longer needed after DataBinding
        if (/*UpdateDB()*/ true) {
            finish();
            startActivity(new Intent(this, Section03CSActivity.class));
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