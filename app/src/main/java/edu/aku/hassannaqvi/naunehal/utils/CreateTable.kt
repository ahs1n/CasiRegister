package edu.aku.hassannaqvi.naunehal.utils

import edu.aku.hassannaqvi.naunehal.contracts.FamilyContract
import edu.aku.hassannaqvi.naunehal.contracts.FormsContract
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
            + FamilyContract.FamilyTable.TABLE_NAME + "("
            + FamilyContract.FamilyTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FamilyContract.FamilyTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_UID + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_UUID + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_USERNAME + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_SYSDATE + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_ISTATUS + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_ISTATUS96x + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_GPS + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_DEVICEID + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_DEVICETAGID + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_SYNCED + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_APPVERSION + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_DCODE + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_UCODE + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_CLUSTER + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_HHNO + " TEXT,"
            + FamilyContract.FamilyTable.COLUMN_SCB + " TEXT"
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