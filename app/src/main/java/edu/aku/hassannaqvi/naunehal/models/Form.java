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
    public String hh01;
    public String hh0201;
    public String hh0202;
    public String hh03;
    public String hh04;
    public String hh05;
    public String hh06;
    public String hh07;
    public String hh08;
    public String hh09;
    public String hh10;
    public String hh11;
    public String hh12;
    public String hh13;
    public String hh14;
    public String hh15;
    public String hh16;
    public String hh17;
    public String hh1796x;
    public String hh18;
    public String hh19;
    public String hh20;
    public String hh2096x;
    public String hh21;
    public String hh22;
    public String hh23;
    public String hh24;
    public String hh25;
    public String hh26;
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
    public String cs01;
    public String cs02;
    public String cs03;
    public String cs04;
    public String cs05;
    public String cs06;
    public String cs07;
    public String cs07961x;
    public String cs07962x;
    public String cs08;
    public String cs0801;
    public String cs0802;
    public String cs0803;
    public String cs0804;
    public String cs0805;
    public String cs0806;
    public String cs0807;
    public String cs0809;
    public String cs0810;
    public String cs0896;
    public String cs0896x;
    public String cs09;
    public String cs0996x;
    public String cs10;
    public String cs11;
    public String cs12;
    public String cs13;
    public String cs14;
    public String cs15;
    public String cs1596x;
    public String cs16;
    public String cs17;
    public String cs17961x;
    public String cs17962x;
    public String cs18;
    public String cs1896x;
    public String cs19;
    public String cs1996x;
    public String im02;
    public String im01;
    public String im03;
    public String im04_dd;
    public String im04_mm;
    public String im04_yy;
    public String im05_01_dd;
    public String im05_01_mm;
    public String im05_01_yy;
    public String im05_02_dd;
    public String im05_02_mm;
    public String im05_02_yy;
    public String im05_03_dd;
    public String im05_03_mm;
    public String im05_03_yy;
    public String im05_04_dd;
    public String im05_04_mm;
    public String im05_04_yy;
    public String im05_05_dd;
    public String im05_05_mm;
    public String im05_05_yy;
    public String im05_06_dd;
    public String im05_06_mm;
    public String im05_06_yy;
    public String im05_07_dd;
    public String im05_07_mm;
    public String im05_07_yy;
    public String im05_08_dd;
    public String im05_08_mm;
    public String im05_08_yy;
    public String im05_09_dd;
    public String im05_09_mm;
    public String im05_09_yy;
    public String im05_10_dd;
    public String im05_10_mm;
    public String im05_10_yy;
    public String im05_11_dd;
    public String im05_11_mm;
    public String im05_11_yy;
    public String im05_12_dd;
    public String im05_12_mm;
    public String im05_12_yy;
    public String im05_13_dd;
    public String im05_13_mm;
    public String im05_13_yy;
    public String im05_14_dd;
    public String im05_14_mm;
    public String im05_14_yy;
    public String im05_15_dd;
    public String im05_15_mm;
    public String im05_15_yy;
    public String im05_16_dd;
    public String im05_16_mm;
    public String im05_16_yy;
    public String im07;
    public String im08;
    public String im08a;
    public String im08b;
    public String im09;
    public String im10;
    public String im11;
    public String im12;
    public String im12_1x;
    public String im12a;
    public String im12a1x;
    public String im13;
    public String im14;
    public String im15;
    public String im15_1;
    public String im16;
    public String im17;
    public String im17_1;
    public String im18;
    public String im19;
    public String im19_1x;
    public String im20;
    public String im21;
    public String im22;
    public String im22_1;
    public String im23;
    public String im23_6x;
    public String im23a;
    public String im23b_1;
    public String im23b_2;
    public String im24;
    public String im24_96x;
    public String im25;
    public String pd01;
    public String pd02;
    public String pd03;
    public String pd04;
    public String pd05;
    public String pd0596x;
    public String pd06;
    public String pd06961x;
    public String pd06962x;
    public String pd07;
    public String pd0701x;
    public String pd08;
    public String pd09;
    public String pd10;
    public String pd1101;
    public String pd1102;
    public String pd12;
    public String pd1296x;
    public String pd13;
    public String pd13961x;
    public String pd13962x;
    public String pd14;
    public String pd1496x;
    public String pd15;
    public String pd16;
    public String pd1601;
    public String pd1602;
    public String pd1603;
    public String pd1604;
    public String pd1605;
    public String pd1606;
    public String pd1607;
    public String pd1696;
    public String pd1696x;
    public String pd17;
    public String pd1701x;
    public String pd1702x;
    public String pd1703x;
    public String pd18;
    public String pd19;
    public String pd20;
    public String pd2001;
    public String pd2002;
    public String pd2003;
    public String pd2004;
    public String pd2005;
    public String pd2006;
    public String pd2007;
    public String pd2096;
    public String pd2096x;
    public String pd21;
    public String pd2101x;
    public String pd2102x;
    public String pd2103x;
    public String pd22;
    public String bf01;
    public String bf02;
    public String bf03;
    public String bf3y;
    public String bf03m;
    public String bf3d;
    public String bf04;
    public String bf05;
    public String bf0502x;
    public String bf0503x;
    public String bf06;
    public String bf07;
    public String bf0796x;
    public String bf08;
    public String bf09;
    public String bf0996x;
    public String bf10;
    public String bf11;
    public String bf12;
    public String bf13;
    public String cv01;
    public String cv02;
    public String cv03;
    public String cv04;
    public String cv05;
    public String cv0596x;
    public String cv06;
    public String cv07;
    public String cv08;
    public String cv09;
    public String cv10;
    public String cv11;
    public String cv12;
    public String cv1296x;
    public String cv13;
    public String cv14;
    public String cv15;
    public String cv16;
    public String cv1696x;
    public String cv17;
    public String cv18;
    public String cv1896x;
    public String cv19;
    public String cv1996x;
    public String se01;
    public String se0196x;
    public String se02;
    public String se0296x;
    public String se03;
    public String se0396x;
    public String se04;
    public String se0496x;
    public String se05;
    public String se0596x;
    public String se06a;
    public String se07a;
    public String se08;
    public String se0896x;
    public String se09;
    public String se10;
    public String se1099x;
    public String se11;
    public String se1196x;
    public String se12;
    public String se1296x;
    public String se13;
    public String se14;
    public String se15;
    public String se16;
    public String se17;
    public String se1701;
    public String se1702;
    public String se1703;
    public String se1704;
    public String se1705;
    public String se1801;
    public String se1802;
    public String se1803;
    public String se1804;
    public String se1805;
    public String se1896;
    public String se189601x;
    public String se19;
    public String se1996x;
    public String se20;
    public String se2001;
    public String se2002;
    public String se2003;
    public String se2004;
    public String se2005;
    public String se2096;
    public String se2096x;
    public String se21;
    public String se2101;
    public String se2102;
    public String se2103;
    public String se2104;
    public String se2105;
    public String se2196;
    public String se2196x;
    public String se2201;
    public String se2202;
    public String se2203;
    public String se2204;
    public String se2205;
    public String se2206;
    public String se2207;
    public String se2208;
    public String se2209;
    public String se2210;
    public String se2211;
    public String se2212;
    public String se2213;
    public String se2214;
    public String se2215;
    public String se2216;
    public String se2217;
    public String se2218;
    public String se23;
    public String se24;
    public String se25;
    public String se26;
    public String se27;
    public String se2701;
    public String se2702;
    public String se2703;
    public String se2704;
    public String se28;
    public String se2801;
    public String se2802;
    public String se2803;
    public String se29;
    public String se30;
    public String se3001;
    public String se3002;
    public String se3003;
    public String se3096;
    public String se3096x;
    public String se31;
    public String se3196x;
    public String se32;
    public String se3302;
    public String se3301;
    public String se3401;
    public String se3402;
    public String se35;
    public String se36;
    public String se37;
    public String se3701;
    public String se3702;
    public String se3703;
    public String se3704;
    public String se3705;
    public String se3706;
    public String se3707;
    public String se3708;
    public String se3709;
    public String se3796;
    public String se3796x;
    public String se38;
    public String se39;
    public String se40;



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
