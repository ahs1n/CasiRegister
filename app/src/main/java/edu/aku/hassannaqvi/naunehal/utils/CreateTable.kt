package edu.aku.hassannaqvi.naunehal.utils

import edu.aku.hassannaqvi.naunehal.contracts.ChildContract
import edu.aku.hassannaqvi.naunehal.contracts.ChildInfoContract
import edu.aku.hassannaqvi.naunehal.contracts.FormsContract
import edu.aku.hassannaqvi.naunehal.contracts.IMContract
import edu.aku.hassannaqvi.naunehal.models.Users
import edu.aku.hassannaqvi.naunehal.models.VersionApp

object CreateTable {
    private const val PROJECT_NAME = "SMK_PWD2020"
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
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
            + FormsContract.FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsContract.FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsContract.FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsContract.FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsContract.FormsTable.COLUMN_CHILD_RESPONDENT + " TEXT,"
            + FormsContract.FormsTable.COLUMN_DCODE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_UCODE + " TEXT,"
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
            + " );")

    const val SQL_CREATE_FAMILY = ("CREATE TABLE "
            + ChildInfoContract.ChildInfoTable.TABLE_NAME + "("
            + ChildInfoContract.ChildInfoTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_UID + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_UUID + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_USERNAME + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_SYSDATE + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_ISTATUS + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_ISTATUS96x + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_GPS + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_DEVICEID + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_DEVICETAGID + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_SYNCED + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_APPVERSION + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_DCODE + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_UCODE + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_CLUSTER + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_HHNO + " TEXT,"
            + ChildInfoContract.ChildInfoTable.COLUMN_SCB + " TEXT"
            + " );")

    const val SQL_CREATE_CHILD = ("CREATE TABLE "
            + ChildContract.ChildTable.TABLE_NAME + "("
            + ChildContract.ChildTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ChildContract.ChildTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_UID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_UUID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_USERNAME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SYSDATE + " TEXT,"
            + ChildContract.ChildTable.COLUMN_ISTATUS + " TEXT,"
            + ChildContract.ChildTable.COLUMN_ISTATUS96x + " TEXT,"
            + ChildContract.ChildTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_GPS + " TEXT,"
            + ChildContract.ChildTable.COLUMN_DEVICEID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_DEVICETAGID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SYNCED + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ChildContract.ChildTable.COLUMN_APPVERSION + " TEXT,"
            + ChildContract.ChildTable.COLUMN_DCODE + " TEXT,"
            + ChildContract.ChildTable.COLUMN_UCODE + " TEXT,"
            + ChildContract.ChildTable.COLUMN_CLUSTER + " TEXT,"
            + ChildContract.ChildTable.COLUMN_HHNO + " TEXT,"
            + ChildContract.ChildTable.COLUMN_RESPONDENT_NAME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_CHILD_NAME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SERIAL + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SCS + " TEXT"
            + " );")

    const val SQL_CREATE_IMMUNIZATION = ("CREATE TABLE "
            + IMContract.IMTable.TABLE_NAME + "("
            + IMContract.IMTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + IMContract.IMTable.COLUMN_PROJECT_NAME + " TEXT,"
            + IMContract.IMTable.COLUMN_UID + " TEXT,"
            + IMContract.IMTable.COLUMN_UUID + " TEXT,"
            + IMContract.IMTable.COLUMN_USERNAME + " TEXT,"
            + IMContract.IMTable.COLUMN_SYSDATE + " TEXT,"
            + IMContract.IMTable.COLUMN_ISTATUS + " TEXT,"
            + IMContract.IMTable.COLUMN_ISTATUS96x + " TEXT,"
            + IMContract.IMTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + IMContract.IMTable.COLUMN_GPS + " TEXT,"
            + IMContract.IMTable.COLUMN_DEVICEID + " TEXT,"
            + IMContract.IMTable.COLUMN_DEVICETAGID + " TEXT,"
            + IMContract.IMTable.COLUMN_SYNCED + " TEXT,"
            + IMContract.IMTable.COLUMN_SYNCED_DATE + " TEXT,"
            + IMContract.IMTable.COLUMN_APPVERSION + " TEXT,"
            + IMContract.IMTable.COLUMN_DCODE + " TEXT,"
            + IMContract.IMTable.COLUMN_UCODE + " TEXT,"
            + IMContract.IMTable.COLUMN_CLUSTER + " TEXT,"
            + IMContract.IMTable.COLUMN_HHNO + " TEXT,"
            + IMContract.IMTable.COLUMN_RESPONDENT_NAME + " TEXT,"
            + IMContract.IMTable.COLUMN_CHILD_NAME + " TEXT,"
            + IMContract.IMTable.COLUMN_SERIAL + " TEXT,"
            + IMContract.IMTable.COLUMN_SIM + " TEXT"
            + " );")

    const val SQL_CREATE_USERS = ("CREATE TABLE " + Users.UsersTable.TABLE_NAME + "("
            + Users.UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Users.UsersTable.COLUMN_USERNAME + " TEXT,"
            + Users.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + Users.UsersTable.COLUMN_FULLNAME + " TEXT"
            + " );")

    const val SQL_CREATE_VERSIONAPP = "CREATE TABLE " + VersionApp.VersionAppTable.TABLE_NAME + " (" +
            VersionApp.VersionAppTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            VersionApp.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
            VersionApp.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
            VersionApp.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
            ");"
}