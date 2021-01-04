package edu.aku.hassannaqvi.naunehal.database;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

import static edu.aku.hassannaqvi.naunehal.core.MainApp.PROJECT_NAME;


/**
 * Created by hassan.naqvi on 10/18/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    // The name of database.
    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    // Change this when you change the database schema.
    private static final int DATABASE_VERSION = 1;
    public static String TAG = "DatabaseHelper";
    public static String DB_FORM_ID;
    public static String DB_NAME = PROJECT_NAME + "_copy.db";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

/*

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a table to hold Listings.
        final String SQL_CREATE_LISTING_TABLE = "CREATE TABLE " + TableListings.TABLE_NAME + " (" +
                TableListings._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                TableListings.COLUMN_NAME_UID + " TEXT, " +
                TableListings.COLUMN_NAME_HHDATETIME + " TEXT, " +
                TableListings.COLUMN_NAME_HH01 + " TEXT, " +
                TableListings.COLUMN_NAME_HH02 + " TEXT, " +
                TableListings.COLUMN_NAME_HH03 + " TEXT, " +
                TableListings.COLUMN_NAME_HH04 + " TEXT, " +
                TableListings.COLUMN_NAME_HH04x + " TEXT, " +
                TableListings.COLUMN_NAME_HH05 + " TEXT, " +
                TableListings.COLUMN_NAME_HH06 + " TEXT, " +
                TableListings.COLUMN_NAME_HH07 + " TEXT, " +
                TableListings.COLUMN_NAME_HH07n + " TEXT, " +
                TableListings.COLUMN_NAME_HH08 + " TEXT, " +
                TableListings.COLUMN_NAME_HH09 + " TEXT, " +
                TableListings.COLUMN_NAME_HH10 + " TEXT, " +
                TableListings.COLUMN_NAME_HH11 + " TEXT, " +
                TableListings.COLUMN_NAME_HH12m + " TEXT, " +
                TableListings.COLUMN_NAME_HH12d + " TEXT, " +
                TableListings.COLUMN_NAME_CHILD_NAME + " TEXT, " +
                TableListings.COLUMN_NAME_DEVICEID + " TEXT, " +
                TableListings.COLUMN_NAME_GPSLat + " TEXT, " +
                TableListings.COLUMN_NAME_GPSLng + " TEXT, " +
                TableListings.COLUMN_NAME_GPSTime + " TEXT, " +
                TableListings.COLUMN_NAME_ROUND + " TEXT, " +
                TableListings.COLUMN_NAME_GPSAccuracy + " TEXT " +
                " );";

        final String SQL_CREATE_DISTRICT_TABLE = "CREATE TABLE " + TableDistricts.TABLE_NAME + " (" +
                TableDistricts._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                TableDistricts.COLUMN_DISTRICT_CODE + " TEXT, " +
                TableDistricts.COLUMN_DISTRICT_NAME + " TEXT " +
                ");";

        final String SQL_CREATE_Cluster_TABLE = "CREATE TABLE " + TableClusters.TABLE_NAME + " (" +
                TableClusters._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                TableClusters.COLUMN_CLUSTER_CODE + " TEXT, " +
                TableClusters.COLUMN_CLUSTER_NAME + " TEXT, " +
                TableClusters.COLUMN_UC_CODE + " TEXT " +
                ");";


        // Do the creating of the databases.
        db.execSQL(SQL_CREATE_LISTING_TABLE);
        db.execSQL(SQL_CREATE_DISTRICT_TABLE);
        db.execSQL(SQL_CREATE_Cluster_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Simply discard all old data and start over when upgrading.
        db.execSQL("DROP TABLE IF EXISTS " + TableListings.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TableDistricts.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TableClusters.TABLE_NAME);
        onCreate(db);
    }

    public Long lastInsertId() {
        Long id = null;
        SQLiteDatabase db = this.getWritableDatabase();
        String qry = "SELECT last_insert_rowid()";
        Cursor c = db.rawQuery(qry, null);
        if (c != null && c.moveToFirst()) {
            id = Long.valueOf(c.getString(0));
            c.close();
        } else {
            id = Long.valueOf(-1);
        }

        return id;
    }

    public Long addForm(ListingContract lc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(TableListings.COLUMN_NAME_UID, lc.getUID());
        values.put(TableListings.COLUMN_NAME_HHDATETIME, lc.getHhDT());
        values.put(TableListings.COLUMN_NAME_HH01, lc.getHh01());
        values.put(TableListings.COLUMN_NAME_HH02, lc.getHh02());
        values.put(TableListings.COLUMN_NAME_HH03, lc.getHh03());

        MainApp.updateCluster(lc.getHh02(), lc.getHh03());
        Log.d(TAG, "ClusterExist (Test): " + sharedPref.getString(lc.getHh02(), "0"));

        values.put(TableListings.COLUMN_NAME_HH04, lc.getHh04());
        values.put(TableListings.COLUMN_NAME_HH04x, lc.getHh04x());
        values.put(TableListings.COLUMN_NAME_HH05, lc.getHh05());
        values.put(TableListings.COLUMN_NAME_HH06, lc.getHh06());
        values.put(TableListings.COLUMN_NAME_HH07, lc.getHh07());
        values.put(TableListings.COLUMN_NAME_HH07n, lc.getHh07n());
        values.put(TableListings.COLUMN_NAME_HH08, lc.getHh08());
        values.put(TableListings.COLUMN_NAME_HH09, lc.getHh09());
        values.put(TableListings.COLUMN_NAME_HH10, lc.getHh10());
        values.put(TableListings.COLUMN_NAME_HH11, lc.getHh11());
        values.put(TableListings.COLUMN_NAME_HH12m, lc.getHh12m());
        values.put(TableListings.COLUMN_NAME_HH12d, lc.getHh12d());
        values.put(TableListings.COLUMN_NAME_CHILD_NAME, lc.getHhChildNm());
        values.put(TableListings.COLUMN_NAME_DEVICEID, lc.getDeviceID());
        values.put(TableListings.COLUMN_NAME_GPSLat, lc.getGPSLat());
        values.put(TableListings.COLUMN_NAME_GPSLng, lc.getGPSLng());
        values.put(TableListings.COLUMN_NAME_GPSTime, lc.getGPSTime());
        values.put(TableListings.COLUMN_NAME_GPSAccuracy, lc.getGPSAcc());
        values.put(TableListings.COLUMN_NAME_ROUND, lc.getRound());

        long newRowId;
        newRowId = db.insert(
                TableListings.TABLE_NAME,
                TableListings.COLUMN_NAME_NULLABLE,
                values);
        DB_FORM_ID = String.valueOf(newRowId);

        return newRowId;
    }

    public Long addDistrict(DistrictsContract dc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(TableDistricts.COLUMN_DISTRICT_CODE, dc.getDistrictCode());
        values.put(TableDistricts.COLUMN_DISTRICT_NAME, dc.getDistrictName());

        long newRowId;
        newRowId = db.insert(
                TableDistricts.TABLE_NAME,
                TableDistricts.COLUMN_NAME_NULLABLE,
                values);

        return newRowId;
    }

    public Collection<ListingContract> getAllListings() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                TableListings._ID,
                TableListings.COLUMN_NAME_UID,
                TableListings.COLUMN_NAME_HHDATETIME,
                TableListings.COLUMN_NAME_HH01,
                TableListings.COLUMN_NAME_HH02,
                TableListings.COLUMN_NAME_HH03,
                TableListings.COLUMN_NAME_HH04,
                TableListings.COLUMN_NAME_HH04x,
                TableListings.COLUMN_NAME_HH05,
                TableListings.COLUMN_NAME_HH06,
                TableListings.COLUMN_NAME_HH07,
                TableListings.COLUMN_NAME_HH07n,
                TableListings.COLUMN_NAME_HH08,
                TableListings.COLUMN_NAME_HH09,
                TableListings.COLUMN_NAME_HH10,
                TableListings.COLUMN_NAME_HH11,
                TableListings.COLUMN_NAME_HH12m,
                TableListings.COLUMN_NAME_HH12d,
                TableListings.COLUMN_NAME_CHILD_NAME,
                TableListings.COLUMN_NAME_DEVICEID,
                TableListings.COLUMN_NAME_GPSLat,
                TableListings.COLUMN_NAME_GPSLng,
                TableListings.COLUMN_NAME_GPSTime,
                TableListings.COLUMN_NAME_GPSAccuracy,
                TableListings.COLUMN_NAME_ROUND
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                TableListings._ID + " ASC";

        Collection<ListingContract> allLC = new ArrayList<ListingContract>();
        try {
            c = db.query(
                    TableListings.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allLC.add(hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allLC;
    }

    public Collection<DistrictsContract> getAllDistricts() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                TableDistricts._ID,
                TableDistricts.COLUMN_DISTRICT_CODE,
                TableDistricts.COLUMN_DISTRICT_NAME
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                TableDistricts._ID + " ASC";

        Collection<DistrictsContract> allDC = new ArrayList<DistrictsContract>();
        try {
            c = db.query(
                    TableDistricts.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                DistrictsContract dc = new DistrictsContract();
                allDC.add(dc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allDC;
    }

    public Collection<ClustersContract> getAllClustersByDistrict(String district_code) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                TableClusters._ID,
                TableClusters.COLUMN_CLUSTER_CODE,
                TableClusters.COLUMN_CLUSTER_NAME,
                TableClusters.COLUMN_UC_CODE
        };

        String whereClause = TableClusters.COLUMN_UC_CODE + " = ?";
        String[] whereArgs = {district_code};
        String groupBy = null;
        String having = null;

        String orderBy =
                TableClusters.COLUMN_CLUSTER_CODE + " ASC";

        Collection<ClustersContract> allPC = new ArrayList<ClustersContract>();
        try {
            c = db.query(
                    TableClusters.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                ClustersContract pc = new ClustersContract();
                allPC.add(pc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allPC;
    }

    private ContentValues getContentValues(ListingContract lc) {
        ContentValues values = new ContentValues();
        values.put(TableListings._ID, lc.getID());
        values.put(TableListings.COLUMN_NAME_UID, lc.getUID());
        values.put(TableListings.COLUMN_NAME_HHDATETIME, lc.getHhDT());
        values.put(TableListings.COLUMN_NAME_HH01, lc.getHh01());
        values.put(TableListings.COLUMN_NAME_HH02, lc.getHh02());
        values.put(TableListings.COLUMN_NAME_HH03, lc.getHh03());
        values.put(TableListings.COLUMN_NAME_HH04, lc.getHh04());
        values.put(TableListings.COLUMN_NAME_HH04x, lc.getHh04x());
        values.put(TableListings.COLUMN_NAME_HH05, lc.getHh05());
        values.put(TableListings.COLUMN_NAME_HH06, lc.getHh06());
        values.put(TableListings.COLUMN_NAME_HH07, lc.getHh07());
        values.put(TableListings.COLUMN_NAME_HH07n, lc.getHh07n());
        values.put(TableListings.COLUMN_NAME_HH08, lc.getHh08());
        values.put(TableListings.COLUMN_NAME_HH09, lc.getHh09());
        values.put(TableListings.COLUMN_NAME_HH10, lc.getHh10());
        values.put(TableListings.COLUMN_NAME_HH11, lc.getHh11());
        values.put(TableListings.COLUMN_NAME_HH12m, lc.getHh12m());
        values.put(TableListings.COLUMN_NAME_HH12d, lc.getHh12d());
        values.put(TableListings.COLUMN_NAME_CHILD_NAME, lc.getHhChildNm());
        values.put(TableListings.COLUMN_NAME_DEVICEID, lc.getDeviceID());
        values.put(TableListings.COLUMN_NAME_GPSLat, lc.getGPSLat());
        values.put(TableListings.COLUMN_NAME_GPSLng, lc.getGPSLng());
        values.put(TableListings.COLUMN_NAME_GPSTime, lc.getGPSTime());
        values.put(TableListings.COLUMN_NAME_GPSAccuracy, lc.getGPSAcc());
        values.put(TableListings.COLUMN_NAME_ROUND, lc.getRound());

        return values;
    }

    private ListingContract hydrate(Cursor c) {
        ListingContract lc = new ListingContract(c.getString(c.getColumnIndex(TableListings._ID)));
        lc.setUID(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_UID))));
        lc.setHhDT(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HHDATETIME))));
        lc.setHh01(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH01))));
        lc.setHh02(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH02))));
        lc.setHh03(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH03))));
        lc.setHh04(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH04))));
        lc.setHh04x(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH04x))));
        lc.setHh05(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH05))));
        lc.setHh06(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH06))));
        lc.setHh07(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH07))));
        lc.setHh07n(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH07n))));
        lc.setHh08(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH08))));
        lc.setHh09(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH09))));
        lc.setHh10(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH10))));
        lc.setHh11(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH11))));
        lc.setHh12m(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH12m))));
        lc.setHh12d(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_HH12d))));
        lc.setHhChildNm(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_CHILD_NAME))));
        lc.setDeviceID(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_DEVICEID))));
        lc.setGPSLat(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_GPSLat))));
        lc.setGPSLng(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_GPSLng))));
        lc.setGPSTime(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_GPSTime))));
        lc.setGPSAcc(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_GPSAccuracy))));
        lc.setRound(String.valueOf(c.getString(c.getColumnIndex(TableListings.COLUMN_NAME_ROUND))));

        return lc;
    }

    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);


        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);


            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {


                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }


    }

    public int syncDistricts(JSONArray Districtslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(DistrictsContract.TableDistricts.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < Districtslist.length(); i++) {

                JSONObject jsonObjectDistrict = Districtslist.getJSONObject(i);

                DistrictsContract District = new DistrictsContract();
                District.sync(jsonObjectDistrict);
                ContentValues values = new ContentValues();

                values.put(TableDistricts.COLUMN_DISTRICT_CODE, District.getDistrictCode());
                values.put(TableDistricts.COLUMN_DISTRICT_NAME, District.getDistrictName());
                long rowID = db.insert(TableDistricts.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncDistrict(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public void syncCluster(JSONArray pcList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableClusters.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = pcList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectCluster = jsonArray.getJSONObject(i);

                ClustersContract pc = new ClustersContract();
                pc.sync(jsonObjectCluster);

                ContentValues values = new ContentValues();

                values.put(TableClusters.COLUMN_CLUSTER_CODE, pc.getClusterCode());
                values.put(TableClusters.COLUMN_CLUSTER_NAME, pc.getClustername());
                values.put(TableClusters.COLUMN_UC_CODE, pc.getUcCode());

                db.insert(TableClusters.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {

        }
    }

    public boolean checkUsers() {

        return true;
    }

*/


    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

}
