package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.contracts.ChildInformationContract;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection02cbBinding;
import edu.aku.hassannaqvi.naunehal.ui.MainActivity;

public class Section02CBActivity extends AppCompatActivity {

    ActivitySection02cbBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_02cb);

        // TODO: Move this line to onCreate of childlist activity (recycler) and implement fetchChildrenByUUID() from TABLE_FAMILY in Database.
//        MainApp.childInfo = new ChildInfo();

        // TODO: After itemClick on childlist fetchChildByUID() from TABLE_FAMILY and update contents MainApp.Family before entering this activity.
        bi.setChildInformation(MainApp.childInformation);
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
        if (UpdateDB()) {
            ChildrenListActivity.Companion.setSerial(Integer.parseInt(MainApp.childInformation.cb01) + 1);
            finish();
            startActivity(new Intent(this, Section03CSActivity.class));
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.dbHelper;
        Long updcount = db.addChildInformation(MainApp.childInformation);
        MainApp.childInformation.setId(updcount.toString());
        if (updcount > 0) {
            MainApp.childInformation.setUid(MainApp.childInformation.getDeviceId() + MainApp.childInformation.getId());
            int count = db.updatesChildInformationColumn(ChildInformationContract.ChildInfoTable.COLUMN_UID, MainApp.childInformation.getUid());
            if (count > 0)
                count = db.updatesChildInformationColumn(ChildInformationContract.ChildInfoTable.COLUMN_SCB, MainApp.childInformation.sCBtoString());
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
        return Validator.emptyCheckingContainer(this, bi.GrpName);

    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


}