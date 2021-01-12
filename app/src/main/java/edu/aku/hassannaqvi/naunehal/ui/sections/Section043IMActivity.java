package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.contracts.IMContract;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection043imBinding;

import static edu.aku.hassannaqvi.naunehal.core.MainApp.immunization;
import static edu.aku.hassannaqvi.naunehal.utils.AppUtilsKt.openChildEndActivity;


public class Section043IMActivity extends AppCompatActivity {

    ActivitySection043imBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_043im);

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesIM(IMContract.IMTable.COLUMN_SIM, immunization.s04IMtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpSectionCHE);
    }


    public void BtnContinue() {
        if (!formValidation()) return;
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, ChildEndingActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }

    public void BtnEnd() {
        openChildEndActivity(this);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


}
