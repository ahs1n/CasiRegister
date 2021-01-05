package edu.aku.hassannaqvi.naunehal.contracts;


import android.provider.BaseColumns;

public class VillageContract {

    private static final String TAG = "Village_CONTRACT";

    public static abstract class VillageTable implements BaseColumns {

        public static final String TABLE_NAME = "villages";
        public static final String COLUMN_DCODE = "dist_code";
        public static final String COLUMN_VCODE = "village_code";
        public static final String COLUMN_VNAME = "village_name";

        public static final String _URI = "villages.php";
    }
}