package edu.aku.hassannaqvi.naunehal.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection06bfBinding;

import android.os.Bundle;

public class Section06BFActivity extends AppCompatActivity {

    ActivitySection06bfBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section
        //MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_06bf);
        bi.setForm(MainApp.form);
//        setupSkips();
    }
}