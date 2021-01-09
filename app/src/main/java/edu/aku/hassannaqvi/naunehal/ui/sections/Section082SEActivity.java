package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection082seBinding;
import edu.aku.hassannaqvi.naunehal.ui.EndingActivity;
import edu.aku.hassannaqvi.naunehal.ui.MainActivity;

public class Section082SEActivity extends AppCompatActivity {

    ActivitySection082seBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section
        //MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_082se);
        bi.setForm(MainApp.form);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {

        bi.se23.setOnCheckedChangeListener((radioGroup, i) -> {
            bi.llse23.setVisibility(View.VISIBLE);
            if (i == bi.se2302.getId()) {
                Clear.clearAllFields(bi.llse23);
                bi.llse23.setVisibility(View.GONE);
            }
        });


        bi.se25.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(bi.se25.getText()))
                    return;

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        // SaveDraft(); //<== This function is no longer needed after DataBinding
        if (/*UpdateDB()*/ true) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);

    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }



    public void se25OnTextChanged(CharSequence s, int start, int before, int count) {
        if (!bi.se25.isRangeTextValidate())
            return;

        int se25 = Integer.parseInt(bi.se25.getText().toString());

        if (se25 == 0) {
            bi.fldGrpse25.setVisibility(View.GONE);
            Clear.clearAllFields(bi.fldGrpse25);
        } else bi.fldGrpse25.setVisibility(View.VISIBLE);
    }

    public void se26OnTextChanged(CharSequence s, int start, int before, int count) {
        if (!bi.se26.isRangeTextValidate())
            return;

        int se26 = Integer.parseInt(bi.se26.getText().toString());

        if (se26 == 0) {
            bi.fldGrpse26.setVisibility(View.GONE);
            Clear.clearAllFields(bi.fldGrpse26);
        } else bi.fldGrpse26.setVisibility(View.VISIBLE);
    }
}