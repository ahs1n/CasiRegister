package edu.aku.hassannaqvi.naunehal.models;


import android.database.Cursor;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.naunehal.contracts.DistrictContract.DistrictTable;

public class Districts {

    private static final String TAG = "District_CONTRACT";

    String districtCode;
    String districtName;


    public Districts() {
        // Default Constructor
    }


    public Districts Sync(JSONObject jsonObject) throws JSONException {
        this.districtCode = jsonObject.getString(DistrictTable.COLUMN_DISTRICT_CODE);
        this.districtName = jsonObject.getString(DistrictTable.COLUMN_DISTRICT_NAME);
        return this;
    }


    public Districts HydrateDistrict(Cursor cursor) {
        this.districtCode = cursor.getString(cursor.getColumnIndex(DistrictTable.COLUMN_DISTRICT_CODE));
        this.districtName = cursor.getString(cursor.getColumnIndex(DistrictTable.COLUMN_DISTRICT_NAME));
        return this;
    }


    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }


    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(DistrictTable.COLUMN_DISTRICT_CODE, this.districtCode == null ? JSONObject.NULL : this.districtCode);
        json.put(DistrictTable.COLUMN_DISTRICT_NAME, this.districtName == null ? JSONObject.NULL : this.districtName);
        return json;
    }

}