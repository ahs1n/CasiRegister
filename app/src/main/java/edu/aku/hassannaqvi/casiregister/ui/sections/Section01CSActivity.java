package edu.aku.hassannaqvi.casiregister.ui.sections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.casiregister.R;
import edu.aku.hassannaqvi.casiregister.core.MainApp;
import edu.aku.hassannaqvi.casiregister.databinding.ActivitySection01CsBinding;

public class Section01CSActivity extends AppCompatActivity {

    ActivitySection01CsBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section01_cs);

        bi.setForm(MainApp.form);
    }
}