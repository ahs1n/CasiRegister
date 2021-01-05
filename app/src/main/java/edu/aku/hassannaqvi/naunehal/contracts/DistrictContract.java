package edu.aku.hassannaqvi.naunehal.contracts;


import android.provider.BaseColumns;

public class DistrictContract {

    private static final String TAG = "District_CONTRACT";


    public static abstract class DistrictTable implements BaseColumns {

        public static final String TABLE_NAME = "districts";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_NAME = "districtNode";

        public static final String _URI = "districts.php";
    }
}