package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.naunehal.models.Form;

public class SectionAActivity extends AppCompatActivity {

    ActivitySectionABinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a);
        MainApp.form = new Form();
        bi.setForm(MainApp.form);
        setupSkips();
    }

    private void setupSkips() {

    }
}