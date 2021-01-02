package edu.aku.hassannaqvi.naunehal.ui.sections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.naunehal.R;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.databinding.ActivitySection01hhBinding;
import edu.aku.hassannaqvi.naunehal.models.Form;

public class Section01HHActivity extends AppCompatActivity {

    ActivitySection01hhBinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // only in First Section
        MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_01hh);
        bi.setForm(MainApp.form);
        setupSkips();
    }

    private void setupSkips() {

    }
}