package edu.aku.hassannaqvi.naunehal.models

import android.database.Cursor
import android.provider.BaseColumns
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 10/31/2016.
 * @update ali.azaz
 */
class UCs {
    var ucCode: String = ""
    var ucName: String = ""
    var districtCode: String = ""

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): UCs {
        ucCode = jsonObject.getString(TableUCs.COLUMN_UC_CODE)
        ucName = jsonObject.getString(TableUCs.COLUMN_UC_NAME)
        districtCode = jsonObject.getString(TableUCs.COLUMN_DISTRICT_CODE)
        return this
    }

    fun hydrate(cursor: Cursor): UCs {
        ucCode = cursor.getString(cursor.getColumnIndex(TableUCs.COLUMN_UC_CODE))
        ucName = cursor.getString(cursor.getColumnIndex(TableUCs.COLUMN_UC_NAME))
        districtCode = cursor.getString(cursor.getColumnIndex(TableUCs.COLUMN_DISTRICT_CODE))
        return this
    }

    object TableUCs : BaseColumns {
        const val TABLE_NAME = "ucs"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_UC_CODE = "ucCode"
        const val COLUMN_UC_NAME = "ucName"
        const val COLUMN_DISTRICT_CODE = "districtCode"
    }
}