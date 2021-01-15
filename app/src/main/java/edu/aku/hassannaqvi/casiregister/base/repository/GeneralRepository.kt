package edu.aku.hassannaqvi.casiregister.base.repository

import edu.aku.hassannaqvi.casiregister.database.DatabaseHelper
import edu.aku.hassannaqvi.casiregister.models.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

open class GeneralRepository(private val db: DatabaseHelper) : GeneralDataSource {

    override suspend fun getChildList(cluster: String, hhno: String, uuid: String): ArrayList<ChildInformation> = withContext(Dispatchers.IO) {
        db.getFamilyFromDB(cluster, hhno, uuid)
    }

    override suspend fun getDistrictsFromDB(): ArrayList<Districts> = withContext(Dispatchers.IO) {
        db.allDistricts
    }

    override suspend fun getUcsByDistrictsFromDB(dCode: String): ArrayList<UCs> = withContext(Dispatchers.IO) {
        db.getUCsByDistricts(dCode)
    }

    override suspend fun getLoginInformation(username: String, password: String): Users? = withContext(Dispatchers.IO) {
        db.getLoginUser(username, password)
    }

    override suspend fun getFormsByDate(date: String): ArrayList<Form> = withContext(Dispatchers.IO) {
        db.getFormsByDate(date)
    }

    override suspend fun getUploadStatus(): FormIndicatorsModel = withContext(Dispatchers.IO) {
        db.uploadStatusCount
    }

    override suspend fun getFormStatus(date: String): FormIndicatorsModel = withContext(Dispatchers.IO) {
        db.getFormStatusCount(date)
    }
}