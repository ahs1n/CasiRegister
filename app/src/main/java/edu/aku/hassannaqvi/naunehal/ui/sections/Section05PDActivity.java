package edu.aku.hassannaqvi.naunehal.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection05pdBinding;

import android.os.Bundle;

public class Section05PDActivity extends AppCompatActivity {

    ActivitySection05pdBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section
        //MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_05pd);
        bi.setForm(MainApp.form);
//        setupSkips();
    }
}