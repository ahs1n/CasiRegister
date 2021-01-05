package edu.aku.hassannaqvi.naunehal.utils;


import edu.aku.hassannaqvi.naunehal.contracts.DistrictContract;
import edu.aku.hassannaqvi.naunehal.contracts.FormsContract;
import edu.aku.hassannaqvi.naunehal.contracts.UCsContract;
import edu.aku.hassannaqvi.naunehal.contracts.UsersContract;
import edu.aku.hassannaqvi.naunehal.contracts.VersionAppContract;
import edu.aku.hassannaqvi.naunehal.contracts.VillageContract;

public final class CreateTable {

    public static final String PROJECT_NAME = "SMK_PWD2020";
    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    public static final String DATABASE_COPY = PROJECT_NAME + "_copy.db";
    public static final int DATABASE_VERSION = 1;

    public static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + FormsContract.FormsTable.TABLE_NAME + "("
            + FormsContract.FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsContract.FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsContract.FormsTable.COLUMN_UID + " TEXT,"
            + FormsContract.FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsContract.FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsContract.FormsTable.COLUMN_ISTATUS96x + " TEXT,"
            + FormsContract.FormsTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + FormsContract.FormsTable.COLUMN_GPS + " TEXT,"
            + FormsContract.FormsTable.COLUMN_GPSLNG + " TEXT,"
            + FormsContract.FormsTable.COLUMN_GPSDATE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_GPSACC + " TEXT,"
            + FormsContract.FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsContract.FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsContract.FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsContract.FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsContract.FormsTable.COLUMN_DISTRICT + " TEXT,"
            + FormsContract.FormsTable.COLUMN_UC + " TEXT,"
            + FormsContract.FormsTable.COLUMN_CLUSTER + " TEXT,"
            + FormsContract.FormsTable.COLUMN_HHNO + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S01HH + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S02CB + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S03CS + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S04IM + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S05PD + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S06BF + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S07CV + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S08SE + " TEXT"

            + " );";


    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.UsersTable.TABLE_NAME + "("
            + UsersContract.UsersTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersContract.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersContract.UsersTable.COLUMN_FULL_NAME + " TEXT"
            + " );";


    public static final String SQL_CREATE_VERSIONAPP = "CREATE TABLE " + VersionAppContract.VersionAppTable.TABLE_NAME + " (" +
            VersionAppContract.VersionAppTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            VersionAppContract.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
            VersionAppContract.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
            VersionAppContract.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
            ");";


    public static final String SQL_CREATE_DISTRICTS = "CREATE TABLE " + DistrictContract.DistrictTable.TABLE_NAME + "("
            + DistrictContract.DistrictTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + DistrictContract.DistrictTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + DistrictContract.DistrictTable.COLUMN_DISTRICT_NAME + " TEXT );";

    public static final String SQL_CREATE_VILLAGE = "CREATE TABLE " + VillageContract.VillageTable.TABLE_NAME + "("
            + VillageContract.VillageTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VillageContract.VillageTable.COLUMN_DCODE + " TEXT,"
            + VillageContract.VillageTable.COLUMN_VCODE + " TEXT,"
            + VillageContract.VillageTable.COLUMN_VNAME + " TEXT"
            + " );";


    public static final String SQL_CREATE_UCS = "CREATE TABLE " + UCsContract.TableUCs.TABLE_NAME + "("
            + UCsContract.TableUCs._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UCsContract.TableUCs.COLUMN_UC_CODE + " TEXT,"
            + UCsContract.TableUCs.COLUMN_TEHSIL_CODE + " TEXT,"
            + UCsContract.TableUCs.COLUMN_UC_NAME + " TEXT );";

}
