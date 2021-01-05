package edu.aku.hassannaqvi.naunehal.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import edu.aku.hassannaqvi.naunehal.contracts.DistrictContract;
import edu.aku.hassannaqvi.naunehal.contracts.FormsContract;
import edu.aku.hassannaqvi.naunehal.contracts.UCsContract;
import edu.aku.hassannaqvi.naunehal.contracts.UsersContract;
import edu.aku.hassannaqvi.naunehal.contracts.VersionAppContract;
import edu.aku.hassannaqvi.naunehal.contracts.VillageContract;
import edu.aku.hassannaqvi.naunehal.core.MainApp;
import edu.aku.hassannaqvi.naunehal.models.Districts;
import edu.aku.hassannaqvi.naunehal.models.Form;
import edu.aku.hassannaqvi.naunehal.models.UCs;
import edu.aku.hassannaqvi.naunehal.models.Users;
import edu.aku.hassannaqvi.naunehal.models.VersionApp;
import edu.aku.hassannaqvi.naunehal.models.Villages;
import edu.aku.hassannaqvi.naunehal.utils.CreateTable;


/**
 * Created by hassan.naqvi on 11/30/2016.
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
        db.execSQL(CreateTable.SQL_CREATE_VILLAGE);
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

/*    private boolean getTableNames(SQLiteDatabase db, String name) {
        Cursor c = db.rawQuery(
                "SELECT name FROM sqlite_master WHERE type='table'", null);
        Asserts.checkNotNull(c);

        ArrayList<String> actual = new ArrayList<>();
        if (c.moveToFirst()) {
            while (!c.isAfterLast()) {
                actual.add(c.getString(0));
                c.moveToNext();
            }
        }
        c.close();

        if (actual.size() == 0) return false;
        return actual.contains(name);
    }*/


    /*public int syncBLRandom(JSONArray blList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(BLRandomContract.BLRandomTable.TABLE_NAME, null, null);

        int insertCount = 0;
        for (int i = 0; i < blList.length(); i++) {
            JSONObject jsonObjectCC;
            try {
                jsonObjectCC = blList.getJSONObject(i);

                BLRandom Vc = new BLRandom();
                Vc.Sync(jsonObjectCC);

                ContentValues values = new ContentValues();

                values.put(BLRandomContract.BLRandomTable.COLUMN_ID, Vc.get_ID());
                values.put(BLRandomContract.BLRandomTable.COLUMN_LUID, Vc.getLUID());
                values.put(BLRandomContract.BLRandomTable.COLUMN_STRUCTURE_NO, Vc.getStructure());
                values.put(BLRandomContract.BLRandomTable.COLUMN_FAMILY_EXT_CODE, Vc.getExtension());
                values.put(BLRandomContract.BLRandomTable.COLUMN_HH, Vc.getHh());
                values.put(BLRandomContract.BLRandomTable.COLUMN_EB_CODE, Vc.getEbcode());
                values.put(BLRandomContract.BLRandomTable.COLUMN_P_CODE, Vc.getpCode());
                values.put(BLRandomContract.BLRandomTable.COLUMN_RANDOMDT, Vc.getRandomDT());
                values.put(BLRandomContract.BLRandomTable.COLUMN_HH_HEAD, Vc.getHhhead());
                values.put(BLRandomContract.BLRandomTable.COLUMN_CONTACT, Vc.getContact());
                values.put(BLRandomContract.BLRandomTable.COLUMN_HH_SELECTED_STRUCT, Vc.getSelStructure());
                values.put(BLRandomContract.BLRandomTable.COLUMN_SNO_HH, Vc.getSno());

                long row = db.insert(BLRandomContract.BLRandomTable.TABLE_NAME, null, values);
                if (row != -1) insertCount++;

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return insertCount;
    }
*/


    public Integer syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(VersionAppContract.VersionAppTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionAppContract.VersionAppTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.Sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(VersionAppContract.VersionAppTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionAppContract.VersionAppTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionAppContract.VersionAppTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionAppContract.VersionAppTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }


    public VersionApp getVersionApp() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                VersionAppContract.VersionAppTable._ID,
                VersionAppContract.VersionAppTable.COLUMN_VERSION_CODE,
                VersionAppContract.VersionAppTable.COLUMN_VERSION_NAME,
                VersionAppContract.VersionAppTable.COLUMN_PATH_NAME
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = null;

        VersionApp allVC = new VersionApp();
        try {
            c = db.query(
                    VersionAppContract.VersionAppTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allVC.hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allVC;
    }


    public int syncUser(JSONArray userList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersContract.UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < userList.length(); i++) {

                JSONObject jsonObjectUser = userList.getJSONObject(i);

                Users user = new Users();
                user.Sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(UsersContract.UsersTable.COLUMN_USERNAME, user.getUsername());
                values.put(UsersContract.UsersTable.COLUMN_PASSWORD, user.getPassword());
                values.put(UsersContract.UsersTable.COLUMN_FULL_NAME, user.getFullName());
                long rowID = db.insert(UsersContract.UsersTable.TABLE_NAME, null, values);
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


    public int syncUcs(JSONArray Ucslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UCsContract.TableUCs.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < Ucslist.length(); i++) {

                JSONObject json = Ucslist.getJSONObject(i);

                UCs ucs = new UCs();
                ucs.Sync(json);
                ContentValues values = new ContentValues();

                values.put(UCsContract.TableUCs.COLUMN_UC_CODE, ucs.getUcCode());
                values.put(UCsContract.TableUCs.COLUMN_UC_NAME, ucs.getUcName());
                values.put(UCsContract.TableUCs.COLUMN_DISTRICT_CODE, ucs.getDistrictCode());
                long rowID = db.insert(UCsContract.TableUCs.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncUcs(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }


    public int syncDistricts(JSONArray list) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(DistrictContract.DistrictTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < list.length(); i++) {

                JSONObject json = list.getJSONObject(i);

                Districts dists = new Districts();
                dists.Sync(json);
                ContentValues values = new ContentValues();

                values.put(DistrictContract.DistrictTable.COLUMN_DISTRICT_CODE, dists.getDistrictCode());
                values.put(DistrictContract.DistrictTable.COLUMN_DISTRICT_NAME, dists.getDistrictName());
                long rowID = db.insert(DistrictContract.DistrictTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncDistricts(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }


    public int syncVillages(JSONArray list) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(VillageContract.VillageTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < list.length(); i++) {

                JSONObject json = list.getJSONObject(i);

                Villages vil = new Villages();
                vil.Sync(json);
                ContentValues values = new ContentValues();

                values.put(VillageContract.VillageTable.COLUMN_DCODE, vil.getDistrictCode());
                values.put(VillageContract.VillageTable.COLUMN_VCODE, vil.getVillageCode());
                values.put(VillageContract.VillageTable.COLUMN_VNAME, vil.getVillageName());
                long rowID = db.insert(VillageContract.VillageTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncVillages(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }


    public Collection<Users> getUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                UsersContract.UsersTable.COLUMN_USERNAME,
                UsersContract.UsersTable.COLUMN_FULL_NAME
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = UsersContract.UsersTable.COLUMN_USERNAME + " ASC";

        Collection<Users> alluser = new ArrayList<>();
        try {
            c = db.query(
                    UsersContract.UsersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                alluser.add(new Users().Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return alluser;
    }


    public Collection<UCs> getAllUcs() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                UCsContract.TableUCs.COLUMN_UC_CODE,
                UCsContract.TableUCs.COLUMN_UC_NAME
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                UCsContract.TableUCs.COLUMN_UC_NAME + " ASC";

        Collection<UCs> all = new ArrayList<>();
        try {
            c = db.query(
                    UCsContract.TableUCs.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                UCs ucs = new UCs();
                all.add(ucs.HydrateUCs(c));
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


    public Collection<Districts> getAllDistricts(String dcode) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                DistrictContract.DistrictTable.COLUMN_DISTRICT_NAME,
                DistrictContract.DistrictTable.TABLE_NAME
        };

        String whereClause = DistrictContract.DistrictTable.COLUMN_DISTRICT_CODE + "=?";
        String[] whereArgs = new String[]{dcode};
        String groupBy = null;
        String having = null;

        String orderBy =
                DistrictContract.DistrictTable.COLUMN_DISTRICT_NAME + " ASC";

        Collection<Districts> all = new ArrayList<>();
        try {
            c = db.query(
                    DistrictContract.DistrictTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Districts dists = new Districts();
                all.add(dists.HydrateDistrict(c));
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


    public Collection<Villages> getAllVillages(String dcode) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                VillageContract.VillageTable.COLUMN_DCODE,
                VillageContract.VillageTable.COLUMN_VCODE,
                VillageContract.VillageTable.COLUMN_VNAME
        };

        String whereClause = VillageContract.VillageTable.COLUMN_DCODE + "=?";
        String[] whereArgs = new String[]{dcode};
        String groupBy = null;
        String having = null;

        String orderBy =
                VillageContract.VillageTable.COLUMN_VNAME + " ASC";

        Collection<Villages> all = new ArrayList<>();
        try {
            c = db.query(
                    VillageContract.VillageTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Villages vs = new Villages();
                all.add(vs.HydrateVillage(c));
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


    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersContract.UsersTable.TABLE_NAME + " WHERE " + UsersContract.UsersTable.COLUMN_USERNAME + "=? AND " + UsersContract.UsersTable.COLUMN_PASSWORD + "=?", new String[]{username, password});
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {

                if (mCursor.moveToFirst()) {
//                    MainApp.DIST_ID = mCursor.getString(mCursor.getColumnIndex(Users.UsersTable.ROW_USERNAME));
                }
                return true;
            }
        }
        return false;
    }


    public Long addForm(Form form) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsContract.FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsContract.FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsContract.FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsContract.FormsTable.COLUMN_DCODE, form.getDcode());
        values.put(FormsContract.FormsTable.COLUMN_UCODE, form.getUcode());
        values.put(FormsContract.FormsTable.COLUMN_CLUSTER, form.getCluster());
        values.put(FormsContract.FormsTable.COLUMN_HHNO, form.getHhno());
        values.put(FormsContract.FormsTable.COLUMN_S01HH, form.getS01HH());
        values.put(FormsContract.FormsTable.COLUMN_S02CB, form.getS02CB());
        values.put(FormsContract.FormsTable.COLUMN_S03CS, form.getS03CS());
        values.put(FormsContract.FormsTable.COLUMN_S04IM, form.getS04IM());
        values.put(FormsContract.FormsTable.COLUMN_S05PD, form.getS05PD());
        values.put(FormsContract.FormsTable.COLUMN_S06BF, form.getS06BF());
        values.put(FormsContract.FormsTable.COLUMN_S07CV, form.getS07CV());
        values.put(FormsContract.FormsTable.COLUMN_S08SE, form.getS08SE());

        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, form.getIStatus());
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS96x, form.getIStatus96x());
        values.put(FormsContract.FormsTable.COLUMN_ENDINGDATETIME, form.getEndTime());
        values.put(FormsContract.FormsTable.COLUMN_GPS, form.getGps());

        values.put(FormsContract.FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsContract.FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsContract.FormsTable.COLUMN_APPVERSION, form.getAppver());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsContract.FormsTable.TABLE_NAME,
                FormsContract.FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }



    /*   public int updateFormID() {
           SQLiteDatabase db = this.getReadableDatabase();

   // New value for one column
           ContentValues values = new ContentValues();
           values.put(FormsContract.FormsTable.COLUMN_UID, MainApp.form.get_UID());

   // Which row to update, based on the ID
           String selection = FormsContract.FormsTable._ID + " = ?";
           String[] selectionArgs = {String.valueOf(MainApp.form.get_ID())};

           int count = db.update(FormsContract.FormsTable.TABLE_NAME_FORMS,
                   values,
                   selection,
                   selectionArgs);
           return count;
       }
   */


    public Collection<Form> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_USERNAME,
                FormsContract.FormsTable.COLUMN_SYSDATE,
                FormsContract.FormsTable.COLUMN_DCODE,
                FormsContract.FormsTable.COLUMN_UCODE,
                FormsContract.FormsTable.COLUMN_CLUSTER,
                FormsContract.FormsTable.COLUMN_HHNO,
                FormsContract.FormsTable.COLUMN_S01HH,
                FormsContract.FormsTable.COLUMN_S02CB,
                FormsContract.FormsTable.COLUMN_S03CS,
                FormsContract.FormsTable.COLUMN_S04IM,
                FormsContract.FormsTable.COLUMN_S05PD,
                FormsContract.FormsTable.COLUMN_S06BF,
                FormsContract.FormsTable.COLUMN_S07CV,
                FormsContract.FormsTable.COLUMN_S08SE,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_ISTATUS96x,
                FormsContract.FormsTable.COLUMN_ENDINGDATETIME,
                FormsContract.FormsTable.COLUMN_GPS,
                FormsContract.FormsTable.COLUMN_DEVICETAGID,
                FormsContract.FormsTable.COLUMN_DEVICEID,
                FormsContract.FormsTable.COLUMN_APPVERSION,


        };

        String whereClause = FormsContract.FormsTable.COLUMN_HHNO + "=? ";
        /* String[] whereArgs = {district, refno};*/
        String groupBy = null;
        String having = null;
        String orderBy = FormsContract.FormsTable._ID + " ASC";
        Form allForms = null;


        try {
           /* c = db.query(
                    FormsContract.FormsTable.TABLE_NAME_FORMS,  // The table to query
                    columns,                   // The columns to return
                    whereClause,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );*/
            while (c.moveToNext()) {
                /*allForms = new Form().Hydrate(c);*/
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return (Collection<Form>) allForms;
    }


    public Collection<Form> checkFormExist() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_USERNAME,
                FormsContract.FormsTable.COLUMN_SYSDATE,
                FormsContract.FormsTable.COLUMN_DCODE,
                FormsContract.FormsTable.COLUMN_UCODE,
                FormsContract.FormsTable.COLUMN_CLUSTER,
                FormsContract.FormsTable.COLUMN_HHNO,
                FormsContract.FormsTable.COLUMN_S01HH,
                FormsContract.FormsTable.COLUMN_S02CB,
                FormsContract.FormsTable.COLUMN_S03CS,
                FormsContract.FormsTable.COLUMN_S04IM,
                FormsContract.FormsTable.COLUMN_S05PD,
                FormsContract.FormsTable.COLUMN_S06BF,
                FormsContract.FormsTable.COLUMN_S07CV,
                FormsContract.FormsTable.COLUMN_S08SE,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_ISTATUS96x,
                FormsContract.FormsTable.COLUMN_ENDINGDATETIME,
                FormsContract.FormsTable.COLUMN_GPS,
                FormsContract.FormsTable.COLUMN_DEVICETAGID,
                FormsContract.FormsTable.COLUMN_DEVICEID,
                FormsContract.FormsTable.COLUMN_APPVERSION,

        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<Form>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                /*allForms.add(form.Hydrate(c));*/
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


    public Collection<Form> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_USERNAME,
                FormsContract.FormsTable.COLUMN_SYSDATE,
                FormsContract.FormsTable.COLUMN_DCODE,
                FormsContract.FormsTable.COLUMN_UCODE,
                FormsContract.FormsTable.COLUMN_CLUSTER,
                FormsContract.FormsTable.COLUMN_HHNO,
                FormsContract.FormsTable.COLUMN_S01HH,
                FormsContract.FormsTable.COLUMN_S02CB,
                FormsContract.FormsTable.COLUMN_S03CS,
                FormsContract.FormsTable.COLUMN_S04IM,
                FormsContract.FormsTable.COLUMN_S05PD,
                FormsContract.FormsTable.COLUMN_S06BF,
                FormsContract.FormsTable.COLUMN_S07CV,
                FormsContract.FormsTable.COLUMN_S08SE,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_ISTATUS96x,
                FormsContract.FormsTable.COLUMN_ENDINGDATETIME,
                FormsContract.FormsTable.COLUMN_GPS,
                FormsContract.FormsTable.COLUMN_DEVICETAGID,
                FormsContract.FormsTable.COLUMN_DEVICEID,
                FormsContract.FormsTable.COLUMN_APPVERSION,
                FormsContract.FormsTable.COLUMN_SYNCED,
        };

        //   String whereClause = FormsContract.FormsTable.COLUMN_SYNCED + " is null OR " + FormsContract.FormsTable.COLUMN_SYNCED + " = ''";
        String whereClause = null;
        String[] whereArgs = null;

        String groupBy = null;
        String having = null;
        String orderBy = FormsContract.FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                /*allForms.add(new Form().Hydrate(c));*/
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


    public Collection<Form> getTodayForms(String sysdate) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_USERNAME,
                FormsContract.FormsTable.COLUMN_SYSDATE,
                FormsContract.FormsTable.COLUMN_DCODE,
                FormsContract.FormsTable.COLUMN_UCODE,
                FormsContract.FormsTable.COLUMN_CLUSTER,
                FormsContract.FormsTable.COLUMN_HHNO,
                FormsContract.FormsTable.COLUMN_S01HH,
                FormsContract.FormsTable.COLUMN_S02CB,
                FormsContract.FormsTable.COLUMN_S03CS,
                FormsContract.FormsTable.COLUMN_S04IM,
                FormsContract.FormsTable.COLUMN_S05PD,
                FormsContract.FormsTable.COLUMN_S06BF,
                FormsContract.FormsTable.COLUMN_S07CV,
                FormsContract.FormsTable.COLUMN_S08SE,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsContract.FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                form.setId(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ID)));
                form.setUid(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_UID)));
                form.setUserName(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_USERNAME)));
                form.setSysDate(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_SYSDATE)));
                form.setDcode(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_DCODE)));
                form.setUcode(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_UCODE)));
                form.setCluster(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_CLUSTER)));
                form.setHhno(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_HHNO)));
                form.setS01HH(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_S01HH)));
                form.setS02CB(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_S02CB)));
                form.setS03CS(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_S03CS)));
                form.setS04IM(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_S04IM)));
                form.setS05PD(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_S05PD)));
                form.setS06BF(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_S06BF)));
                form.setS07CV(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_S07CV)));
                form.setS08SE(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_S08SE)));
                form.setIStatus(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ISTATUS)));
                form.setSynced(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_SYNCED)));
                allForms.add(form);
            }
        } catch (SQLiteException e) {

            //db.rawQuery(SQL_ALTER_FORMS_S1q4CODE, null);

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


    public Collection<Form> getFormsByCluster(String cluster) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_SYSDATE,
                FormsContract.FormsTable.COLUMN_CLUSTER,
                FormsContract.FormsTable.COLUMN_HHNO,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsContract.FormsTable.COLUMN_CLUSTER + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                form.setId(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ID)));
                form.setUid(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_UID)));
                form.setSysDate(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_SYSDATE)));
                form.setCluster(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_CLUSTER)));
                form.setHhno(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_HHNO)));
                form.setIStatus(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ISTATUS)));
                form.setSynced(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_SYNCED)));
                allForms.add(form);
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


    public ArrayList<Form> getUnclosedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_SYSDATE,
                FormsContract.FormsTable.COLUMN_CLUSTER,
                FormsContract.FormsTable.COLUMN_HHNO,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_SYNCED,
        };
        String whereClause = FormsContract.FormsTable.COLUMN_ISTATUS + " = ''";
        String[] whereArgs = null;
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsContract.FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                form.setId(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ID)));
                form.setUid(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_UID)));
                form.setSysDate(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_SYSDATE)));
                form.setCluster(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_CLUSTER)));
                form.setHhno(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_HHNO)));
                form.setIStatus(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ISTATUS)));
                form.setSynced(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_SYNCED)));
                allForms.add(form);
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


    // TODO: BLRandom working left
    //Get BLRandom data
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


    //Get Form already exist
    public Form getFilledForm(String district, String hhno) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_USERNAME,
                FormsContract.FormsTable.COLUMN_SYSDATE,
                FormsContract.FormsTable.COLUMN_DCODE,
                FormsContract.FormsTable.COLUMN_CLUSTER,
                FormsContract.FormsTable.COLUMN_HHNO,
                FormsContract.FormsTable.COLUMN_S01HH,
                FormsContract.FormsTable.COLUMN_S02CB,
                FormsContract.FormsTable.COLUMN_S03CS,
                FormsContract.FormsTable.COLUMN_S04IM,
                FormsContract.FormsTable.COLUMN_S05PD,
                FormsContract.FormsTable.COLUMN_S06BF,
                FormsContract.FormsTable.COLUMN_S07CV,
                FormsContract.FormsTable.COLUMN_S08SE,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_ISTATUS96x,
                FormsContract.FormsTable.COLUMN_ENDINGDATETIME,
                FormsContract.FormsTable.COLUMN_GPS,
                FormsContract.FormsTable.COLUMN_DEVICETAGID,
                FormsContract.FormsTable.COLUMN_DEVICEID,
                FormsContract.FormsTable.COLUMN_APPVERSION
        };

//        String whereClause = "(" + FormsTable.COLUMN_ISTATUS + " is null OR " + FormsTable.COLUMN_ISTATUS + "='') AND " + FormsTable.COLUMN_CLUSTERCODE + "=? AND " + FormsTable.COLUMN_HHNO + "=?";
        String whereClause = FormsContract.FormsTable.COLUMN_DCODE + "=?";
        String[] whereArgs = {district};
        String groupBy = null;
        String having = null;
        String orderBy = FormsContract.FormsTable._ID + " ASC";
        Form allForms = null;
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                /*allForms = new Form().Hydrate(c);*/
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


    //Generic update FormColumn
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


    //Generic Un-Synced Forms
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
}