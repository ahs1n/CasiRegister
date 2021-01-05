package edu.aku.hassannaqvi.naunehal.models;


import android.database.Cursor;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.naunehal.contracts.VillageContract.VillageTable;

public class Villages {

    private static final String TAG = "Village_CONTRACT";

    String districtCode;
    String villageCode;
    String villageName;


    public Villages() {
        // Default Constructor
    }


    public Villages Sync(JSONObject jsonObject) throws JSONException {
        this.districtCode = jsonObject.getString(VillageTable.COLUMN_DCODE);
        this.villageCode = jsonObject.getString(VillageTable.COLUMN_VCODE);
        this.villageName = jsonObject.getString(VillageTable.COLUMN_VNAME);
        return this;
    }


    public Villages HydrateVillage(Cursor cursor) {
        this.districtCode = cursor.getString(cursor.getColumnIndex(VillageTable.COLUMN_DCODE));
        this.villageCode = cursor.getString(cursor.getColumnIndex(VillageTable.COLUMN_VCODE));
        this.villageName = cursor.getString(cursor.getColumnIndex(VillageTable.COLUMN_VNAME));
        return this;
    }


    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }


    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }


    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(VillageTable.COLUMN_DCODE, this.districtCode == null ? JSONObject.NULL : this.districtCode);
        json.put(VillageTable.COLUMN_VCODE, this.villageCode == null ? JSONObject.NULL : this.villageCode);
        json.put(VillageTable.COLUMN_VNAME, this.villageName == null ? JSONObject.NULL : this.villageName);
        return json;
    }

}