package edu.aku.hassannaqvi.naunehal.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection04imBinding;

import android.os.Bundle;

public class Section04IMActivity extends AppCompatActivity {

    ActivitySection04imBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section
        //MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04im);
        bi.setForm(MainApp.form);
//        setupSkips();
    }
}