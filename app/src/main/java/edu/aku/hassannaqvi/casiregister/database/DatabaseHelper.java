package edu.aku.hassannaqvi.casiregister.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

import edu.aku.hassannaqvi.casiregister.contracts.FormsContract;
import edu.aku.hassannaqvi.casiregister.contracts.FormsContract.FormsTable;
import edu.aku.hassannaqvi.casiregister.core.MainApp;
import edu.aku.hassannaqvi.casiregister.models.Form;
import edu.aku.hassannaqvi.casiregister.models.Users;
import edu.aku.hassannaqvi.casiregister.models.Users.UsersTable;
import edu.aku.hassannaqvi.casiregister.models.VersionApp;
import edu.aku.hassannaqvi.casiregister.models.VersionApp.VersionAppTable;
import edu.aku.hassannaqvi.casiregister.utils.CreateTable;
import edu.aku.hassannaqvi.naunehal.models.Clusters;
import edu.aku.hassannaqvi.naunehal.models.Districts;
import edu.aku.hassannaqvi.naunehal.models.UCs;

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, CreateTable.DATABASE_NAME, null, CreateTable.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTable.SQL_CREATE_USERS);
        db.execSQL(CreateTable.SQL_CREATE_DISTRICTS);
        db.execSQL(CreateTable.SQL_CREATE_UCS);
        db.execSQL(CreateTable.SQL_CREATE_CLUSTERS);
        db.execSQL(CreateTable.SQL_CREATE_FORMS);
        db.execSQL(CreateTable.SQL_CREATE_VERSIONAPP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }


    /*
     * Addition in DB
     * */
    public Long addForm(Form form) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsContract.FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsContract.FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsContract.FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsContract.FormsTable.COLUMN_S01CS, form.getS01CS());
        values.put(FormsContract.FormsTable.COLUMN_S02FC, form.getS02FC());
        values.put(FormsContract.FormsTable.COLUMN_S03WS, form.getS03WS());
        values.put(FormsContract.FormsTable.COLUMN_S04FW, form.getS04FW());

        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, form.getIStatus());
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS96x, form.getIStatus96x());
        values.put(FormsContract.FormsTable.COLUMN_ENDINGDATETIME, form.getEndTime());
        values.put(FormsContract.FormsTable.COLUMN_GPS, form.getGps());

        values.put(FormsContract.FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsContract.FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsContract.FormsTable.COLUMN_APPVERSION, form.getAppver());
        values.put(FormsContract.FormsTable.COLUMN_CHILD_RESPONDENT, form.getChildrespondent());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsContract.FormsTable.TABLE_NAME,
                FormsContract.FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    /*
     * Functions that dealing with table data
     * */
    public Users getLoginUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                UsersTable.COLUMN_ID,
                UsersTable.COLUMN_USERNAME,
                UsersTable.COLUMN_PASSWORD,
                UsersTable.COLUMN_FULLNAME,
        };
        String whereClause = UsersTable.COLUMN_USERNAME + "=? AND " + UsersTable.COLUMN_PASSWORD + "=?";
        String[] whereArgs = {username, password};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users allForms = null;
        try {
            c = db.query(
                    UsersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allForms = new Users().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public ArrayList<Form> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN_UID,
                FormsTable.COLUMN_SYSDATE,
                FormsTable.COLUMN_USERNAME,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_ISTATUS96x,
                FormsTable.COLUMN_ENDINGDATETIME,
                FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form forms = new Form();
                forms.setId(c.getString(c.getColumnIndex(FormsTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndex(FormsTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndex(FormsTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndex(FormsTable.COLUMN_USERNAME)));
                allForms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
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
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    public ArrayList<Districts> getAllDistricts() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = Districts.TableDistricts._ID + " ASC";
        ArrayList<Districts> all = new ArrayList<>();
        try {
            c = db.query(
                    Districts.TableDistricts.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                all.add(new Districts().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public ArrayList<UCs> getUCsByDistricts(String dCode) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = UCs.TableUCs.COLUMN_DISTRICT_CODE + "=?";
        String[] whereArgs = new String[]{dCode};
        String groupBy = null;
        String having = null;

        String orderBy = UCs.TableUCs.COLUMN_UC_CODE + " ASC";

        ArrayList<UCs> allDC = new ArrayList<>();
        try {
            c = db.query(
                    UCs.TableUCs.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                UCs dc = new UCs();
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

    /*public BLRandom getHHFromBLRandom(String subAreaCode, String hh) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;

        String[] columns = {
                BLRandomContract.BLRandomTable.COLUMN_ID,
                BLRandomContract.BLRandomTable.COLUMN_LUID,
                BLRandomContract.BLRandomTable.COLUMN_STRUCTURE_NO,
                BLRandomContract.BLRandomTable.COLUMN_FAMILY_EXT_CODE,
                BLRandomContract.BLRandomTable.COLUMN_HH,
                BLRandomContract.BLRandomTable.COLUMN_P_CODE,
                BLRandomContract.BLRandomTable.COLUMN_EB_CODE,
                BLRandomContract.BLRandomTable.COLUMN_RANDOMDT,
                BLRandomContract.BLRandomTable.COLUMN_HH_SELECTED_STRUCT,
                BLRandomContract.BLRandomTable.COLUMN_CONTACT,
                BLRandomContract.BLRandomTable.COLUMN_HH_HEAD,
                BLRandomContract.BLRandomTable.COLUMN_SNO_HH
        };

        String whereClause = BLRandomContract.BLRandomTable.COLUMN_P_CODE + "=? AND " + BLRandomContract.BLRandomTable.COLUMN_HH + "=?";
        String[] whereArgs = new String[]{subAreaCode, hh};
        String groupBy = null;
        String having = null;

        String orderBy =
                BLRandomContract.BLRandomTable.COLUMN_ID + " ASC";

        BLRandom allBL = null;
        try {
            c = db.query(
                    BLRandomContract.BLRandomTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allBL = new BLRandom().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allBL;
    }*/


    /*
     * Update data in tables
     * */

    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsContract.FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SYNCED, true);
        values.put(FormsContract.FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsContract.FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, MainApp.form.getIStatus());
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS96x, MainApp.form.getIStatus96x());
        values.put(FormsContract.FormsTable.COLUMN_ENDINGDATETIME, MainApp.form.getEndTime());

        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    /*
     * Download data functions
     * */
    public int syncDistricts(JSONArray Districtslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Districts.TableDistricts.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < Districtslist.length(); i++) {
                JSONObject jsonObjectDistrict = Districtslist.getJSONObject(i);
                Districts District = new Districts();
                District.sync(jsonObjectDistrict);
                ContentValues values = new ContentValues();

                values.put(Districts.TableDistricts.COLUMN_DISTRICT_CODE, District.getDistrictCode());
                values.put(Districts.TableDistricts.COLUMN_DISTRICT_NAME, District.getDistrictName());
                long rowID = db.insert(Districts.TableDistricts.TABLE_NAME, null, values);
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

    public int syncCluster(JSONArray clusterList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Clusters.TableClusters.TABLE_NAME, null, null);
        int insertCount = 0;
        try {

            for (int i = 0; i < clusterList.length(); i++) {
                JSONObject jsonObjectCluster = clusterList.getJSONObject(i);
                Clusters cluster = new Clusters();
                cluster.sync(jsonObjectCluster);
                ContentValues values = new ContentValues();

                values.put(Clusters.TableClusters.COLUMN_CLUSTER_CODE, cluster.getClusterCode());
                values.put(Clusters.TableClusters.COLUMN_CLUSTER_NAME, cluster.getClustername());
                values.put(Clusters.TableClusters.COLUMN_UC_CODE, cluster.getUcCode());

                long rowID = db.insert(Clusters.TableClusters.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }
            db.close();

        } catch (Exception e) {
            Log.d(TAG, "syncCluster(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncUCs(JSONArray ucList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UCs.TableUCs.TABLE_NAME, null, null);
        int insertCount = 0;
        try {

            for (int i = 0; i < ucList.length(); i++) {
                JSONObject jsonObjectUc = ucList.getJSONObject(i);
                UCs uc = new UCs();
                uc.sync(jsonObjectUc);
                ContentValues values = new ContentValues();

                values.put(UCs.TableUCs.COLUMN_UC_CODE, uc.getUcCode());
                values.put(UCs.TableUCs.COLUMN_UC_NAME, uc.getUcName());
                values.put(UCs.TableUCs.COLUMN_DISTRICT_CODE, uc.getDistrictCode());

                long rowID = db.insert(UCs.TableUCs.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }
            db.close();

        } catch (Exception e) {
            Log.d(TAG, "syncUc(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(VersionAppTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionAppTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(VersionAppTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionAppTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionAppTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionAppTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }

    public int syncUser(JSONArray userList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < userList.length(); i++) {

                JSONObject jsonObjectUser = userList.getJSONObject(i);

                Users user = new Users();
                user.sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
                values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
                values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
                long rowID = db.insert(UsersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncUser(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }


}