package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.contracts.ChildInformationContract;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection02cbBinding;
import edu.aku.hassannaqvi.naunehal.ui.MainActivity;
import edu.aku.hassannaqvi.naunehal.utils.datecollection.AgeModel;
import edu.aku.hassannaqvi.naunehal.utils.datecollection.DateRepository;

import static edu.aku.hassannaqvi.naunehal.utils.AppUtilsKt.openSectionEndingActivity;
import static edu.aku.hassannaqvi.naunehal.utils.AppUtilsKt.openWarningDialog;

public class Section02CBActivity extends AppCompatActivity {

    ActivitySection02cbBinding bi;
    boolean dtFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_02cb);
        bi.setCallback(this);

        // TODO: Move this line to onCreate of childlist activity (recycler) and implement fetchChildrenByUUID() from TABLE_FAMILY in Database.
//        MainApp.childInfo = new ChildInfo();

        // TODO: After itemClick on childlist fetchChildByUID() from TABLE_FAMILY and update contents MainApp.Family before entering this activity.
        bi.setChildInformation(MainApp.childInformation);
        setupSkips();

        /*
         * Setup Listeners
         * */
        EditText[] txtListener = new EditText[]{bi.cb04dd, bi.cb04mm};
        for (EditText txtItem : txtListener) {

            txtItem.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    bi.cb0501.setText(null);
                    bi.cb0502.setText(null);
                    bi.cb04yy.setText(null);
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
        }
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
        initForm();
        // SaveDraft(); //<== This function is no longer needed after DataBinding
        if (UpdateDB()) {
            ChildrenListActivity.Companion.setSerial(Integer.parseInt(MainApp.childInformation.cb01) + 1);
            finish();
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
        if (!Validator.emptyCheckingContainer(this, bi.GrpName))
            return false;
        int totalMonths = Integer.parseInt(bi.cb0501.getText().toString()) * 12 + Integer.parseInt(bi.cb0502.getText().toString());
        if (totalMonths > 59) {
            openWarningDialog(this, "Warning", "Add children having age of less then or equal to 59 Months");
            return false;
        }
        return true;
    }

    public void BtnEnd(View view) {
        finish();
    }


    // Only in First Section of every Table.
    public void initForm() {
        MainApp.childInformation.setSysDate(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.childInformation.setUuid(MainApp.form.getUid());
        MainApp.childInformation.setUserName(MainApp.user.getUserName());
        MainApp.childInformation.setDcode(MainApp.form.getDcode());
        MainApp.childInformation.setUcode(MainApp.form.getUcode());
        MainApp.childInformation.setCluster(MainApp.form.getCluster());
        MainApp.childInformation.setHhno(MainApp.form.getHhno());
        MainApp.childInformation.setDeviceId(MainApp.appInfo.getDeviceID());
        MainApp.childInformation.setDeviceTag(MainApp.appInfo.getTagName());
        MainApp.childInformation.setAppver(MainApp.appInfo.getAppVersion());
    }


    public void cb04yyOnTextChanged(CharSequence s, int start, int before, int count) {
        bi.cb0502.setEnabled(false);
        bi.cb0502.setText(null);
        bi.cb0501.setEnabled(false);
        bi.cb0501.setText(null);
        MainApp.childInformation.setCalculatedDOB(null);
        if (TextUtils.isEmpty(bi.cb04dd.getText()) || TextUtils.isEmpty(bi.cb04mm.getText()) || TextUtils.isEmpty(bi.cb04yy.getText()))
            return;
        if (!bi.cb04dd.isRangeTextValidate() || !bi.cb04mm.isRangeTextValidate() || !bi.cb04yy.isRangeTextValidate())
            return;
        if (bi.cb04dd.getText().toString().equals("98") && bi.cb04mm.getText().toString().equals("98") && bi.cb04yy.getText().toString().equals("9998")) {
            bi.cb0502.setEnabled(true);
            bi.cb0501.setEnabled(true);
            dtFlag = true;
            return;
        }
        int day = bi.cb04dd.getText().toString().equals("98") ? 15 : Integer.parseInt(bi.cb04dd.getText().toString());
        int month = Integer.parseInt(bi.cb04mm.getText().toString());
        int year = Integer.parseInt(bi.cb04yy.getText().toString());

        AgeModel age;
        if (MainApp.form.getLocalDate() != null)
            age = DateRepository.Companion.getCalculatedAge(MainApp.form.getLocalDate(), year, month, day);
        else
            age = DateRepository.Companion.getCalculatedAge(year, month, day);
        if (age == null) {
            bi.cb04yy.setError("Invalid date!!");
            dtFlag = false;
            return;
        }
        dtFlag = true;
        bi.cb0502.setText(String.valueOf(age.getMonth()));
        bi.cb0501.setText(String.valueOf(age.getYear()));

        //Setting Date
        try {
            Instant instant = Instant.parse(new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(
                    day + "-" + month + "-" + year
            )) + "T06:24:01Z");
            MainApp.childInformation.setCalculatedDOB(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}