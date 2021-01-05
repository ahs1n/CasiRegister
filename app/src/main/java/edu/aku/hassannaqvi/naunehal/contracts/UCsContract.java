package edu.aku.hassannaqvi.naunehal.contracts;


import android.provider.BaseColumns;

public class UCsContract {

    private static final String TAG = "UCs_CONTRACT";

    public static abstract class TableUCs implements BaseColumns {
        public static final String _ID = "_id";
        public static final String TABLE_NAME = "ucs";
        public static final String COLUMN_UC_CODE = "uc_id";
        public static final String COLUMN_UC_NAME = "uc_name";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_id";

        public static final String _URI = "ucs.php";
    }
}