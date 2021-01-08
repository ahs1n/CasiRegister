package edu.aku.hassannaqvi.naunehal.base.repository

import edu.aku.hassannaqvi.naunehal.models.*
import kotlin.collections.ArrayList

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

}