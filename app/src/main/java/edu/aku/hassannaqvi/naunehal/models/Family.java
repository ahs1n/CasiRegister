package edu.aku.hassannaqvi.naunehal.models;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.naunehal.BR;
import edu.aku.hassannaqvi.naunehal.contracts.FamilyContract;
import edu.aku.hassannaqvi.naunehal.core.MainApp;

public class Family extends BaseObservable {

    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    private String id;
    private String uid;
    private String uuid;
    private String userName;
    private String sysDate;
    private String dcode;
    private String ucode;
    private String cluster;
    private String hhno;
    private String deviceId;
    private String deviceTag;
    private String appver;
    private String gps;
    private String endTime;
    private String iStatus;
    private String iStatus96x;
    private String synced;
    private String syncDate;

    // SECTION VARIABLES
    private String sA;

    // FIELD VARIABLES
    public String cb01;
    public String cb02;
    public String cb03;
    public String cb04dd;
    public String cb04mm;
    public String cb04yy;
    public String cb0501;
    public String cb0502;
    public String cb06;
    public String cb07;
    public String cb08;
    public String cb09;
    public String cb10;
    public String cb11;
    public String cb12;
    public String cb13;
    public String cb14;
    public String cb15;
    public String cb16;


    public Family() {

    }

    @Bindable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (projectName != projectName)
            this.projectName = projectName;

        //TODO: Update field in layout
        // notifyPropertyChanged(BR.layoutFieldName);
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }


    @Bindable
    public String getUid() {
        return uid;
    }

    public Family setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUuid() {
        return uuid;
    }

    public Family setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public Family setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDcode() {
        return dcode;
    }

    public Family setDcode(String dcode) {
        this.dcode = dcode;
        return this;
    }


    @Bindable
    public String getUcode() {
        return ucode;
    }

    public Family setUcode(String ucode) {
        this.ucode = ucode;
        return this;
    }


    @Bindable
    public String getCluster() {
        return cluster;
    }

    public Family setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }


    @Bindable
    public String getHhno() {
        return hhno;
    }

    public Family setHhno(String hhno) {
        this.hhno = hhno;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Family setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Family setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Family setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Family setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getGps() {
        return gps;
    }

    public Family setGps(String gps) {
        this.gps = gps;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Family setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public Family setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Family setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    public String getsA() {
        return sA;
    }

    public Family setsA(String sA) {
        this.sA = sA;
        return this;
    }


    @Bindable
    public String getCb01() {
        return cb01;
    }

    public void setCb01(String cb01) {
        this.cb01 = cb01;
        notifyPropertyChanged(BR.cb01);
    }

    @Bindable
    public String getCb02() {
        return cb02;
    }

    public void setCb02(String cb02) {
        this.cb02 = cb02;
        notifyPropertyChanged(BR.cb02);
    }

    @Bindable
    public String getCb03() {
        return cb03;
    }

    public void setCb03(String cb03) {
        this.cb03 = cb03;
        notifyPropertyChanged(BR.cb03);
    }

    @Bindable
    public String getCb04dd() {
        return cb04dd;
    }

    public void setCb04dd(String cb04dd) {
        this.cb04dd = cb04dd;
        notifyPropertyChanged(BR.cb04dd);
    }

    @Bindable
    public String getCb04mm() {
        return cb04mm;
    }

    public void setCb04mm(String cb04mm) {
        this.cb04mm = cb04mm;
        notifyPropertyChanged(BR.cb04mm);
    }

    @Bindable
    public String getCb04yy() {
        return cb04yy;
    }

    public void setCb04yy(String cb04yy) {
        this.cb04yy = cb04yy;
        notifyPropertyChanged(BR.cb04yy);
    }

    @Bindable
    public String getCb0501() {
        return cb0501;
    }

    public void setCb0501(String cb0501) {
        this.cb0501 = cb0501;
        notifyPropertyChanged(BR.cb0501);
    }

    @Bindable
    public String getCb0502() {
        return cb0502;
    }

    public void setCb0502(String cb0502) {
        this.cb0502 = cb0502;
        notifyPropertyChanged(BR.cb0502);
    }

    @Bindable
    public String getCb06() {
        return cb06;
    }

    public void setCb06(String cb06) {
        this.cb06 = cb06;
        notifyPropertyChanged(BR.cb06);
    }

    @Bindable
    public String getCb07() {
        return cb07;
    }

    public void setCb07(String cb07) {
        this.cb07 = cb07;
        notifyPropertyChanged(BR.cb07);
    }

    @Bindable
    public String getCb08() {
        return cb08;
    }

    public void setCb08(String cb08) {
        this.cb08 = cb08;
        notifyPropertyChanged(BR.cb08);
    }

    @Bindable
    public String getCb09() {
        return cb09;
    }

    public void setCb09(String cb09) {
        this.cb09 = cb09;
        notifyPropertyChanged(BR.cb09);
    }

    @Bindable
    public String getCb10() {
        return cb10;
    }

    public void setCb10(String cb10) {
        this.cb10 = cb10;
        notifyPropertyChanged(BR.cb10);
    }

    @Bindable
    public String getCb11() {
        return cb11;
    }

    public void setCb11(String cb11) {
        this.cb11 = cb11;
        notifyPropertyChanged(BR.cb11);
    }

    @Bindable
    public String getCb12() {
        return cb12;
    }

    public void setCb12(String cb12) {
        this.cb12 = cb12;
        notifyPropertyChanged(BR.cb12);
    }

    @Bindable
    public String getCb13() {
        return cb13;
    }

    public void setCb13(String cb13) {
        this.cb13 = cb13;
        notifyPropertyChanged(BR.cb13);
    }

    @Bindable
    public String getCb14() {
        return cb14;
    }

    public void setCb14(String cb14) {
        this.cb14 = cb14;
        notifyPropertyChanged(BR.cb14);
    }

    @Bindable
    public String getCb15() {
        return cb15;
    }

    public void setCb15(String cb15) {
        this.cb15 = cb15;
        notifyPropertyChanged(BR.cb15);
    }

    @Bindable
    public String getCb16() {
        return cb16;
    }

    public void setCb16(String cb16) {
        this.cb16 = cb16;
        notifyPropertyChanged(BR.cb16);
    }

    @Bindable
    public String getIStatus() {
        return iStatus;
    }

    public void setIStatus(String iStatus) {
        this.iStatus = iStatus;
        notifyPropertyChanged(BR.iStatus);
    }

    @Bindable
    public String getIStatus96x() {
        return iStatus96x;
    }

    public void setIStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        notifyPropertyChanged(BR.iStatus96x);
    }


    public Family Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(FamilyContract.ChildTable.COLUMN_ID);
        this.uid = jsonObject.getString(FamilyContract.ChildTable.COLUMN_UID);
        this.uuid = jsonObject.getString(FamilyContract.ChildTable.COLUMN_UUID);
        this.userName = jsonObject.getString(FamilyContract.ChildTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(FamilyContract.ChildTable.COLUMN_SYSDATE);
        this.dcode = jsonObject.getString(FamilyContract.ChildTable.COLUMN_DCODE);
        this.ucode = jsonObject.getString(FamilyContract.ChildTable.COLUMN_UCODE);
        this.cluster = jsonObject.getString(FamilyContract.ChildTable.COLUMN_CLUSTER);
        this.hhno = jsonObject.getString(FamilyContract.ChildTable.COLUMN_HHNO);
        this.deviceId = jsonObject.getString(FamilyContract.ChildTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(FamilyContract.ChildTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(FamilyContract.ChildTable.COLUMN_APPVERSION);
        this.gps = jsonObject.getString(FamilyContract.ChildTable.COLUMN_GPS);
        this.endTime = jsonObject.getString(FamilyContract.ChildTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(FamilyContract.ChildTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(FamilyContract.ChildTable.COLUMN_ISTATUS96x);
        this.iStatus96x = jsonObject.getString(FamilyContract.ChildTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(FamilyContract.ChildTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(FamilyContract.ChildTable.COLUMN_SYNCED_DATE);

        this.sA = jsonObject.getString(FamilyContract.ChildTable.COLUMN_SA);

        return this;

    }


    public Family Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_UUID));
        this.userName = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_SYSDATE));
        this.dcode = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_DCODE));
        this.ucode = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_UCODE));
        this.cluster = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_CLUSTER));
        this.hhno = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_HHNO));
        this.deviceId = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_APPVERSION));
        this.gps = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_GPS));
        this.endTime = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_SYNCED_DATE));

        //For childCount
        //this.s01HH = cursor.getString(cursor.getColumnIndex(ChildContract.ChildTable.COLUMN_S01HH));

        sAHydrate(cursor.getString(cursor.getColumnIndex(FamilyContract.ChildTable.COLUMN_SA)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Family.class);
    }


    public String sAtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("cb01", cb01)
                    .put("cb02", cb02)
                    .put("cb03", cb03)
                    .put("cb04dd", cb04dd)
                    .put("cb04mm", cb04mm)
                    .put("cb04yy", cb04yy)
                    .put("cb0501", cb0501)
                    .put("cb0502", cb0502)
                    .put("cb06", cb06)
                    .put("cb07", cb07)
                    .put("cb08", cb08)
                    .put("cb09", cb09)
                    .put("cb10", cb10)
                    .put("cb11", cb11)
                    .put("cb12", cb12)
                    .put("cb13", cb13)
                    .put("cb14", cb14)
                    .put("cb15", cb15)
                    .put("cb16", cb16);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FamilyContract.ChildTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(FamilyContract.ChildTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(FamilyContract.ChildTable.COLUMN_UUID, this.uuid == null ? JSONObject.NULL : this.uuid);
            json.put(FamilyContract.ChildTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(FamilyContract.ChildTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(FamilyContract.ChildTable.COLUMN_DCODE, this.dcode == null ? JSONObject.NULL : this.dcode);
            json.put(FamilyContract.ChildTable.COLUMN_UCODE, this.ucode == null ? JSONObject.NULL : this.ucode);
            json.put(FamilyContract.ChildTable.COLUMN_CLUSTER, this.cluster == null ? JSONObject.NULL : this.cluster);
            json.put(FamilyContract.ChildTable.COLUMN_HHNO, this.hhno == null ? JSONObject.NULL : this.hhno);
            json.put(FamilyContract.ChildTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(FamilyContract.ChildTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);
            json.put(FamilyContract.ChildTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(FamilyContract.ChildTable.COLUMN_GPS, this.gps == null ? JSONObject.NULL : this.gps);
            json.put(FamilyContract.ChildTable.COLUMN_ENDINGDATETIME, this.endTime == null ? JSONObject.NULL : this.endTime);
            json.put(FamilyContract.ChildTable.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
            json.put(FamilyContract.ChildTable.COLUMN_ISTATUS96x, this.iStatus96x == null ? JSONObject.NULL : this.iStatus96x);
            json.put(FamilyContract.ChildTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(FamilyContract.ChildTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);

            //For ChildCount
            //json.put(ChildContract.ChildTable.COLUMN_S08SE, this.s08SE == null ? JSONObject.NULL : this.s08SE);

            json.put(FamilyContract.ChildTable.COLUMN_SA, new JSONObject(sAtoString()));


            if (this.sA != null && !this.sA.equals("")) {
                json.put(FamilyContract.ChildTable.COLUMN_SA, new JSONObject(this.sA));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void sAHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.cb01 = json.getString("cb01");
                this.cb02 = json.getString("cb02");
                this.cb03 = json.getString("cb03");
                this.cb04dd = json.getString("cb04dd");
                this.cb04mm = json.getString("cb04mm");
                this.cb04yy = json.getString("cb04yy");
                this.cb0501 = json.getString("cb0501");
                this.cb0502 = json.getString("cb0502");
                this.cb06 = json.getString("cb06");
                this.cb07 = json.getString("cb07");
                this.cb08 = json.getString("cb08");
                this.cb09 = json.getString("cb09");
                this.cb10 = json.getString("cb10");
                this.cb11 = json.getString("cb11");
                this.cb12 = json.getString("cb12");
                this.cb13 = json.getString("cb13");
                this.cb14 = json.getString("cb14");
                this.cb15 = json.getString("cb15");
                this.cb16 = json.getString("cb16");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}
