package edu.aku.hassannaqvi.naunehal.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import edu.aku.hassannaqvi.naunehal.BR;
import edu.aku.hassannaqvi.naunehal.core.MainApp;

public class Form extends BaseObservable {

    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    private String id;
    private String uid;
    private String userName;
    private String deviceId;
    private String deviceTag;
    private String appver;
    private String sysDate;
    private String gps;
    private String endTime;
    private String iStatus;
    private String iStatus96x;
    private String synced;
    private String syncDate;

    // SECTION VARIABLES
    private String sHH;
    private String sCB;
    private String sCS;
    private String sIM;
    private String sDD;
    private String sBF;
    private String sCV;
    private String sSE;

    // FIELD VARIABLES
    private String hh05;
    private String hh06;
    private String hh08;
    private String hh09;


    public Form() {

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

    public Form setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public Form setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Form setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Form setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Form setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Form setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getGps() {
        return gps;
    }

    public Form setGps(String gps) {
        this.gps = gps;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Form setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Bindable
    public String getiStatus() {
        return iStatus;
    }

    public Form setiStatus(String iStatus) {
        this.iStatus = iStatus;
        return this;
    }

    @Bindable
    public String getiStatus96x() {
        return iStatus96x;
    }

    public Form setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        return this;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public Form setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Form setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    public String getsHH() {
        return sHH;
    }

    public Form setsHH(String sHH) {
        this.sHH = sHH;
        return this;
    }

    public String getsCB() {
        return sCB;
    }

    public Form setsCB(String sCB) {
        this.sCB = sCB;
        return this;
    }

    public String getsCS() {
        return sCS;
    }

    public Form setsCS(String sCS) {
        this.sCS = sCS;
        return this;
    }

    public String getsIM() {
        return sIM;
    }

    public Form setsIM(String sIM) {
        this.sIM = sIM;
        return this;
    }

    public String getsDD() {
        return sDD;
    }

    public Form setsDD(String sDD) {
        this.sDD = sDD;
        return this;
    }

    public String getsBF() {
        return sBF;
    }

    public Form setsBF(String sBF) {
        this.sBF = sBF;
        return this;
    }

    public String getsCV() {
        return sCV;
    }

    public Form setsCV(String sCV) {
        this.sCV = sCV;
        return this;
    }

    public String getsSE() {
        return sSE;
    }

    public Form setsSE(String sSE) {
        this.sSE = sSE;
        return this;
    }


    @Bindable
    public String getHh05() {
        return hh05;
    }

    public void setHh05(String hh05) {
        this.hh05 = hh05;
        notifyPropertyChanged(BR.hh05);
    }

    @Bindable
    public String getHh06() {
        return hh06;
    }

    public void setHh06(String hh06) {
        this.hh06 = hh06;
        notifyPropertyChanged(BR.hh06);
    }

    @Bindable
    public String getHh08() {
        return hh08;
    }

    public void setHh08(String hh08) {
        this.hh08 = hh08;
        notifyPropertyChanged(BR.hh08);
    }

    @Bindable
    public String getHh09() {
        return hh09;
    }

    public void setHh09(String hh09) {
        this.hh09 = hh09;
        notifyPropertyChanged(BR.hh09);
    }
}
