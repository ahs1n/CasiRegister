package edu.aku.hassannaqvi.naunehal.models

import android.database.Cursor
import android.provider.BaseColumns
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 10/31/2016.
 * @update ali.azaz
 */
class Clusters {
    var clusterCode: String = ""
    var clustername: String = ""
    var ucCode: String = ""

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Clusters {
        clusterCode = jsonObject.getString(TableClusters.COLUMN_CLUSTER_CODE)
        clustername = jsonObject.getString(TableClusters.COLUMN_CLUSTER_NAME)
        ucCode = jsonObject.getString(TableClusters.COLUMN_UC_CODE)
        return this
    }

    fun hydrate(cursor: Cursor): Clusters {
        clusterCode = cursor.getString(cursor.getColumnIndex(TableClusters.COLUMN_CLUSTER_CODE))
        clustername = cursor.getString(cursor.getColumnIndex(TableClusters.COLUMN_CLUSTER_NAME))
        ucCode = cursor.getString(cursor.getColumnIndex(TableClusters.COLUMN_UC_CODE))
        return this
    }

    object TableClusters : BaseColumns {
        const val TABLE_NAME = "clusters"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_id"
        const val COLUMN_CLUSTER_CODE = "clusterCode"
        const val COLUMN_CLUSTER_NAME = "clusterName"
        const val COLUMN_UC_CODE = "ucCode"
    }
}