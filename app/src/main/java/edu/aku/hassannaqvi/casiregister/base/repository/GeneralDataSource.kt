package edu.aku.hassannaqvi.casiregister.base.repository

import edu.aku.hassannaqvi.casiregister.models.*

interface GeneralDataSource {

    /*
    * For login Start
    * */
    suspend fun getLoginInformation(username: String, password: String): Users?
    /*
    * For login End
    * */

    /*
    * For MainActivity Start
    * */
    suspend fun getFormsByDate(date: String): ArrayList<Form>

    suspend fun getUploadStatus(): FormIndicatorsModel

    suspend fun getFormStatus(date: String): FormIndicatorsModel
    /*
    * For MainActivity End
    * */

    /*
    * For Child List
    * */
    suspend fun getChildList(cluster: String, hhno: String, uuid: String): ArrayList<ChildInformation>
    /*
    * For Child List End
    * */

    /*
    * For SectionH1
    * */
    suspend fun getDistrictsFromDB(): ArrayList<Districts>

    suspend fun getUcsByDistrictsFromDB(dCode: String): ArrayList<UCs>
    /*
    * For SectionH1 End
    * */

}