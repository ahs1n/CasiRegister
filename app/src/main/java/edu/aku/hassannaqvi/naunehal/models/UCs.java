package edu.aku.hassannaqvi.naunehal.models;


import android.database.Cursor;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.naunehal.contracts.UCsContract;
import edu.aku.hassannaqvi.naunehal.contracts.UCsContract.TableUCs;

public class UCs {

    private static final String TAG = "UCs_CONTRACT";
    String ucCode;
    String ucName;
    String districtCode;

    public UCs() {
        // Default Constructor
    }

    public UCs Sync(JSONObject jsonObject) throws JSONException {
        this.ucCode = jsonObject.getString(TableUCs.COLUMN_UC_CODE);
        this.ucName = jsonObject.getString(TableUCs.COLUMN_UC_NAME);
        this.districtCode = jsonObject.getString(TableUCs.COLUMN_DISTRICT_CODE);
        return this;
    }

    public UCs HydrateUCs(Cursor cursor) {
        this.ucCode = cursor.getString(cursor.getColumnIndex(TableUCs.COLUMN_UC_CODE));
        this.ucName = cursor.getString(cursor.getColumnIndex(TableUCs.COLUMN_UC_NAME));
        this.districtCode = cursor.getString(cursor.getColumnIndex(TableUCs.COLUMN_DISTRICT_CODE));
        return this;
    }

    public String getUcCode() {
        return ucCode;
    }

    public void setUcCode(String uc_code) {
        this.ucCode = uc_code;
    }


    public String getUcName() {
        return ucName;
    }

    public void setUcName(String uc_name) {
        this.ucName = uc_name;
    }


    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(UCsContract.TableUCs.COLUMN_UC_CODE, this.ucCode == null ? JSONObject.NULL : this.ucCode);
        json.put(TableUCs.COLUMN_UC_NAME, this.ucName == null ? JSONObject.NULL : this.ucName);
        json.put(TableUCs.COLUMN_DISTRICT_CODE, this.districtCode == null ? JSONObject.NULL : this.districtCode);
        return json;
    }

}