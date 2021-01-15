package edu.aku.hassannaqvi.casiregister.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import edu.aku.hassannaqvi.casiregister.R;
import edu.aku.hassannaqvi.casiregister.core.MainApp;
import edu.aku.hassannaqvi.casiregister.databinding.ActivitySection04imBinding;
import edu.aku.hassannaqvi.casiregister.ui.MainActivity;
import edu.aku.hassannaqvi.casiregister.ui.TakePhoto;
import edu.aku.hassannaqvi.casiregister.utils.DateUtilsKt;
import edu.aku.hassannaqvi.casiregister.utils.datecollection.AgeModel;
import edu.aku.hassannaqvi.casiregister.utils.datecollection.DateRepository;
import kotlin.Pair;

import static edu.aku.hassannaqvi.casiregister.core.MainApp.form;

public class Section04IMActivity extends AppCompatActivity {

    ActivitySection04imBinding bi;
    boolean im01Flag = false, imFlag = true, daysFlag = true;
    private LocalDate calculatedDOB = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04im);
        bi.setForm(MainApp.immunization);
        setupSkips();
        setupTextWatchers();

        /*
         * Setting DOB boundry
         * */
        if (form.getLocalDate() != null) {
            int maxYears = form.getLocalDate().getYear();
            int minYears = form.getLocalDate().minusYears(3).getYear();
            bi.im04yy.setMinvalue(minYears);
            bi.im04yy.setMaxvalue(maxYears);
        }

    }

    private void setupSkips() {

        bi.im01.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.im0101.getId()) {
                bi.fldGrpCVim02.setVisibility(View.VISIBLE);

                Clear.clearAllFields(bi.fldGrpCVim03);
                bi.fldGrpCVim03.setVisibility(View.GONE);
                Clear.clearAllFields(bi.llim01);
                bi.llim01.setVisibility(View.GONE);
                Clear.clearAllFields(bi.fldGrpDOBCheck03);
                bi.fldGrpDOBCheck03.setVisibility(View.GONE);

            } else if (i == bi.im0102.getId()) {
                bi.fldGrpCVim03.setVisibility(View.VISIBLE);
                bi.fldGrpDOBCheck03.setVisibility(View.VISIBLE);

                bi.llim01.setVisibility(View.GONE);
                Clear.clearAllFields(bi.llim01);
                Clear.clearAllFields(bi.fldGrpCVim02);
                bi.fldGrpCVim02.setVisibility(View.GONE);
            }
        });

        bi.im02.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.im0201.getId()) {
                bi.fldGrpDOBCheck03.setVisibility(View.GONE);
                Clear.clearAllFields(bi.fldGrpDOBCheck03);
                bi.fldGrpCVim03.setVisibility(View.GONE);
                Clear.clearAllFields(bi.fldGrpCVim03);
                bi.llim01.setVisibility(View.VISIBLE);
            } else if (i == bi.im0202.getId()) {
                bi.fldGrpDOBCheck03.setVisibility(View.VISIBLE);
                bi.llim01.setVisibility(View.GONE);
                bi.fldGrpCVim03.setVisibility(View.GONE);
                Clear.clearAllFields(bi.fldGrpCVim03);
                Clear.clearAllFields(bi.llim01);
                bi.frontFileName.setText(null);
                bi.backFileName.setText(null);
            }
        });

        bi.im04yy.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calculatedDOB = null;
                if (!bi.im0201.isChecked()) return;
                String txt01, txt02, txt03;
                bi.im04dd.setEnabled(true);
                bi.im04mm.setEnabled(true);
                if (!TextUtils.isEmpty(bi.im04dd.getText()) && !TextUtils.isEmpty(bi.im04mm.getText()) && !TextUtils.isEmpty(bi.im04yy.getText())) {
                    txt01 = bi.im04dd.getText().toString();
                    txt02 = bi.im04mm.getText().toString();
                    txt03 = bi.im04yy.getText().toString();
                } else return;
                if ((!bi.im04dd.isRangeTextValidate()) ||
                        (!bi.im04mm.isRangeTextValidate()) ||
                        (!bi.im04yy.isRangeTextValidate()))
                    return;
                int day = bi.im04dd.getText().toString().equals("98") ? 15 : Integer.parseInt(txt01);
                int month = Integer.parseInt(txt02);
                int year = Integer.parseInt(txt03);

                AgeModel age;
                if (form.getLocalDate() != null)
                    age = DateRepository.Companion.getCalculatedAge(form.getLocalDate(), year, month, day);
                else
                    age = DateRepository.Companion.getCalculatedAge(year, month, day);
                if (age == null) {
                    bi.im04yy.setError("Invalid date!!");
                    im01Flag = false;
                } else {
                    im01Flag = true;
                    bi.im04dd.setEnabled(false);
                    bi.im04mm.setEnabled(false);
                    try {
                        Instant dtInstant = Instant.parse(new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MM-yyyy").parse(
                                day + "-" + month + "-" + year
                        )) + "T06:24:01Z");

                        calculatedDOB = LocalDateTime.ofInstant(dtInstant, ZoneId.systemDefault()).toLocalDate();

                        //Calculate months
                        boolean monthFlag = true;
                        if (calculatedDOB != null) {
                            Pair<String, String> month_year;
                            if (bi.im0201.isChecked())
                                month_year = getMonthAndYearFromDate(LocalDateTime.ofInstant(dtInstant, ZoneId.systemDefault()).toLocalDate().toString());
                            else month_year = getMonthAndYearFromDate(calculatedDOB.toString());
                            int totalMonths = Integer.parseInt(month_year.getFirst()) + Integer.parseInt(month_year.getSecond()) * 12;
                            monthFlag = totalMonths > 35;
                            if (monthFlag) {
                                bi.fldGrpDOBCheck01.setVisibility(View.GONE);
                                bi.fldGrpDOBCheck02.setVisibility(View.GONE);
                                bi.fldGrpDOBCheck03.setVisibility(View.GONE);
                            } else {
                                bi.fldGrpDOBCheck01.setVisibility(View.VISIBLE);
                                bi.fldGrpDOBCheck02.setVisibility(View.VISIBLE);
                                bi.fldGrpDOBCheck03.setVisibility(View.VISIBLE);
                            }
                        }

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        if (calculatedDOB == null) {
            Clear.clearAllFields(bi.fldGrpDOBCheck01);
            Clear.clearAllFields(bi.fldGrpDOBCheck02);
            Clear.clearAllFields(bi.fldGrpDOBCheck03);
        }


        // SaveDraft(); //<== This function is no longer needed after DataBinding
        if (/*UpdateDB()*/ true) {
            finish();
            startActivity(new Intent(this, Section05PDActivity.class));
        }
    }


    private boolean formValidation() {
        if (!im01Flag) {
            Toast.makeText(this, "Invalid DOB date!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!imFlag) {
            Toast.makeText(this, "Invalid vaccination date!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (bi.im0201.isChecked() && (TextUtils.isEmpty(bi.frontFileName.getText()) || TextUtils.isEmpty(bi.backFileName.getText()))) {
            Toast.makeText(this, "No Photos attached", Toast.LENGTH_SHORT).show();
            return false;
        }
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


    public void takePhoto(int id) {

        Intent intent = new Intent(this, TakePhoto.class);

        intent.putExtra("picID", MainApp.child.getCluster() + "_" + MainApp.child.getHhno() + "_" + MainApp.child.getSerial() + "_");
        intent.putExtra("childName", MainApp.child.getChildname());

        if (id == 1) {
            intent.putExtra("picView", "front".toUpperCase());
            startActivityForResult(intent, 1); // Activity is started with requestCode 1 = Front
        } else {
            intent.putExtra("picView", "back".toUpperCase());
            startActivityForResult(intent, 2); // Activity is started with requestCode 2 = Back
        }
    }


    // Call Back method  to get the Message form other Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_CANCELED) {
            Toast.makeText(this, requestCode + "_" + resultCode, Toast.LENGTH_SHORT).show();

            String fileName = data.getStringExtra("FileName");

            // Check if the requestCode 1 = Front : 2 = Back -- resultCode 1 = Success : 2 = Failure
            // Results received with requestCode 1 = Front

            if (requestCode == 1 && resultCode == 1) {
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();

                bi.frontFileName.setText(fileName);
                bi.frontPhoto.setEnabled(false);


            } else if (requestCode == 1 && resultCode != 1) {
                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                //TODO: Implement functionality below when photo was not taken
                // ...
                bi.frontFileName.setText("Photo not taken.");

            }

            // Results received with requestCode 2 = Back
            if (requestCode == 2 && resultCode == 1) {
                Toast.makeText(this, "Photo Taken", Toast.LENGTH_SHORT).show();

                bi.backFileName.setText(fileName);
                bi.backPhoto.setEnabled(false);
            } else if (requestCode == 2 && resultCode != 1) {

                Toast.makeText(this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                //TODO: Implement functionality below when photo was not taken
                // ...
                bi.backFileName.setText("Photo not taken.");

            }
        }
    }

    private Pair<String, String> getMonthAndYearFromDate(String date) {
        Calendar cal = DateUtilsKt.getCalendarDate(date.replace("-", "/"));
        int curdate = form.getLocalDate().getDayOfMonth();
        int curmonth = form.getLocalDate().getMonthValue();
        int curyear = form.getLocalDate().getYear();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);

        if (day > curdate) {
            curmonth -= 1;
        }
        if (month > curmonth) {
            curyear -= 1;
            curmonth += 12;
        }
        return new Pair<>(String.valueOf(curmonth - month), String.valueOf(curyear - year));
    }


    private LocalDate getLocalDate(EditTextPicker[] editTextsArray) {
        if (editTextsArray.length < 3) return null;
        EditTextPicker editTextPicker01 = editTextsArray[0];
        EditTextPicker editTextPicker02 = editTextsArray[1];
        EditTextPicker editTextPicker03 = editTextsArray[2];
        if (TextUtils.isEmpty(editTextPicker01.getText()) || TextUtils.isEmpty(editTextPicker02.getText()) || TextUtils.isEmpty(editTextPicker03.getText()))
            return null;
        String txt01 = editTextPicker01.getText().toString();
        if (txt01.trim().equals("44") || txt01.trim().equals("97") || txt01.trim().equals("66") || txt01.trim().equals("88"))
            return null;
        try {
            String txt02 = editTextPicker02.getText().toString();
            String txt03 = editTextPicker03.getText().toString();
            Instant instant = Instant.parse(new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MM-yyyy").parse(
                    txt01 + "-" + txt02 + "-" + txt03
            )) + "T06:24:01Z");
            return LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void clearEditTextFields(ArrayList<EditTextPicker[]> respArrayList) {
        if (respArrayList == null) return;
        for (EditTextPicker[] editItems : respArrayList) {
            for (EditTextPicker items : editItems) {
                items.setText(null);
                items.setError(null);
            }
        }
    }

    private void setupTextWatchers() {

        EditTextPicker[] BCG = new EditTextPicker[]{bi.im0501dd, bi.im0501mm, bi.im0501yy};
        editTextImplementation("BCG", BCG, null, null);

        EditTextPicker[] OPV0 = new EditTextPicker[]{bi.im0502dd, bi.im0502mm, bi.im0502yy};
        EditTextPicker[] OPV1 = new EditTextPicker[]{bi.im0503dd, bi.im0503mm, bi.im0503yy};
        EditTextPicker[] OPV2 = new EditTextPicker[]{bi.im0507dd, bi.im0507mm, bi.im0507yy};
        EditTextPicker[] OPV3 = new EditTextPicker[]{bi.im0511dd, bi.im0511mm, bi.im0511yy};
        editTextImplementation("OPV0", OPV0, null, new ArrayList<EditTextPicker[]>() {
            {
                add(OPV1);
                add(OPV2);
                add(OPV3);
            }
        });
        editTextImplementation("OPV1", OPV1, OPV0, null);
        editTextImplementation("OPV2", OPV2, OPV1, null);
        editTextImplementation("OPV3", OPV3, OPV2, null);

        EditTextPicker[] PENTA1 = new EditTextPicker[]{bi.im0504dd, bi.im0504mm, bi.im0504yy};
        EditTextPicker[] PENTA2 = new EditTextPicker[]{bi.im0508dd, bi.im0508mm, bi.im0508yy};
        EditTextPicker[] PENTA3 = new EditTextPicker[]{bi.im0512dd, bi.im0512mm, bi.im0512yy};
        editTextImplementation("PENTA1", PENTA1, null, new ArrayList<EditTextPicker[]>() {
            {
                add(PENTA2);
                add(PENTA3);
            }
        });
        editTextImplementation("PENTA2", PENTA2, PENTA1, null);
        editTextImplementation("PENTA3", PENTA3, PENTA2, null);

        EditTextPicker[] PCV1 = new EditTextPicker[]{bi.im0505dd, bi.im0505mm, bi.im0505yy};
        EditTextPicker[] PCV2 = new EditTextPicker[]{bi.im0509dd, bi.im0509mm, bi.im0509yy};
        EditTextPicker[] PCV3 = new EditTextPicker[]{bi.im0513dd, bi.im0513mm, bi.im0513yy};
        editTextImplementation("PCV1", PCV1, null, new ArrayList<EditTextPicker[]>() {
            {
                add(PCV2);
                add(PCV3);
            }
        });
        editTextImplementation("PCV2", PCV2, PCV1, null);
        editTextImplementation("PCV3", PCV3, PCV2, null);

        EditTextPicker[] RV1 = new EditTextPicker[]{bi.im0506dd, bi.im0506mm, bi.im0506yy};
        EditTextPicker[] RV2 = new EditTextPicker[]{bi.im0510dd, bi.im0510mm, bi.im0510yy};
        editTextImplementation("RV1", RV1, null, new ArrayList<EditTextPicker[]>() {
            {
                add(RV2);
            }
        });
        editTextImplementation("RV2", RV2, RV1, null);

        EditTextPicker[] IPV = new EditTextPicker[]{bi.im0514dd, bi.im0514mm, bi.im0514yy};
        editTextImplementation("IPV", IPV, null, null);

        EditTextPicker[] MEASLES1 = new EditTextPicker[]{bi.im0515dd, bi.im0515mm, bi.im0515yy};
        EditTextPicker[] MEASLES2 = new EditTextPicker[]{bi.im0516dd, bi.im0516mm, bi.im0516yy};
        editTextImplementation("MEASLES1", MEASLES1, null, new ArrayList<EditTextPicker[]>() {
            {
                add(MEASLES2);
            }
        });
        editTextImplementation("MEASLES2", MEASLES2, MEASLES1, null);
    }

    public void editTextImplementation(String type, EditTextPicker[] editTextsArray, EditTextPicker[] respTextsArray, ArrayList<EditTextPicker[]> respArrayList) {
        if (editTextsArray.length != 3) return;
        EditTextPicker editTextPicker01 = editTextsArray[0];
        EditTextPicker editTextPicker02 = editTextsArray[1];
        EditTextPicker editTextPicker03 = editTextsArray[2];

        if (calculatedDOB != null) {
            int minYears = calculatedDOB.getYear();
            int maxYears = form.getLocalDate().getYear();
            editTextPicker03.setMinvalue(minYears);
            editTextPicker03.setMaxvalue(maxYears);
        }

        editTextPicker01.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                editTextPicker03.setText(null);
                editTextPicker03.setError(null);

                editTextPicker02.setEnabled(true);
                editTextPicker03.setEnabled(true);

                daysFlag = true;
                imFlag = true;

                String txt01;
                if (!TextUtils.isEmpty(editTextPicker01.getText())) {
                    txt01 = editTextPicker01.getText().toString();

                    if (txt01.trim().equals("44") || txt01.trim().equals("97") || txt01.trim().equals("66") || txt01.trim().equals("88")) {
                        editTextPicker02.setText(null);
                        editTextPicker03.setText(null);
                        editTextPicker02.setEnabled(false);
                        editTextPicker03.setEnabled(false);
                        editTextPicker01.setRangedefaultvalue(Float.parseFloat(txt01));

                        daysFlag = false;
                        imFlag = true;
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextPicker02.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                editTextPicker03.setText(null);
                editTextPicker03.setError(null);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextPicker03.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    String txt01, txt02, txt03;
                    LocalDate respLocalDate = null;
                    if (!daysFlag) return;
                    editTextPicker01.setEnabled(true);
                    editTextPicker02.setEnabled(true);
                    if (!TextUtils.isEmpty(editTextPicker01.getText()) && !TextUtils.isEmpty(editTextPicker02.getText()) && !TextUtils.isEmpty(editTextPicker03.getText())) {
                        txt01 = editTextPicker01.getText().toString();
                        txt02 = editTextPicker02.getText().toString();
                        txt03 = editTextPicker03.getText().toString();
                    } else return;
                    clearEditTextFields(respArrayList);
                    if (respTextsArray != null) {
                        respLocalDate = getLocalDate(respTextsArray);
                        int minYears, maxYears;
                        if (respLocalDate != null) {
                            minYears = respLocalDate.getYear();
                        } else {
                            minYears = calculatedDOB.getYear();
                        }
                        maxYears = form.getLocalDate().getYear();
                        editTextPicker03.setMinvalue(minYears);
                        editTextPicker03.setMaxvalue(maxYears);
                    }
                    if ((!editTextPicker01.isRangeTextValidate() || txt01.trim().equals("44") || txt01.trim().equals("97") || txt01.trim().equals("66") || txt01.trim().equals("88")) ||
                            (!editTextPicker02.isRangeTextValidate()) ||
                            (!editTextPicker03.isRangeTextValidate()))
                        return;
                    int day = Integer.parseInt(txt01);
                    int month = Integer.parseInt(txt02);
                    int year = Integer.parseInt(txt03);

                    AgeModel age;
                    age = DateRepository.Companion.getCalculatedAge(form.getLocalDate(), Integer.parseInt(editTextsArray[2].getText().toString()), Integer.parseInt(editTextsArray[1].getText().toString()), Integer.parseInt(editTextsArray[0].getText().toString()));
                    if (age == null) {
                        editTextPicker03.setError("Invalid date");
                        imFlag = false;
                        return;
                    }
                    if (respLocalDate != null) {
                        age = DateRepository.Companion.getCalculatedAge(Objects.requireNonNull(getLocalDate(editTextsArray)), Integer.parseInt(respTextsArray[2].getText().toString()), Integer.parseInt(respTextsArray[1].getText().toString()), Integer.parseInt(respTextsArray[0].getText().toString()), false);
                    } else if (calculatedDOB != null)
                        age = DateRepository.Companion.getCalculatedAge(Objects.requireNonNull(getLocalDate(editTextsArray)), calculatedDOB.getYear(), calculatedDOB.getMonthValue(), calculatedDOB.getDayOfMonth(), type.equals("BCG") || type.equals("OPV0"));
                    else
                        age = DateRepository.Companion.getCalculatedAge(year, month, day);
                    if (age == null) {
                        editTextPicker03.setError("Invalid date");
                        imFlag = false;
                    } else {
                        imFlag = true;
                        editTextPicker01.setEnabled(false);
                        editTextPicker02.setEnabled(false);
                    }
                } catch (Exception ignored) {
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

}