package edu.aku.hassannaqvi.casiregister.models;

import android.database.Cursor;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;
import org.threeten.bp.LocalDate;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import edu.aku.hassannaqvi.casiregister.BR;
import edu.aku.hassannaqvi.casiregister.contracts.FormsContract;
import edu.aku.hassannaqvi.casiregister.core.MainApp;

public class Form extends BaseObservable {

    private final String TAG = "Form";

    // Section01 U5 - Screening Log
    public String cs01 = "";
    public String cs01a = "";
    public String cs01b = "";
    public String cs02 = "";
    public String cs03 = "";
    public String cs04 = "";
    public String cs05 = "";
    public String cs05a = "";
    public String cs06 = "";
    public String cs06096x = "";
    public String cs07 = "";
    public String cs0801 = "";
    public String cs0802 = "";
    public String cs0803 = "";
    public String cs09 = "";
    public String cs10 = "";
    public String cs10a = "";
    public String cs11 = "";
    public String cs11a = "";
    public String cs12 = "";
    public String cs12a = "";
    public String cs13 = "";
    public String cs1401 = "";
    public String cs1402 = "";
    public String cs1403 = "";
    public String cs1501 = "";
    public String cs1502 = "";
    public String cs16 = "";
    public String cs17 = "";
    public String cs18 = "";
    public String cs19 = "";
    public String cs20a = "";
    public String cs20b = "";
    public String cs21 = "";
    public String cs22 = "";
    public String cs23 = "";
    public String cs24 = "";
    public String cs2401 = "";
    public String cs2402 = "";
    public String cs2403 = "";
    public String cs2404 = "";
    public String cs2405 = "";
    public String cs2406 = "";
    public String cs25 = "";
    public String cs25a01 = "";
    public String cs25b01 = "";
    public String cs25c = "";
    public String cs25c096x = "";
    public String cs26 = "";
    public String cs2601 = "";
    public String cs2602 = "";
    public String cs2603 = "";
    public String cs2604 = "";
    public String cs2605 = "";
    public String cs2701 = "";
    public String cs2702 = "";
    public String cs2703 = "";
    public String cs2704 = "";
    public String cs28a = "";
    public String cs28b = "";
    public String cs28c = "";
    public String cs28d = "";
    public String cs28e = "";
    public String cs28f = "";
    public String cs28f01x = "";
    public String cs29 = "";
    public String cs30a = "";
    public String cs30b = "";
    public String cs30c = "";
    public String cs30d = "";
    public String cs30e = "";
    public String cs30f = "";
    public String cs30f096x = "";
    public String cs31 = "";
    public String cs32a = "";
    public String cs32b = "";
    public String cs32c = "";
    public String cs32d = "";
    public String cs32e = "";
    public String cs32f = "";
    public String cs32g = "";
    public String cs32h = "";
    public String cs32h096x = "";

    // Section02 U5 - Follow-up
    public String fc01 = "";
    public String fc01a = "";
    public String fc01b = "";
    public String fc02 = "";
    public String fc03 = "";
    public String fc04 = "";
    public String fc05 = "";
    public String fc05a = "";
    public String fc06 = "";
    public String fc0696x = "";
    public String fc07 = "";
    public String fc0801 = "";
    public String fc0802 = "";
    public String fc0803 = "";
    public String fc09 = "";
    public String fc10 = "";
    public String fc15 = "";
    public String fc15a = "";
    public String fc16 = "";
    public String fc16a = "";
    public String fc16b = "";
    public String fc16b96x = "";
    public String fc1701 = "";
    public String fc1702 = "";
    public String fc18 = "";
    public String fc19 = "";
    public String fc20 = "";
    public String fc21 = "";
    public String fc22 = "";
    public String fc23 = "";
    public String fc24 = "";
    public String fc25 = "";
    public String fc26 = "";
    public String fc2701 = "";
    public String fc2702 = "";
    public String fc2703 = "";
    public String fc2704 = "";
    public String fc28 = "";
    public String fc29 = "";
    public String fc2901 = "";
    public String fc2902 = "";
    public String fc2903 = "";
    public String fc2905 = "";
    public String fc2996 = "";
    public String fc2996x = "";
    public String fc30 = "";
    public String fc31 = "";
    public String fc3201 = "";
    public String fc3202 = "";
    public String fc3203 = "";
    public String fc3301 = "";
    public String fc3302 = "";
    public String fc3303 = "";
    public String fc34 = "";
    public String fc3501 = "";
    public String fc3601 = "";
    public String fc37 = "";
    public String fc3796x = "";
    public String fc38 = "";


    //    Section03 WRAs - Screening Log
    public String ws01 = "";
    public String ws01a = "";
    public String ws01b = "";
    public String ws02 = "";
    public String ws03 = "";
    public String ws04 = "";
    public String ws05 = "";
    public String ws05a = "";
    public String ws06 = "";
    public String ws0696x = "";
    public String ws07 = "";
    public String ws0801 = "";
    public String ws0802 = "";
    public String ws0803 = "";
    public String ws09 = "";
    public String ws10 = "";
    public String ws11 = "";
    public String ws12 = "";
    public String ws12a = "";
    public String ws13 = "";
    public String ws14 = "";
    public String ws15 = "";
    public String ws16 = "";
    public String ws17 = "";
    public String ws18 = "";
    public String ws19 = "";
    public String ws20 = "";
    public String ws21 = "";
    public String ws22 = "";
    public String ws2296x = "";
    public String ws2301 = "";
    public String ws2302 = "";
    public String ws2303 = "";
    public String ws25a = "";
    public String ws25b = "";
    public String ws25c = "";
    public String ws25d = "";
    public String ws25e = "";
    public String ws25f = "";
    public String ws25g = "";
    public String ws25h = "";
    public String ws25i = "";
    public String ws25j = "";
    public String ws25k = "";
    public String ws25k01x = "";

    //    Section04 WRAs - Follow-up
    public String fw01 = "";
    public String fw01a = "";
    public String fw01b = "";
    public String fw02 = "";
    public String fw03 = "";
    public String fw04 = "";
    public String fw05 = "";
    public String fw05a = "";
    public String fw06 = "";
    public String fw0696x = "";
    public String fw07 = "";
    public String fw0801 = "";
    public String fw0802 = "";
    public String fw0803 = "";
    public String fw09 = "";
    public String fw10 = "";
    public String fw11 = "";
    public String fw12 = "";
    public String fw12a = "";
    public String fw12b = "";
    public String fw12b96x = "";
    public String fw13 = "";
    public String fw14 = "";
    public String fw15 = "";
    public String fw16 = "";
    public String fw17 = "";
    public String fw18 = "";
    public String fw19 = "";
    public String fw2001 = "";
    public String fw21 = "";
    public String fw22 = "";
    public String fw2301 = "";
    public String fw24 = "";
    public String fw25 = "";
    public String fw26 = "";
    public String fw27 = "";
    public String fw28 = "";
    public String fw2896x = "";
    public String fws29a = "";
    public String fws29b = "";
    public String fws29c = "";
    public String fws29d = "";
    public String fws29e = "";
    public String fws29f = "";
    public String fws29g = "";
    public String fws29h = "";
    public String fws29i = "";
    public String fws29j = "";
    public String fws29k = "";
    public String fws29k96x = "";


    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    private String id = "";
    private String uid = "";
    private String userName = "";
    private String sysDate = "";
    private String dcode = "";
    private String ucode = "";
    private String cluster = "";
    private String hhno = "";
    private String deviceId = "";
    private String deviceTag = "";
    private String appver = "";
    private String gps = "";
    private String endTime = "";
    private String iStatus = "";
    private String iStatus96x = "";
    private String synced = "";
    private String syncDate = "";
    private String childrespondent = "";

    // SECTION VARIABLES
    private String s01CS = "";
    private String s02FC = "";
    private String s03WS = "";
    private String s04FW = "";


    //Not saving in DB
    private LocalDate localDate = null;

    public Form() {

    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setForm(String userName, String sysDate, String dcode, String ucode, String cluster, String hhno, String deviceId, String deviceTag, String appver, String gps) {
        this.userName = userName;
        this.sysDate = sysDate;
        this.dcode = dcode;
        this.ucode = ucode;
        this.cluster = cluster;
        this.hhno = hhno;
        this.deviceId = deviceId;
        this.deviceTag = deviceTag;
        this.appver = appver;
        this.gps = gps;
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
    public String getDcode() {
        return dcode;
    }

    public Form setDcode(String dcode) {
        this.dcode = dcode;
        return this;
    }


    @Bindable
    public String getUcode() {
        return ucode;
    }

    public Form setUcode(String ucode) {
        this.ucode = ucode;
        return this;
    }


    @Bindable
    public String getCluster() {
        return cluster;
    }

    public Form setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }


    @Bindable
    public String getHhno() {
        return hhno;
    }

    public Form setHhno(String hhno) {
        this.hhno = hhno;
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


    public String getChildrespondent() {
        return childrespondent;
    }

    public Form setChildrespondent(String childrespondent) {
        this.childrespondent = childrespondent;
        return this;
    }

    @Bindable
    public String getS01CS() {
        return s01CS;
    }

    public void setS01CS(String s01CS) {
        this.s01CS = s01CS;
    }

    @Bindable
    public String getS02FC() {
        return s02FC;
    }

    public Form setS02FC(String s02FC) {
        this.s02FC = s02FC;
        return this;
    }

    @Bindable
    public String getS03WS() {
        return s03WS;
    }

    public Form setS03WS(String s03WS) {
        this.s03WS = s03WS;
        return this;
    }

    @Bindable
    public String getS04FW() {
        return s04FW;
    }

    public Form setS04FW(String s04FW) {
        this.s04FW = s04FW;
        return this;
    }


    // Section01 U5 - Screening Log

    @Bindable
    public String getCs01() {
        return cs01;
    }

    public void setCs01(String cs01) {
        this.cs01 = cs01;
        notifyPropertyChanged(BR.cs01);
    }

    @Bindable
    public String getCs01a() {
        return cs01a;
    }

    public void setCs01a(String cs01a) {
        this.cs01a = cs01a;
        notifyPropertyChanged(BR.cs01a);
    }

    @Bindable
    public String getCs01b() {
        return cs01b;
    }

    public void setCs01b(String cs01b) {
        this.cs01b = cs01b;
        notifyPropertyChanged(BR.cs01b);
    }

    @Bindable
    public String getCs02() {
        return cs02;
    }

    public void setCs02(String cs02) {
        this.cs02 = cs02;
        notifyPropertyChanged(BR.cs02);
    }

    @Bindable
    public String getCs03() {
        return cs03;
    }

    public void setCs03(String cs03) {
        this.cs03 = cs03;
        notifyPropertyChanged(BR.cs03);
    }

    @Bindable
    public String getCs04() {
        return cs04;
    }

    public void setCs04(String cs04) {
        this.cs04 = cs04;
        notifyPropertyChanged(BR.cs04);
    }

    @Bindable
    public String getCs05() {
        return cs05;
    }

    public void setCs05(String cs05) {
        this.cs05 = cs05;
        notifyPropertyChanged(BR.cs05);
    }

    @Bindable
    public String getCs05a() {
        return cs05a;
    }

    public void setCs05a(String cs05a) {
        this.cs05a = cs05a;
        notifyPropertyChanged(BR.cs05a);
    }

    @Bindable
    public String getCs06() {
        return cs06;
    }

    public void setCs06(String cs06) {
        this.cs06 = cs06;
        notifyPropertyChanged(BR.cs06);
    }

    @Bindable
    public String getCs06096x() {
        return cs06096x;
    }

    public void setCs06096x(String cs06096x) {
        this.cs06096x = cs06096x;
        notifyPropertyChanged(BR.cs06096x);
    }

    @Bindable
    public String getCs07() {
        return cs07;
    }

    public void setCs07(String cs07) {
        this.cs07 = cs07;
        notifyPropertyChanged(BR.cs07);
    }

    @Bindable
    public String getCs0801() {
        return cs0801;
    }

    public void setCs0801(String cs0801) {
        this.cs0801 = cs0801;
        notifyPropertyChanged(BR.cs0801);
    }

    @Bindable
    public String getCs0802() {
        return cs0802;
    }

    public void setCs0802(String cs0802) {
        this.cs0802 = cs0802;
        notifyPropertyChanged(BR.cs0802);
    }

    @Bindable
    public String getCs0803() {
        return cs0803;
    }

    public void setCs0803(String cs0803) {
        this.cs0803 = cs0803;
        notifyPropertyChanged(BR.cs0803);
    }

    @Bindable
    public String getCs09() {
        return cs09;
    }

    public void setCs09(String cs09) {
        this.cs09 = cs09;
        notifyPropertyChanged(BR.cs09);
    }

    @Bindable
    public String getCs10() {
        return cs10;
    }

    public void setCs10(String cs10) {
        this.cs10 = cs10;
        notifyPropertyChanged(BR.cs10);
    }

    @Bindable
    public String getCs10a() {
        return cs10a;
    }

    public void setCs10a(String cs10a) {
        this.cs10a = cs10a;
        notifyPropertyChanged(BR.cs10a);
    }

    @Bindable
    public String getCs11() {
        return cs11;
    }

    public void setCs11(String cs11) {
        this.cs11 = cs11;
        notifyPropertyChanged(BR.cs11);
    }

    @Bindable
    public String getCs11a() {
        return cs11a;
    }

    public void setCs11a(String cs11a) {
        this.cs11a = cs11a;
        notifyPropertyChanged(BR.cs11a);
    }

    @Bindable
    public String getCs12() {
        return cs12;
    }

    public void setCs12(String cs12) {
        this.cs12 = cs12;
        notifyPropertyChanged(BR.cs12);
    }

    @Bindable
    public String getCs12a() {
        return cs12a;
    }

    public void setCs12a(String cs12a) {
        this.cs12a = cs12a;
        notifyPropertyChanged(BR.cs12a);
    }

    @Bindable
    public String getCs13() {
        return cs13;
    }

    public void setCs13(String cs13) {
        this.cs13 = cs13;
        notifyPropertyChanged(BR.cs13);
    }

    @Bindable
    public String getCs1401() {
        return cs1401;
    }

    public void setCs1401(String cs1401) {
        this.cs1401 = cs1401;
        notifyPropertyChanged(BR.cs1401);
    }

    @Bindable
    public String getCs1402() {
        return cs1402;
    }

    public void setCs1402(String cs1402) {
        this.cs1402 = cs1402;
        notifyPropertyChanged(BR.cs1402);
    }

    @Bindable
    public String getCs1403() {
        return cs1403;
    }

    public void setCs1403(String cs1403) {
        this.cs1403 = cs1403;
        notifyPropertyChanged(BR.cs1403);
    }

    @Bindable
    public String getCs1501() {
        return cs1501;
    }

    public void setCs1501(String cs1501) {
        this.cs1501 = cs1501;
        notifyPropertyChanged(BR.cs1501);
    }

    @Bindable
    public String getCs1502() {
        return cs1502;
    }

    public void setCs1502(String cs1502) {
        this.cs1502 = cs1502;
        notifyPropertyChanged(BR.cs1502);
    }

    @Bindable
    public String getCs16() {
        return cs16;
    }

    public void setCs16(String cs16) {
        this.cs16 = cs16;
        notifyPropertyChanged(BR.cs16);
    }

    @Bindable
    public String getCs17() {
        return cs17;
    }

    public void setCs17(String cs17) {
        this.cs17 = cs17;
        notifyPropertyChanged(BR.cs17);
    }

    @Bindable
    public String getCs18() {
        return cs18;
    }

    public void setCs18(String cs18) {
        this.cs18 = cs18;
        notifyPropertyChanged(BR.cs18);
    }

    @Bindable
    public String getCs19() {
        return cs19;
    }

    public void setCs19(String cs19) {
        this.cs19 = cs19;
        notifyPropertyChanged(BR.cs19);
    }

    @Bindable
    public String getCs20a() {
        return cs20a;
    }

    public void setCs20a(String cs20a) {
        this.cs20a = cs20a;
        notifyPropertyChanged(BR.cs20a);
    }

    @Bindable
    public String getCs20b() {
        return cs20b;
    }

    public void setCs20b(String cs20b) {
        this.cs20b = cs20b;
        notifyPropertyChanged(BR.cs20b);
    }

    @Bindable
    public String getCs21() {
        return cs21;
    }

    public void setCs21(String cs21) {
        this.cs21 = cs21;
        notifyPropertyChanged(BR.cs21);
    }

    @Bindable
    public String getCs22() {
        return cs22;
    }

    public void setCs22(String cs22) {
        this.cs22 = cs22;
        notifyPropertyChanged(BR.cs22);
    }

    @Bindable
    public String getCs23() {
        return cs23;
    }

    public void setCs23(String cs23) {
        this.cs23 = cs23;
        notifyPropertyChanged(BR.cs23);
    }

    @Bindable
    public String getCs24() {
        return cs24;
    }

    public void setCs24(String cs24) {
        this.cs24 = cs24;
        notifyPropertyChanged(BR.cs24);
    }

    @Bindable
    public String getCs2401() {
        return cs2401;
    }

    public void setCs2401(String cs2401) {
        this.cs2401 = cs2401;
        notifyPropertyChanged(BR.cs2401);
    }

    @Bindable
    public String getCs2402() {
        return cs2402;
    }

    public void setCs2402(String cs2402) {
        this.cs2402 = cs2402;
        notifyPropertyChanged(BR.cs2402);
    }

    @Bindable
    public String getCs2403() {
        return cs2403;
    }

    public void setCs2403(String cs2403) {
        this.cs2403 = cs2403;
        notifyPropertyChanged(BR.cs2403);
    }

    @Bindable
    public String getCs2404() {
        return cs2404;
    }

    public void setCs2404(String cs2404) {
        this.cs2404 = cs2404;
        notifyPropertyChanged(BR.cs2404);
    }

    @Bindable
    public String getCs2405() {
        return cs2405;
    }

    public void setCs2405(String cs2405) {
        this.cs2405 = cs2405;
        notifyPropertyChanged(BR.cs2405);
    }

    @Bindable
    public String getCs2406() {
        return cs2406;
    }

    public void setCs2406(String cs2406) {
        this.cs2406 = cs2406;
        notifyPropertyChanged(BR.cs2406);
    }

    @Bindable
    public String getCs25() {
        return cs25;
    }

    public void setCs25(String cs25) {
        this.cs25 = cs25;
        notifyPropertyChanged(BR.cs25);
    }

    @Bindable
    public String getCs25a01() {
        return cs25a01;
    }

    public void setCs25a01(String cs25a01) {
        this.cs25a01 = cs25a01;
        notifyPropertyChanged(BR.cs25a01);
    }

    @Bindable
    public String getCs25b01() {
        return cs25b01;
    }

    public void setCs25b01(String cs25b01) {
        this.cs25b01 = cs25b01;
        notifyPropertyChanged(BR.cs25b01);
    }

    @Bindable
    public String getCs25c() {
        return cs25c;
    }

    public void setCs25c(String cs25c) {
        this.cs25c = cs25c;
        notifyPropertyChanged(BR.cs25c);
    }

    @Bindable
    public String getCs25c096x() {
        return cs25c096x;
    }

    public void setCs25c096x(String cs25c096x) {
        this.cs25c096x = cs25c096x;
        notifyPropertyChanged(BR.cs25c096x);
    }

    @Bindable
    public String getCs26() {
        return cs26;
    }

    public void setCs26(String cs26) {
        this.cs26 = cs26;
        notifyPropertyChanged(BR.cs26);
    }

    @Bindable
    public String getCs2601() {
        return cs2601;
    }

    public void setCs2601(String cs2601) {
        this.cs2601 = cs2601;
        notifyPropertyChanged(BR.cs2601);
    }

    @Bindable
    public String getCs2602() {
        return cs2602;
    }

    public void setCs2602(String cs2602) {
        this.cs2602 = cs2602;
        notifyPropertyChanged(BR.cs2602);
    }

    @Bindable
    public String getCs2603() {
        return cs2603;
    }

    public void setCs2603(String cs2603) {
        this.cs2603 = cs2603;
        notifyPropertyChanged(BR.cs2603);
    }

    @Bindable
    public String getCs2604() {
        return cs2604;
    }

    public void setCs2604(String cs2604) {
        this.cs2604 = cs2604;
        notifyPropertyChanged(BR.cs2604);
    }

    @Bindable
    public String getCs2605() {
        return cs2605;
    }

    public void setCs2605(String cs2605) {
        this.cs2605 = cs2605;
        notifyPropertyChanged(BR.cs2605);
    }

    @Bindable
    public String getCs2701() {
        return cs2701;
    }

    public void setCs2701(String cs2701) {
        this.cs2701 = cs2701;
        notifyPropertyChanged(BR.cs2701);
    }

    @Bindable
    public String getCs2702() {
        return cs2702;
    }

    public void setCs2702(String cs2702) {
        this.cs2702 = cs2702;
        notifyPropertyChanged(BR.cs2702);
    }

    @Bindable
    public String getCs2703() {
        return cs2703;
    }

    public void setCs2703(String cs2703) {
        this.cs2703 = cs2703;
        notifyPropertyChanged(BR.cs2703);
    }

    @Bindable
    public String getCs2704() {
        return cs2704;
    }

    public void setCs2704(String cs2704) {
        this.cs2704 = cs2704;
        notifyPropertyChanged(BR.cs2704);
    }

    @Bindable
    public String getCs28a() {
        return cs28a;
    }

    public void setCs28a(String cs28a) {
        this.cs28a = cs28a;
        notifyPropertyChanged(BR.cs28a);
    }

    @Bindable
    public String getCs28b() {
        return cs28b;
    }

    public void setCs28b(String cs28b) {
        this.cs28b = cs28b;
        notifyPropertyChanged(BR.cs28b);
    }

    @Bindable
    public String getCs28c() {
        return cs28c;
    }

    public void setCs28c(String cs28c) {
        this.cs28c = cs28c;
        notifyPropertyChanged(BR.cs28c);
    }

    @Bindable
    public String getCs28d() {
        return cs28d;
    }

    public void setCs28d(String cs28d) {
        this.cs28d = cs28d;
        notifyPropertyChanged(BR.cs28d);
    }

    @Bindable
    public String getCs28e() {
        return cs28e;
    }

    public void setCs28e(String cs28e) {
        this.cs28e = cs28e;
        notifyPropertyChanged(BR.cs28e);
    }

    @Bindable
    public String getCs28f() {
        return cs28f;
    }

    public void setCs28f(String cs28f) {
        this.cs28f = cs28f;
        notifyPropertyChanged(BR.cs28f);
    }

    @Bindable
    public String getCs28f01x() {
        return cs28f01x;
    }

    public void setCs28f01x(String cs28f01x) {
        this.cs28f01x = cs28f01x;
        notifyPropertyChanged(BR.cs28f01x);
    }

    @Bindable
    public String getCs29() {
        return cs29;
    }

    public void setCs29(String cs29) {
        this.cs29 = cs29;
        notifyPropertyChanged(BR.cs29);
    }

    @Bindable
    public String getCs30a() {
        return cs30a;
    }

    public void setCs30a(String cs30a) {
        this.cs30a = cs30a;
        notifyPropertyChanged(BR.cs30a);
    }

    @Bindable
    public String getCs30b() {
        return cs30b;
    }

    public void setCs30b(String cs30b) {
        this.cs30b = cs30b;
        notifyPropertyChanged(BR.cs30b);
    }

    @Bindable
    public String getCs30c() {
        return cs30c;
    }

    public void setCs30c(String cs30c) {
        this.cs30c = cs30c;
        notifyPropertyChanged(BR.cs30c);
    }

    @Bindable
    public String getCs30d() {
        return cs30d;
    }

    public void setCs30d(String cs30d) {
        this.cs30d = cs30d;
        notifyPropertyChanged(BR.cs30d);
    }

    @Bindable
    public String getCs30e() {
        return cs30e;
    }

    public void setCs30e(String cs30e) {
        this.cs30e = cs30e;
        notifyPropertyChanged(BR.cs30e);
    }

    @Bindable
    public String getCs30f() {
        return cs30f;
    }

    public void setCs30f(String cs30f) {
        this.cs30f = cs30f;
        notifyPropertyChanged(BR.cs30f);
    }

    @Bindable
    public String getCs30f096x() {
        return cs30f096x;
    }

    public void setCs30f096x(String cs30f096x) {
        this.cs30f096x = cs30f096x;
        notifyPropertyChanged(BR.cs30f096x);
    }

    @Bindable
    public String getCs31() {
        return cs31;
    }

    public void setCs31(String cs31) {
        this.cs31 = cs31;
        notifyPropertyChanged(BR.cs31);
    }

    @Bindable
    public String getCs32a() {
        return cs32a;
    }

    public void setCs32a(String cs32a) {
        this.cs32a = cs32a;
        notifyPropertyChanged(BR.cs32a);
    }

    @Bindable
    public String getCs32b() {
        return cs32b;
    }

    public void setCs32b(String cs32b) {
        this.cs32b = cs32b;
        notifyPropertyChanged(BR.cs32b);
    }

    @Bindable
    public String getCs32c() {
        return cs32c;
    }

    public void setCs32c(String cs32c) {
        this.cs32c = cs32c;
        notifyPropertyChanged(BR.cs32c);
    }

    @Bindable
    public String getCs32d() {
        return cs32d;
    }

    public void setCs32d(String cs32d) {
        this.cs32d = cs32d;
        notifyPropertyChanged(BR.cs32d);
    }

    @Bindable
    public String getCs32e() {
        return cs32e;
    }

    public void setCs32e(String cs32e) {
        this.cs32e = cs32e;
        notifyPropertyChanged(BR.cs32e);
    }

    @Bindable
    public String getCs32f() {
        return cs32f;
    }

    public void setCs32f(String cs32f) {
        this.cs32f = cs32f;
        notifyPropertyChanged(BR.cs32f);
    }

    @Bindable
    public String getCs32g() {
        return cs32g;
    }

    public void setCs32g(String cs32g) {
        this.cs32g = cs32g;
        notifyPropertyChanged(BR.cs32g);
    }

    @Bindable
    public String getCs32h() {
        return cs32h;
    }

    public void setCs32h(String cs32h) {
        this.cs32h = cs32h;
        notifyPropertyChanged(BR.cs32h);
    }

    @Bindable
    public String getCs32h096x() {
        return cs32h096x;
    }

    public void setCs32h096x(String cs32h096x) {
        this.cs32h096x = cs32h096x;
        notifyPropertyChanged(BR.cs32h096x);
    }

    //    Section02 U5 - Follow-up
    @Bindable
    public String getFc01() {
        return fc01;
    }

    public void setFc01(String fc01) {
        this.fc01 = fc01;
        notifyPropertyChanged(BR.fc01);
    }

    @Bindable
    public String getFc01a() {
        return fc01a;
    }

    public void setFc01a(String fc01a) {
        this.fc01a = fc01a;
        notifyPropertyChanged(BR.fc01a);
    }

    @Bindable
    public String getFc01b() {
        return fc01b;
    }

    public void setFc01b(String fc01b) {
        this.fc01b = fc01b;
        notifyPropertyChanged(BR.fc01b);
    }

    @Bindable
    public String getFc02() {
        return fc02;
    }

    public void setFc02(String fc02) {
        this.fc02 = fc02;
        notifyPropertyChanged(BR.fc02);
    }

    @Bindable
    public String getFc03() {
        return fc03;
    }

    public void setFc03(String fc03) {
        this.fc03 = fc03;
        notifyPropertyChanged(BR.fc03);
    }

    @Bindable
    public String getFc04() {
        return fc04;
    }

    public void setFc04(String fc04) {
        this.fc04 = fc04;
        notifyPropertyChanged(BR.fc04);
    }

    @Bindable
    public String getFc05() {
        return fc05;
    }

    public void setFc05(String fc05) {
        this.fc05 = fc05;
        notifyPropertyChanged(BR.fc05);
    }

    @Bindable
    public String getFc05a() {
        return fc05a;
    }

    public void setFc05a(String fc05a) {
        this.fc05a = fc05a;
        notifyPropertyChanged(BR.fc05a);
    }

    @Bindable
    public String getFc06() {
        return fc06;
    }

    public void setFc06(String fc06) {
        this.fc06 = fc06;
        notifyPropertyChanged(BR.fc06);
    }

    @Bindable
    public String getFc0696x() {
        return fc0696x;
    }

    public void setFc0696x(String fc0696x) {
        this.fc0696x = fc0696x;
        notifyPropertyChanged(BR.fc0696x);
    }

    @Bindable
    public String getFc07() {
        return fc07;
    }

    public void setFc07(String fc07) {
        this.fc07 = fc07;
        notifyPropertyChanged(BR.fc07);
    }

    @Bindable
    public String getFc0801() {
        return fc0801;
    }

    public void setFc0801(String fc0801) {
        this.fc0801 = fc0801;
        notifyPropertyChanged(BR.fc0801);
    }

    @Bindable
    public String getFc0802() {
        return fc0802;
    }

    public void setFc0802(String fc0802) {
        this.fc0802 = fc0802;
        notifyPropertyChanged(BR.fc0802);
    }

    @Bindable
    public String getFc0803() {
        return fc0803;
    }

    public void setFc0803(String fc0803) {
        this.fc0803 = fc0803;
        notifyPropertyChanged(BR.fc0803);
    }

    @Bindable
    public String getFc09() {
        return fc09;
    }

    public void setFc09(String fc09) {
        this.fc09 = fc09;
        notifyPropertyChanged(BR.fc09);
    }

    @Bindable
    public String getFc10() {
        return fc10;
    }

    public void setFc10(String fc10) {
        this.fc10 = fc10;
        notifyPropertyChanged(BR.fc10);
    }

    @Bindable
    public String getFc15() {
        return fc15;
    }

    public void setFc15(String fc15) {
        this.fc15 = fc15;
        notifyPropertyChanged(BR.fc15);
    }

    @Bindable
    public String getFc15a() {
        return fc15a;
    }

    public void setFc15a(String fc15a) {
        this.fc15a = fc15a;
        notifyPropertyChanged(BR.fc15a);
    }

    @Bindable
    public String getFc16() {
        return fc16;
    }

    public void setFc16(String fc16) {
        this.fc16 = fc16;
        notifyPropertyChanged(BR.fc16);
    }

    @Bindable
    public String getFc16a() {
        return fc16a;
    }

    public void setFc16a(String fc16a) {
        this.fc16a = fc16a;
        notifyPropertyChanged(BR.fc16a);
    }

    @Bindable
    public String getFc16b() {
        return fc16b;
    }

    public void setFc16b(String fc16b) {
        this.fc16b = fc16b;
        notifyPropertyChanged(BR.fc16b);
    }

    @Bindable
    public String getFc16b96x() {
        return fc16b96x;
    }

    public void setFc16b96x(String fc16b96x) {
        this.fc16b96x = fc16b96x;
        notifyPropertyChanged(BR.fc16b96x);
    }

    @Bindable
    public String getFc1701() {
        return fc1701;
    }

    public void setFc1701(String fc1701) {
        this.fc1701 = fc1701;
        notifyPropertyChanged(BR.fc1701);
    }

    @Bindable
    public String getFc1702() {
        return fc1702;
    }

    public void setFc1702(String fc1702) {
        this.fc1702 = fc1702;
        notifyPropertyChanged(BR.fc1702);
    }

    @Bindable
    public String getFc18() {
        return fc18;
    }

    public void setFc18(String fc18) {
        this.fc18 = fc18;
        notifyPropertyChanged(BR.fc18);
    }

    @Bindable
    public String getFc19() {
        return fc19;
    }

    public void setFc19(String fc19) {
        this.fc19 = fc19;
        notifyPropertyChanged(BR.fc19);
    }

    @Bindable
    public String getFc20() {
        return fc20;
    }

    public void setFc20(String fc20) {
        this.fc20 = fc20;
        notifyPropertyChanged(BR.fc20);
    }

    @Bindable
    public String getFc21() {
        return fc21;
    }

    public void setFc21(String fc21) {
        this.fc21 = fc21;
        notifyPropertyChanged(BR.fc21);
    }

    @Bindable
    public String getFc22() {
        return fc22;
    }

    public void setFc22(String fc22) {
        this.fc22 = fc22;
        notifyPropertyChanged(BR.fc22);
    }

    @Bindable
    public String getFc23() {
        return fc23;
    }

    public void setFc23(String fc23) {
        this.fc23 = fc23;
        notifyPropertyChanged(BR.fc23);
    }

    @Bindable
    public String getFc24() {
        return fc24;
    }

    public void setFc24(String fc24) {
        this.fc24 = fc24;
        notifyPropertyChanged(BR.fc24);
    }

    @Bindable
    public String getFc25() {
        return fc25;
    }

    public void setFc25(String fc25) {
        this.fc25 = fc25;
        notifyPropertyChanged(BR.fc25);
    }

    @Bindable
    public String getFc26() {
        return fc26;
    }

    public void setFc26(String fc26) {
        this.fc26 = fc26;
        notifyPropertyChanged(BR.fc26);
    }

    @Bindable
    public String getFc2701() {
        return fc2701;
    }

    public void setFc2701(String fc2701) {
        this.fc2701 = fc2701;
        notifyPropertyChanged(BR.fc2701);
    }

    @Bindable
    public String getFc2702() {
        return fc2702;
    }

    public void setFc2702(String fc2702) {
        this.fc2702 = fc2702;
        notifyPropertyChanged(BR.fc2702);
    }

    @Bindable
    public String getFc2703() {
        return fc2703;
    }

    public void setFc2703(String fc2703) {
        this.fc2703 = fc2703;
        notifyPropertyChanged(BR.fc2703);
    }

    @Bindable
    public String getFc2704() {
        return fc2704;
    }

    public void setFc2704(String fc2704) {
        this.fc2704 = fc2704;
        notifyPropertyChanged(BR.fc2704);
    }

    @Bindable
    public String getFc28() {
        return fc28;
    }

    public void setFc28(String fc28) {
        this.fc28 = fc28;
        notifyPropertyChanged(BR.fc28);
    }

    @Bindable
    public String getFc29() {
        return fc29;
    }

    public void setFc29(String fc29) {
        this.fc29 = fc29;
        notifyPropertyChanged(BR.fc29);
    }

    @Bindable
    public String getFc2901() {
        return fc2901;
    }

    public void setFc2901(String fc2901) {
        this.fc2901 = fc2901;
        notifyPropertyChanged(BR.fc2901);
    }

    @Bindable
    public String getFc2902() {
        return fc2902;
    }

    public void setFc2902(String fc2902) {
        this.fc2902 = fc2902;
        notifyPropertyChanged(BR.fc2902);
    }

    @Bindable
    public String getFc2903() {
        return fc2903;
    }

    public void setFc2903(String fc2903) {
        this.fc2903 = fc2903;
        notifyPropertyChanged(BR.fc2903);
    }

    @Bindable
    public String getFc2905() {
        return fc2905;
    }

    public void setFc2905(String fc2905) {
        this.fc2905 = fc2905;
        notifyPropertyChanged(BR.fc2905);
    }

    @Bindable
    public String getFc2996() {
        return fc2996;
    }

    public void setFc2996(String fc2996) {
        this.fc2996 = fc2996;
        notifyPropertyChanged(BR.fc2996);
    }

    @Bindable
    public String getFc2996x() {
        return fc2996x;
    }

    public void setFc2996x(String fc2996x) {
        this.fc2996x = fc2996x;
        notifyPropertyChanged(BR.fc2996x);
    }

    @Bindable
    public String getFc30() {
        return fc30;
    }

    public void setFc30(String fc30) {
        this.fc30 = fc30;
        notifyPropertyChanged(BR.fc30);
    }

    @Bindable
    public String getFc31() {
        return fc31;
    }

    public void setFc31(String fc31) {
        this.fc31 = fc31;
        notifyPropertyChanged(BR.fc31);
    }

    @Bindable
    public String getFc3201() {
        return fc3201;
    }

    public void setFc3201(String fc3201) {
        this.fc3201 = fc3201;
        notifyPropertyChanged(BR.fc3201);
    }

    @Bindable
    public String getFc3202() {
        return fc3202;
    }

    public void setFc3202(String fc3202) {
        this.fc3202 = fc3202;
        notifyPropertyChanged(BR.fc3202);
    }

    @Bindable
    public String getFc3203() {
        return fc3203;
    }

    public void setFc3203(String fc3203) {
        this.fc3203 = fc3203;
        notifyPropertyChanged(BR.fc3203);
    }

    @Bindable
    public String getFc3301() {
        return fc3301;
    }

    public void setFc3301(String fc3301) {
        this.fc3301 = fc3301;
        notifyPropertyChanged(BR.fc3301);
    }

    @Bindable
    public String getFc3302() {
        return fc3302;
    }

    public void setFc3302(String fc3302) {
        this.fc3302 = fc3302;
        notifyPropertyChanged(BR.fc3302);
    }

    @Bindable
    public String getFc3303() {
        return fc3303;
    }

    public void setFc3303(String fc3303) {
        this.fc3303 = fc3303;
        notifyPropertyChanged(BR.fc3303);
    }

    @Bindable
    public String getFc34() {
        return fc34;
    }

    public void setFc34(String fc34) {
        this.fc34 = fc34;
        notifyPropertyChanged(BR.fc34);
    }

    @Bindable
    public String getFc3501() {
        return fc3501;
    }

    public void setFc3501(String fc3501) {
        this.fc3501 = fc3501;
        notifyPropertyChanged(BR.fc3501);
    }

    @Bindable
    public String getFc3601() {
        return fc3601;
    }

    public void setFc3601(String fc3601) {
        this.fc3601 = fc3601;
        notifyPropertyChanged(BR.fc3601);
    }

    @Bindable
    public String getFc37() {
        return fc37;
    }

    public void setFc37(String fc37) {
        this.fc37 = fc37;
        notifyPropertyChanged(BR.fc37);
    }

    @Bindable
    public String getFc3796x() {
        return fc3796x;
    }

    public void setFc3796x(String fc3796x) {
        this.fc3796x = fc3796x;
        notifyPropertyChanged(BR.fc3796x);
    }

    @Bindable
    public String getFc38() {
        return fc38;
    }

    public void setFc38(String fc38) {
        this.fc38 = fc38;
        notifyPropertyChanged(BR.fc38);
    }

    //    Section03 WRAs - Screening Log
    @Bindable
    public String getWs01a() {
        return ws01a;
    }

    public void setWs01a(String ws01a) {
        this.ws01a = ws01a;
        notifyPropertyChanged(BR.ws01a);
    }

    @Bindable
    public String getWs01b() {
        return ws01b;
    }

    public void setWs01b(String ws01b) {
        this.ws01b = ws01b;
        notifyPropertyChanged(BR.ws01b);
    }

    @Bindable
    public String getWs02() {
        return ws02;
    }

    public void setWs02(String ws02) {
        this.ws02 = ws02;
        notifyPropertyChanged(BR.ws02);
    }

    @Bindable
    public String getWs03() {
        return ws03;
    }

    public void setWs03(String ws03) {
        this.ws03 = ws03;
        notifyPropertyChanged(BR.ws03);
    }

    @Bindable
    public String getWs04() {
        return ws04;
    }

    public void setWs04(String ws04) {
        this.ws04 = ws04;
        notifyPropertyChanged(BR.ws04);
    }

    @Bindable
    public String getWs05() {
        return ws05;
    }

    public void setWs05(String ws05) {
        this.ws05 = ws05;
        notifyPropertyChanged(BR.ws05);
    }

    @Bindable
    public String getWs05a() {
        return ws05a;
    }

    public void setWs05a(String ws05a) {
        this.ws05a = ws05a;
        notifyPropertyChanged(BR.ws05a);
    }

    @Bindable
    public String getWs06() {
        return ws06;
    }

    public void setWs06(String ws06) {
        this.ws06 = ws06;
        notifyPropertyChanged(BR.ws06);
    }

    @Bindable
    public String getWs0696x() {
        return ws0696x;
    }

    public void setWs0696x(String ws0696x) {
        this.ws0696x = ws0696x;
        notifyPropertyChanged(BR.ws0696x);
    }

    @Bindable
    public String getWs07() {
        return ws07;
    }

    public void setWs07(String ws07) {
        this.ws07 = ws07;
        notifyPropertyChanged(BR.ws07);
    }

    @Bindable
    public String getWs0801() {
        return ws0801;
    }

    public void setWs0801(String ws0801) {
        this.ws0801 = ws0801;
        notifyPropertyChanged(BR.ws0801);
    }

    @Bindable
    public String getWs0802() {
        return ws0802;
    }

    public void setWs0802(String ws0802) {
        this.ws0802 = ws0802;
        notifyPropertyChanged(BR.ws0802);
    }

    @Bindable
    public String getWs0803() {
        return ws0803;
    }

    public void setWs0803(String ws0803) {
        this.ws0803 = ws0803;
        notifyPropertyChanged(BR.ws0803);
    }

    @Bindable
    public String getWs09() {
        return ws09;
    }

    public void setWs09(String ws09) {
        this.ws09 = ws09;
        notifyPropertyChanged(BR.ws09);
    }

    @Bindable
    public String getWs10() {
        return ws10;
    }

    public void setWs10(String ws10) {
        this.ws10 = ws10;
        notifyPropertyChanged(BR.ws10);
    }

    @Bindable
    public String getWs11() {
        return ws11;
    }

    public void setWs11(String ws11) {
        this.ws11 = ws11;
        notifyPropertyChanged(BR.ws11);
    }

    @Bindable
    public String getWs12() {
        return ws12;
    }

    public void setWs12(String ws12) {
        this.ws12 = ws12;
        notifyPropertyChanged(BR.ws12);
    }

    @Bindable
    public String getWs12a() {
        return ws12a;
    }

    public void setWs12a(String ws12a) {
        this.ws12a = ws12a;
        notifyPropertyChanged(BR.ws12a);
    }

    @Bindable
    public String getWs13() {
        return ws13;
    }

    public void setWs13(String ws13) {
        this.ws13 = ws13;
        notifyPropertyChanged(BR.ws13);
    }

    @Bindable
    public String getWs14() {
        return ws14;
    }

    public void setWs14(String ws14) {
        this.ws14 = ws14;
        notifyPropertyChanged(BR.ws14);
    }

    @Bindable
    public String getWs15() {
        return ws15;
    }

    public void setWs15(String ws15) {
        this.ws15 = ws15;
        notifyPropertyChanged(BR.ws15);
    }

    @Bindable
    public String getWs16() {
        return ws16;
    }

    public void setWs16(String ws16) {
        this.ws16 = ws16;
        notifyPropertyChanged(BR.ws16);
    }

    @Bindable
    public String getWs17() {
        return ws17;
    }

    public void setWs17(String ws17) {
        this.ws17 = ws17;
        notifyPropertyChanged(BR.ws17);
    }

    @Bindable
    public String getWs18() {
        return ws18;
    }

    public void setWs18(String ws18) {
        this.ws18 = ws18;
        notifyPropertyChanged(BR.ws18);
    }

    @Bindable
    public String getWs19() {
        return ws19;
    }

    public void setWs19(String ws19) {
        this.ws19 = ws19;
        notifyPropertyChanged(BR.ws19);
    }

    @Bindable
    public String getWs20() {
        return ws20;
    }

    public void setWs20(String ws20) {
        this.ws20 = ws20;
        notifyPropertyChanged(BR.ws20);
    }

    @Bindable
    public String getWs21() {
        return ws21;
    }

    public void setWs21(String ws21) {
        this.ws21 = ws21;
        notifyPropertyChanged(BR.ws21);
    }

    @Bindable
    public String getWs22() {
        return ws22;
    }

    public void setWs22(String ws22) {
        this.ws22 = ws22;
        notifyPropertyChanged(BR.ws22);
    }

    @Bindable
    public String getWs2296x() {
        return ws2296x;
    }

    public void setWs2296x(String ws2296x) {
        this.ws2296x = ws2296x;
        notifyPropertyChanged(BR.ws2296x);
    }

    @Bindable
    public String getWs2301() {
        return ws2301;
    }

    public void setWs2301(String ws2301) {
        this.ws2301 = ws2301;
        notifyPropertyChanged(BR.ws2301);
    }

    @Bindable
    public String getWs2302() {
        return ws2302;
    }

    public void setWs2302(String ws2302) {
        this.ws2302 = ws2302;
        notifyPropertyChanged(BR.ws2302);
    }

    @Bindable
    public String getWs2303() {
        return ws2303;
    }

    public void setWs2303(String ws2303) {
        this.ws2303 = ws2303;
        notifyPropertyChanged(BR.ws2303);
    }

    @Bindable
    public String getWs25a() {
        return ws25a;
    }

    public void setWs25a(String ws25a) {
        this.ws25a = ws25a;
        notifyPropertyChanged(BR.ws25a);
    }

    @Bindable
    public String getWs25b() {
        return ws25b;
    }

    public void setWs25b(String ws25b) {
        this.ws25b = ws25b;
        notifyPropertyChanged(BR.ws25b);
    }

    @Bindable
    public String getWs25c() {
        return ws25c;
    }

    public void setWs25c(String ws25c) {
        this.ws25c = ws25c;
        notifyPropertyChanged(BR.ws25c);
    }

    @Bindable
    public String getWs25d() {
        return ws25d;
    }

    public void setWs25d(String ws25d) {
        this.ws25d = ws25d;
        notifyPropertyChanged(BR.ws25d);
    }

    @Bindable
    public String getWs25e() {
        return ws25e;
    }

    public void setWs25e(String ws25e) {
        this.ws25e = ws25e;
        notifyPropertyChanged(BR.ws25e);
    }

    @Bindable
    public String getWs25f() {
        return ws25f;
    }

    public void setWs25f(String ws25f) {
        this.ws25f = ws25f;
        notifyPropertyChanged(BR.ws25f);
    }

    @Bindable
    public String getWs25g() {
        return ws25g;
    }

    public void setWs25g(String ws25g) {
        this.ws25g = ws25g;
        notifyPropertyChanged(BR.ws25g);
    }

    @Bindable
    public String getWs25h() {
        return ws25h;
    }

    public void setWs25h(String ws25h) {
        this.ws25h = ws25h;
        notifyPropertyChanged(BR.ws25h);
    }

    @Bindable
    public String getWs25i() {
        return ws25i;
    }

    public void setWs25i(String ws25i) {
        this.ws25i = ws25i;
        notifyPropertyChanged(BR.ws25i);
    }

    @Bindable
    public String getWs25j() {
        return ws25j;
    }

    public void setWs25j(String ws25j) {
        this.ws25j = ws25j;
        notifyPropertyChanged(BR.ws25j);
    }

    @Bindable
    public String getWs25k() {
        return ws25k;
    }

    public void setWs25k(String ws25k) {
        this.ws25k = ws25k;
        notifyPropertyChanged(BR.ws25k);
    }

    @Bindable
    public String getWs25k01x() {
        return ws25k01x;
    }

    public void setWs25k01x(String ws25k01x) {
        this.ws25k01x = ws25k01x;
        notifyPropertyChanged(BR.ws25k01x);
    }


    //    Section04 WRAs - Follow-up
    @Bindable
    public String getFw01() {
        return fw01;
    }

    public void setFw01(String fw01) {
        this.fw01 = fw01;
        notifyPropertyChanged(BR.fw01);
    }

    @Bindable
    public String getFw01a() {
        return fw01a;
    }

    public void setFw01a(String fw01a) {
        this.fw01a = fw01a;
        notifyPropertyChanged(BR.fw01a);
    }

    @Bindable
    public String getFw01b() {
        return fw01b;
    }

    public void setFw01b(String fw01b) {
        this.fw01b = fw01b;
        notifyPropertyChanged(BR.fw01b);
    }

    @Bindable
    public String getFw02() {
        return fw02;
    }

    public void setFw02(String fw02) {
        this.fw02 = fw02;
        notifyPropertyChanged(BR.fw02);
    }

    @Bindable
    public String getFw03() {
        return fw03;
    }

    public void setFw03(String fw03) {
        this.fw03 = fw03;
        notifyPropertyChanged(BR.fw03);
    }

    @Bindable
    public String getFw04() {
        return fw04;
    }

    public void setFw04(String fw04) {
        this.fw04 = fw04;
        notifyPropertyChanged(BR.fw04);
    }

    @Bindable
    public String getFw05() {
        return fw05;
    }

    public void setFw05(String fw05) {
        this.fw05 = fw05;
        notifyPropertyChanged(BR.fw05);
    }

    @Bindable
    public String getFw05a() {
        return fw05a;
    }

    public void setFw05a(String fw05a) {
        this.fw05a = fw05a;
        notifyPropertyChanged(BR.fw05a);
    }

    @Bindable
    public String getFw06() {
        return fw06;
    }

    public void setFw06(String fw06) {
        this.fw06 = fw06;
        notifyPropertyChanged(BR.fw06);
    }

    @Bindable
    public String getFw0696x() {
        return fw0696x;
    }

    public void setFw0696x(String fw0696x) {
        this.fw0696x = fw0696x;
        notifyPropertyChanged(BR.fw0696x);
    }

    @Bindable
    public String getFw07() {
        return fw07;
    }

    public void setFw07(String fw07) {
        this.fw07 = fw07;
        notifyPropertyChanged(BR.fw07);
    }

    @Bindable
    public String getFw0801() {
        return fw0801;
    }

    public void setFw0801(String fw0801) {
        this.fw0801 = fw0801;
        notifyPropertyChanged(BR.fw0801);
    }

    @Bindable
    public String getFw0802() {
        return fw0802;
    }

    public void setFw0802(String fw0802) {
        this.fw0802 = fw0802;
        notifyPropertyChanged(BR.fw0802);
    }

    @Bindable
    public String getFw0803() {
        return fw0803;
    }

    public void setFw0803(String fw0803) {
        this.fw0803 = fw0803;
        notifyPropertyChanged(BR.fw0803);
    }

    @Bindable
    public String getFw09() {
        return fw09;
    }

    public void setFw09(String fw09) {
        this.fw09 = fw09;
        notifyPropertyChanged(BR.fw09);
    }

    @Bindable
    public String getFw10() {
        return fw10;
    }

    public void setFw10(String fw10) {
        this.fw10 = fw10;
        notifyPropertyChanged(BR.fw10);
    }

    @Bindable
    public String getFw11() {
        return fw11;
    }

    public void setFw11(String fw11) {
        this.fw11 = fw11;
        notifyPropertyChanged(BR.fw11);
    }

    @Bindable
    public String getFw12() {
        return fw12;
    }

    public void setFw12(String fw12) {
        this.fw12 = fw12;
        notifyPropertyChanged(BR.fw12);
    }

    @Bindable
    public String getFw12a() {
        return fw12a;
    }

    public void setFw12a(String fw12a) {
        this.fw12a = fw12a;
        notifyPropertyChanged(BR.fw12a);
    }

    @Bindable
    public String getFw12b() {
        return fw12b;
    }

    public void setFw12b(String fw12b) {
        this.fw12b = fw12b;
        notifyPropertyChanged(BR.fw12b);
    }

    @Bindable
    public String getFw12b96x() {
        return fw12b96x;
    }

    public void setFw12b96x(String fw12b96x) {
        this.fw12b96x = fw12b96x;
        notifyPropertyChanged(BR.fw12b96x);
    }

    @Bindable
    public String getFw13() {
        return fw13;
    }

    public void setFw13(String fw13) {
        this.fw13 = fw13;
        notifyPropertyChanged(BR.fw13);
    }

    @Bindable
    public String getFw14() {
        return fw14;
    }

    public void setFw14(String fw14) {
        this.fw14 = fw14;
        notifyPropertyChanged(BR.fw14);
    }

    @Bindable
    public String getFw15() {
        return fw15;
    }

    public void setFw15(String fw15) {
        this.fw15 = fw15;
        notifyPropertyChanged(BR.fw15);
    }

    @Bindable
    public String getFw16() {
        return fw16;
    }

    public void setFw16(String fw16) {
        this.fw16 = fw16;
        notifyPropertyChanged(BR.fw16);
    }

    @Bindable
    public String getFw17() {
        return fw17;
    }

    public void setFw17(String fw17) {
        this.fw17 = fw17;
        notifyPropertyChanged(BR.fw17);
    }

    @Bindable
    public String getFw18() {
        return fw18;
    }

    public void setFw18(String fw18) {
        this.fw18 = fw18;
        notifyPropertyChanged(BR.fw18);
    }

    @Bindable
    public String getFw19() {
        return fw19;
    }

    public void setFw19(String fw19) {
        this.fw19 = fw19;
        notifyPropertyChanged(BR.fw19);
    }

    @Bindable
    public String getFw2001() {
        return fw2001;
    }

    public void setFw2001(String fw2001) {
        this.fw2001 = fw2001;
        notifyPropertyChanged(BR.fw2001);
    }

    @Bindable
    public String getFw21() {
        return fw21;
    }

    public void setFw21(String fw21) {
        this.fw21 = fw21;
        notifyPropertyChanged(BR.fw21);
    }

    @Bindable
    public String getFw22() {
        return fw22;
    }

    public void setFw22(String fw22) {
        this.fw22 = fw22;
        notifyPropertyChanged(BR.fw22);
    }

    @Bindable
    public String getFw2301() {
        return fw2301;
    }

    public void setFw2301(String fw2301) {
        this.fw2301 = fw2301;
        notifyPropertyChanged(BR.fw2301);
    }

    @Bindable
    public String getFw24() {
        return fw24;
    }

    public void setFw24(String fw24) {
        this.fw24 = fw24;
        notifyPropertyChanged(BR.fw24);
    }

    @Bindable
    public String getFw25() {
        return fw25;
    }

    public void setFw25(String fw25) {
        this.fw25 = fw25;
        notifyPropertyChanged(BR.fw25);
    }

    @Bindable
    public String getFw26() {
        return fw26;
    }

    public void setFw26(String fw26) {
        this.fw26 = fw26;
        notifyPropertyChanged(BR.fw26);
    }

    @Bindable
    public String getFw27() {
        return fw27;
    }

    public void setFw27(String fw27) {
        this.fw27 = fw27;
        notifyPropertyChanged(BR.fw27);
    }

    @Bindable
    public String getFw28() {
        return fw28;
    }

    public void setFw28(String fw28) {
        this.fw28 = fw28;
        notifyPropertyChanged(BR.fw28);
    }

    @Bindable
    public String getFw2896x() {
        return fw2896x;
    }

    public void setFw2896x(String fw2896x) {
        this.fw2896x = fw2896x;
        notifyPropertyChanged(BR.fw2896x);
    }

    @Bindable
    public String getFws29a() {
        return fws29a;
    }

    public void setFws29a(String fws29a) {
        this.fws29a = fws29a;
        notifyPropertyChanged(BR.fws29a);
    }

    @Bindable
    public String getFws29b() {
        return fws29b;
    }

    public void setFws29b(String fws29b) {
        this.fws29b = fws29b;
        notifyPropertyChanged(BR.fws29b);
    }

    @Bindable
    public String getFws29c() {
        return fws29c;
    }

    public void setFws29c(String fws29c) {
        this.fws29c = fws29c;
        notifyPropertyChanged(BR.fws29c);
    }

    @Bindable
    public String getFws29d() {
        return fws29d;
    }

    public void setFws29d(String fws29d) {
        this.fws29d = fws29d;
        notifyPropertyChanged(BR.fws29d);
    }

    @Bindable
    public String getFws29e() {
        return fws29e;
    }

    public void setFws29e(String fws29e) {
        this.fws29e = fws29e;
        notifyPropertyChanged(BR.fws29e);
    }

    @Bindable
    public String getFws29f() {
        return fws29f;
    }

    public void setFws29f(String fws29f) {
        this.fws29f = fws29f;
        notifyPropertyChanged(BR.fws29f);
    }

    @Bindable
    public String getFws29g() {
        return fws29g;
    }

    public void setFws29g(String fws29g) {
        this.fws29g = fws29g;
        notifyPropertyChanged(BR.fws29g);
    }

    @Bindable
    public String getFws29h() {
        return fws29h;
    }

    public void setFws29h(String fws29h) {
        this.fws29h = fws29h;
        notifyPropertyChanged(BR.fws29h);
    }

    @Bindable
    public String getFws29i() {
        return fws29i;
    }

    public void setFws29i(String fws29i) {
        this.fws29i = fws29i;
        notifyPropertyChanged(BR.fws29i);
    }

    @Bindable
    public String getFws29j() {
        return fws29j;
    }

    public void setFws29j(String fws29j) {
        this.fws29j = fws29j;
        notifyPropertyChanged(BR.fws29j);
    }

    @Bindable
    public String getFws29k() {
        return fws29k;
    }

    public void setFws29k(String fws29k) {
        this.fws29k = fws29k;
        notifyPropertyChanged(BR.fws29k);
    }

    @Bindable
    public String getFws29k96x() {
        return fws29k96x;
    }

    public void setFws29k96x(String fws29k96x) {
        this.fws29k96x = fws29k96x;
        notifyPropertyChanged(BR.fws29k96x);
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


    public Form Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(FormsContract.FormsTable.COLUMN_ID);
        this.uid = jsonObject.getString(FormsContract.FormsTable.COLUMN_UID);
        this.userName = jsonObject.getString(FormsContract.FormsTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(FormsContract.FormsTable.COLUMN_SYSDATE);
        this.dcode = jsonObject.getString(FormsContract.FormsTable.COLUMN_DCODE);
        this.ucode = jsonObject.getString(FormsContract.FormsTable.COLUMN_UCODE);
        this.cluster = jsonObject.getString(FormsContract.FormsTable.COLUMN_CLUSTER);
        this.hhno = jsonObject.getString(FormsContract.FormsTable.COLUMN_HHNO);
        this.deviceId = jsonObject.getString(FormsContract.FormsTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(FormsContract.FormsTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(FormsContract.FormsTable.COLUMN_APPVERSION);
        this.gps = jsonObject.getString(FormsContract.FormsTable.COLUMN_GPS);
        this.endTime = jsonObject.getString(FormsContract.FormsTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(FormsContract.FormsTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(FormsContract.FormsTable.COLUMN_ISTATUS96x);
        this.iStatus96x = jsonObject.getString(FormsContract.FormsTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(FormsContract.FormsTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(FormsContract.FormsTable.COLUMN_SYNCED_DATE);
        this.childrespondent = jsonObject.getString(FormsContract.FormsTable.COLUMN_CHILD_RESPONDENT);

        this.s01CS = jsonObject.getString(FormsContract.FormsTable.COLUMN_S01CS);
        this.s02FC = jsonObject.getString(FormsContract.FormsTable.COLUMN_S02FC);
        this.s03WS = jsonObject.getString(FormsContract.FormsTable.COLUMN_S03WS);
        this.s04FW = jsonObject.getString(FormsContract.FormsTable.COLUMN_S04FW);

        return this;

    }


    public Form Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_SYSDATE));
        this.dcode = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_DCODE));
        this.ucode = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_UCODE));
        this.cluster = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_CLUSTER));
        this.hhno = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_HHNO));
        this.deviceId = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_APPVERSION));
        this.gps = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_GPS));
        this.endTime = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_SYNCED_DATE));
        this.childrespondent = cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_CHILD_RESPONDENT));


        s01csHydrate(cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_S01CS)));
        s02fcHydrate(cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_S02FC)));
        s03wsHydrate(cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_S03WS)));
        s04fwHydrate(cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_S04FW)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form.class);
    }


    public String s01cstoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("cs01", s01CS)
                    .put("cs01", cs01)
                    .put("cs01a", cs01a)
                    .put("cs01b", cs01b)
                    .put("cs02", cs02)
                    .put("cs03", cs03)
                    .put("cs04", cs04)
                    .put("cs05", cs05)
                    .put("cs05a", cs05a)
                    .put("cs06", cs06)
                    .put("cs06096x", cs06096x)
                    .put("cs07", cs07)
                    .put("cs0801", cs0801)
                    .put("cs0802", cs0802)
                    .put("cs0803", cs0803)
                    .put("cs09", cs09)
                    .put("cs10", cs10)
                    .put("cs10a", cs10a)
                    .put("cs11", cs11)
                    .put("cs11a", cs11a)
                    .put("cs12", cs12)
                    .put("cs12a", cs12a)
                    .put("cs13", cs13)
                    .put("cs1401", cs1401)
                    .put("cs1402", cs1402)
                    .put("cs1403", cs1403)
                    .put("cs1501", cs1501)
                    .put("cs1502", cs1502)
                    .put("cs16", cs16)
                    .put("cs17", cs17)
                    .put("cs18", cs18)
                    .put("cs19", cs19)
                    .put("cs20a", cs20a)
                    .put("cs20b", cs20b)
                    .put("cs21", cs21)
                    .put("cs22", cs22)
                    .put("cs23", cs23)
                    .put("cs24", cs24)
                    .put("cs2401", cs2401)
                    .put("cs2402", cs2402)
                    .put("cs2403", cs2403)
                    .put("cs2404", cs2404)
                    .put("cs2405", cs2405)
                    .put("cs2406", cs2406)
                    .put("cs25", cs25)
                    .put("cs25a01", cs25a01)
                    .put("cs25b01", cs25b01)
                    .put("cs25c", cs25c)
                    .put("cs25c096x", cs25c096x)
                    .put("cs26", cs26)
                    .put("cs2601", cs2601)
                    .put("cs2602", cs2602)
                    .put("cs2603", cs2603)
                    .put("cs2604", cs2604)
                    .put("cs2605", cs2605)
                    .put("cs2701", cs2701)
                    .put("cs2702", cs2702)
                    .put("cs2703", cs2703)
                    .put("cs2704", cs2704)
                    .put("cs28a", cs28a)
                    .put("cs28b", cs28b)
                    .put("cs28c", cs28c)
                    .put("cs28d", cs28d)
                    .put("cs28e", cs28e)
                    .put("cs28f", cs28f)
                    .put("cs28f01x", cs28f01x)
                    .put("cs29", cs29)
                    .put("cs30a", cs30a)
                    .put("cs30b", cs30b)
                    .put("cs30c", cs30c)
                    .put("cs30d", cs30d)
                    .put("cs30e", cs30e)
                    .put("cs30f", cs30f)
                    .put("cs30f096x", cs30f096x)
                    .put("cs31", cs31)
                    .put("cs32a", cs32a)
                    .put("cs32b", cs32b)
                    .put("cs32c", cs32c)
                    .put("cs32d", cs32d)
                    .put("cs32e", cs32e)
                    .put("cs32f", cs32f)
                    .put("cs32g", cs32g)
                    .put("cs32h", cs32h)
                    .put("cs32h096x", cs32h096x);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String s02fctoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("fc01", fc01)
                    .put("fc01a", fc01a)
                    .put("fc01b", fc01b)
                    .put("fc02", fc02)
                    .put("fc03", fc03)
                    .put("fc04", fc04)
                    .put("fc05", fc05)
                    .put("fc05a", fc05a)
                    .put("fc06", fc06)
                    .put("fc0696x", fc0696x)
                    .put("fc07", fc07)
                    .put("fc0801", fc0801)
                    .put("fc0802", fc0802)
                    .put("fc0803", fc0803)
                    .put("fc09", fc09)
                    .put("fc10", fc10)
                    .put("fc15", fc15)
                    .put("fc15a", fc15a)
                    .put("fc16", fc16)
                    .put("fc16a", fc16a)
                    .put("fc16b", fc16b)
                    .put("fc16b96x", fc16b96x)
                    .put("fc1701", fc1701)
                    .put("fc1702", fc1702)
                    .put("fc18", fc18)
                    .put("fc19", fc19)
                    .put("fc20", fc20)
                    .put("fc21", fc21)
                    .put("fc22", fc22)
                    .put("fc23", fc23)
                    .put("fc24", fc24)
                    .put("fc25", fc25)
                    .put("fc26", fc26)
                    .put("fc2701", fc2701)
                    .put("fc2702", fc2702)
                    .put("fc2703", fc2703)
                    .put("fc2704", fc2704)
                    .put("fc28", fc28)
                    .put("fc29", fc29)
                    .put("fc2901", fc2901)
                    .put("fc2902", fc2902)
                    .put("fc2903", fc2903)
                    .put("fc2905", fc2905)
                    .put("fc2996", fc2996)
                    .put("fc2996x", fc2996x)
                    .put("fc30", fc30)
                    .put("fc31", fc31)
                    .put("fc3201", fc3201)
                    .put("fc3202", fc3202)
                    .put("fc3203", fc3203)
                    .put("fc3301", fc3301)
                    .put("fc3302", fc3302)
                    .put("fc3303", fc3303)
                    .put("fc34", fc34)
                    .put("fc3501", fc3501)
                    .put("fc3601", fc3601)
                    .put("fc37", fc37)
                    .put("fc3796x", fc3796x)
                    .put("fc38", fc38);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String s03wstoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("ws01", ws01)
                    .put("ws01a", ws01a)
                    .put("ws01b", ws01b)
                    .put("ws02", ws02)
                    .put("ws03", ws03)
                    .put("ws04", ws04)
                    .put("ws05", ws05)
                    .put("ws05a", ws05a)
                    .put("ws06", ws06)
                    .put("ws0696x", ws0696x)
                    .put("ws07", ws07)
                    .put("ws0801", ws0801)
                    .put("ws0802", ws0802)
                    .put("ws0803", ws0803)
                    .put("ws09", ws09)
                    .put("ws10", ws10)
                    .put("ws11", ws11)
                    .put("ws12", ws12)
                    .put("ws12a", ws12a)
                    .put("ws13", ws13)
                    .put("ws14", ws14)
                    .put("ws15", ws15)
                    .put("ws16", ws16)
                    .put("ws17", ws17)
                    .put("ws18", ws18)
                    .put("ws19", ws19)
                    .put("ws20", ws20)
                    .put("ws21", ws21)
                    .put("ws22", ws22)
                    .put("ws2296x", ws2296x)
                    .put("ws2301", ws2301)
                    .put("ws2302", ws2302)
                    .put("ws2303", ws2303)
                    .put("ws25a", ws25a)
                    .put("ws25b", ws25b)
                    .put("ws25c", ws25c)
                    .put("ws25d", ws25d)
                    .put("ws25e", ws25e)
                    .put("ws25f", ws25f)
                    .put("ws25g", ws25g)
                    .put("ws25h", ws25h)
                    .put("ws25i", ws25i)
                    .put("ws25j", ws25j)
                    .put("ws25k", ws25k)
                    .put("ws25k01x", ws25k01x);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }

    public String s04fwtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("fw01", fw01)
                    .put("fw01a", fw01a)
                    .put("fw01b", fw01b)
                    .put("fw02", fw02)
                    .put("fw03", fw03)
                    .put("fw04", fw04)
                    .put("fw05", fw05)
                    .put("fw05a", fw05a)
                    .put("fw06", fw06)
                    .put("fw0696x", fw0696x)
                    .put("fw07", fw07)
                    .put("fw0801", fw0801)
                    .put("fw0802", fw0802)
                    .put("fw0803", fw0803)
                    .put("fw09", fw09)
                    .put("fw10", fw10)
                    .put("fw11", fw11)
                    .put("fw12", fw12)
                    .put("fw12a", fw12a)
                    .put("fw12b", fw12b)
                    .put("fw12b96x", fw12b96x)
                    .put("fw13", fw13)
                    .put("fw14", fw14)
                    .put("fw15", fw15)
                    .put("fw16", fw16)
                    .put("fw17", fw17)
                    .put("fw18", fw18)
                    .put("fw19", fw19)
                    .put("fw2001", fw2001)
                    .put("fw21", fw21)
                    .put("fw22", fw22)
                    .put("fw2301", fw2301)
                    .put("fw24", fw24)
                    .put("fw25", fw25)
                    .put("fw26", fw26)
                    .put("fw27", fw27)
                    .put("fw28", fw28)
                    .put("fw2896x", fw2896x)
                    .put("fws29a", fws29a)
                    .put("fws29b", fws29b)
                    .put("fws29c", fws29c)
                    .put("fws29d", fws29d)
                    .put("fws29e", fws29e)
                    .put("fws29f", fws29f)
                    .put("fws29g", fws29g)
                    .put("fws29h", fws29h)
                    .put("fws29i", fws29i)
                    .put("fws29j", fws29j)
                    .put("fws29k", fws29k)
                    .put("fws29k96x", fws29k96x);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsContract.FormsTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(FormsContract.FormsTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(FormsContract.FormsTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(FormsContract.FormsTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(FormsContract.FormsTable.COLUMN_DCODE, this.dcode == null ? JSONObject.NULL : this.dcode);
            json.put(FormsContract.FormsTable.COLUMN_UCODE, this.ucode == null ? JSONObject.NULL : this.ucode);
            json.put(FormsContract.FormsTable.COLUMN_CLUSTER, this.cluster == null ? JSONObject.NULL : this.cluster);
            json.put(FormsContract.FormsTable.COLUMN_HHNO, this.hhno == null ? JSONObject.NULL : this.hhno);
            json.put(FormsContract.FormsTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(FormsContract.FormsTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);
            json.put(FormsContract.FormsTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(FormsContract.FormsTable.COLUMN_GPS, this.gps == null ? JSONObject.NULL : this.gps);
            json.put(FormsContract.FormsTable.COLUMN_ENDINGDATETIME, this.endTime == null ? JSONObject.NULL : this.endTime);
            json.put(FormsContract.FormsTable.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
            json.put(FormsContract.FormsTable.COLUMN_ISTATUS96x, this.iStatus96x == null ? JSONObject.NULL : this.iStatus96x);
            json.put(FormsContract.FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(FormsContract.FormsTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);
            json.put(FormsContract.FormsTable.COLUMN_CHILD_RESPONDENT, this.childrespondent == null ? JSONObject.NULL : this.childrespondent);

            json.put(FormsContract.FormsTable.COLUMN_S01CS, new JSONObject(s01cstoString()));
            json.put(FormsContract.FormsTable.COLUMN_S02FC, new JSONObject(s02fctoString()));
            json.put(FormsContract.FormsTable.COLUMN_S03WS, new JSONObject(s03wstoString()));
            json.put(FormsContract.FormsTable.COLUMN_S04FW, new JSONObject(s04fwtoString()));


            if (this.s01CS != null && !this.s01CS.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S01CS, new JSONObject(this.s01CS));
            }

            if (this.s02FC != null && !this.s02FC.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S02FC, new JSONObject(this.s02FC));
            }

            if (this.s03WS != null && !this.s03WS.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S03WS, new JSONObject(this.s03WS));
            }

            if (this.s04FW != null && !this.s04FW.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S04FW, new JSONObject(this.s04FW));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Section01
    public void s01csHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.cs01 = json.getString("cs01");
                this.cs01a = json.getString("cs01a");
                this.cs01b = json.getString("cs01b");
                this.cs02 = json.getString("cs02");
                this.cs03 = json.getString("cs03");
                this.cs04 = json.getString("cs04");
                this.cs05 = json.getString("cs05");
                this.cs05a = json.getString("cs05a");
                this.cs06 = json.getString("cs06");
                this.cs06096x = json.getString("cs06096x");
                this.cs07 = json.getString("cs07");
                this.cs0801 = json.getString("cs0801");
                this.cs0802 = json.getString("cs0802");
                this.cs0803 = json.getString("cs0803");
                this.cs09 = json.getString("cs09");
                this.cs10 = json.getString("cs10");
                this.cs10a = json.getString("cs10a");
                this.cs11 = json.getString("cs11");
                this.cs11a = json.getString("cs11a");
                this.cs12 = json.getString("cs12");
                this.cs12a = json.getString("cs12a");
                this.cs13 = json.getString("cs13");
                this.cs1401 = json.getString("cs1401");
                this.cs1402 = json.getString("cs1402");
                this.cs1403 = json.getString("cs1403");
                this.cs1501 = json.getString("cs1501");
                this.cs1502 = json.getString("cs1502");
                this.cs16 = json.getString("cs16");
                this.cs17 = json.getString("cs17");
                this.cs18 = json.getString("cs18");
                this.cs19 = json.getString("cs19");
                this.cs20a = json.getString("cs20a");
                this.cs20b = json.getString("cs20b");
                this.cs21 = json.getString("cs21");
                this.cs22 = json.getString("cs22");
                this.cs23 = json.getString("cs23");
                this.cs24 = json.getString("cs24");
                this.cs2401 = json.getString("cs2401");
                this.cs2402 = json.getString("cs2402");
                this.cs2403 = json.getString("cs2403");
                this.cs2404 = json.getString("cs2404");
                this.cs2405 = json.getString("cs2405");
                this.cs2406 = json.getString("cs2406");
                this.cs25 = json.getString("cs25");
                this.cs25a01 = json.getString("cs25a01");
                this.cs25b01 = json.getString("cs25b01");
                this.cs25c = json.getString("cs25c");
                this.cs25c096x = json.getString("cs25c096x");
                this.cs26 = json.getString("cs26");
                this.cs2601 = json.getString("cs2601");
                this.cs2602 = json.getString("cs2602");
                this.cs2603 = json.getString("cs2603");
                this.cs2604 = json.getString("cs2604");
                this.cs2605 = json.getString("cs2605");
                this.cs2701 = json.getString("cs2701");
                this.cs2702 = json.getString("cs2702");
                this.cs2703 = json.getString("cs2703");
                this.cs2704 = json.getString("cs2704");
                this.cs28a = json.getString("cs28a");
                this.cs28b = json.getString("cs28b");
                this.cs28c = json.getString("cs28c");
                this.cs28d = json.getString("cs28d");
                this.cs28e = json.getString("cs28e");
                this.cs28f = json.getString("cs28f");
                this.cs28f01x = json.getString("cs28f01x");
                this.cs29 = json.getString("cs29");
                this.cs30a = json.getString("cs30a");
                this.cs30b = json.getString("cs30b");
                this.cs30c = json.getString("cs30c");
                this.cs30d = json.getString("cs30d");
                this.cs30e = json.getString("cs30e");
                this.cs30f = json.getString("cs30f");
                this.cs30f096x = json.getString("cs30f096x");
                this.cs31 = json.getString("cs31");
                this.cs32a = json.getString("cs32a");
                this.cs32b = json.getString("cs32b");
                this.cs32c = json.getString("cs32c");
                this.cs32d = json.getString("cs32d");
                this.cs32e = json.getString("cs32e");
                this.cs32f = json.getString("cs32f");
                this.cs32g = json.getString("cs32g");
                this.cs32h = json.getString("cs32h");
                this.cs32h096x = json.getString("cs32h096x");


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    //Section02
    public void s02fcHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.fc01 = json.getString("fc01");
                this.fc01a = json.getString("fc01a");
                this.fc01b = json.getString("fc01b");
                this.fc02 = json.getString("fc02");
                this.fc03 = json.getString("fc03");
                this.fc04 = json.getString("fc04");
                this.fc05 = json.getString("fc05");
                this.fc05a = json.getString("fc05a");
                this.fc06 = json.getString("fc06");
                this.fc0696x = json.getString("fc0696x");
                this.fc07 = json.getString("fc07");
                this.fc0801 = json.getString("fc0801");
                this.fc0802 = json.getString("fc0802");
                this.fc0803 = json.getString("fc0803");
                this.fc09 = json.getString("fc09");
                this.fc10 = json.getString("fc10");
                this.fc15 = json.getString("fc15");
                this.fc15a = json.getString("fc15a");
                this.fc16 = json.getString("fc16");
                this.fc16a = json.getString("fc16a");
                this.fc16b = json.getString("fc16b");
                this.fc16b96x = json.getString("fc16b96x");
                this.fc1701 = json.getString("fc1701");
                this.fc1702 = json.getString("fc1702");
                this.fc18 = json.getString("fc18");
                this.fc19 = json.getString("fc19");
                this.fc20 = json.getString("fc20");
                this.fc21 = json.getString("fc21");
                this.fc22 = json.getString("fc22");
                this.fc23 = json.getString("fc23");
                this.fc24 = json.getString("fc24");
                this.fc25 = json.getString("fc25");
                this.fc26 = json.getString("fc26");
                this.fc2701 = json.getString("fc2701");
                this.fc2702 = json.getString("fc2702");
                this.fc2703 = json.getString("fc2703");
                this.fc2704 = json.getString("fc2704");
                this.fc28 = json.getString("fc28");
                this.fc29 = json.getString("fc29");
                this.fc2901 = json.getString("fc2901");
                this.fc2902 = json.getString("fc2902");
                this.fc2903 = json.getString("fc2903");
                this.fc2905 = json.getString("fc2905");
                this.fc2996 = json.getString("fc2996");
                this.fc2996x = json.getString("fc2996x");
                this.fc30 = json.getString("fc30");
                this.fc31 = json.getString("fc31");
                this.fc3201 = json.getString("fc3201");
                this.fc3202 = json.getString("fc3202");
                this.fc3203 = json.getString("fc3203");
                this.fc3301 = json.getString("fc3301");
                this.fc3302 = json.getString("fc3302");
                this.fc3303 = json.getString("fc3303");
                this.fc34 = json.getString("fc34");
                this.fc3501 = json.getString("fc3501");
                this.fc3601 = json.getString("fc3601");
                this.fc37 = json.getString("fc37");
                this.fc3796x = json.getString("fc3796x");
                this.fc38 = json.getString("fc38");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    //Section03
    public void s03wsHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.ws01 = json.getString("ws01");
                this.ws01a = json.getString("ws01a");
                this.ws01b = json.getString("ws01b");
                this.ws02 = json.getString("ws02");
                this.ws03 = json.getString("ws03");
                this.ws04 = json.getString("ws04");
                this.ws05 = json.getString("ws05");
                this.ws05a = json.getString("ws05a");
                this.ws06 = json.getString("ws06");
                this.ws0696x = json.getString("ws0696x");
                this.ws07 = json.getString("ws07");
                this.ws0801 = json.getString("ws0801");
                this.ws0802 = json.getString("ws0802");
                this.ws0803 = json.getString("ws0803");
                this.ws09 = json.getString("ws09");
                this.ws10 = json.getString("ws10");
                this.ws11 = json.getString("ws11");
                this.ws12 = json.getString("ws12");
                this.ws12a = json.getString("ws12a");
                this.ws13 = json.getString("ws13");
                this.ws14 = json.getString("ws14");
                this.ws15 = json.getString("ws15");
                this.ws16 = json.getString("ws16");
                this.ws17 = json.getString("ws17");
                this.ws18 = json.getString("ws18");
                this.ws19 = json.getString("ws19");
                this.ws20 = json.getString("ws20");
                this.ws21 = json.getString("ws21");
                this.ws22 = json.getString("ws22");
                this.ws2296x = json.getString("ws2296x");
                this.ws2301 = json.getString("ws2301");
                this.ws2302 = json.getString("ws2302");
                this.ws2303 = json.getString("ws2303");
                this.ws25a = json.getString("ws25a");
                this.ws25b = json.getString("ws25b");
                this.ws25c = json.getString("ws25c");
                this.ws25d = json.getString("ws25d");
                this.ws25e = json.getString("ws25e");
                this.ws25f = json.getString("ws25f");
                this.ws25g = json.getString("ws25g");
                this.ws25h = json.getString("ws25h");
                this.ws25i = json.getString("ws25i");
                this.ws25j = json.getString("ws25j");
                this.ws25k = json.getString("ws25k");
                this.ws25k01x = json.getString("ws25k01x");


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    //Section04
    public void s04fwHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.fw01 = json.getString("fw01");
                this.fw01a = json.getString("fw01a");
                this.fw01b = json.getString("fw01b");
                this.fw02 = json.getString("fw02");
                this.fw03 = json.getString("fw03");
                this.fw04 = json.getString("fw04");
                this.fw05 = json.getString("fw05");
                this.fw05a = json.getString("fw05a");
                this.fw06 = json.getString("fw06");
                this.fw0696x = json.getString("fw0696x");
                this.fw07 = json.getString("fw07");
                this.fw0801 = json.getString("fw0801");
                this.fw0802 = json.getString("fw0802");
                this.fw0803 = json.getString("fw0803");
                this.fw09 = json.getString("fw09");
                this.fw10 = json.getString("fw10");
                this.fw11 = json.getString("fw11");
                this.fw12 = json.getString("fw12");
                this.fw12a = json.getString("fw12a");
                this.fw12b = json.getString("fw12b");
                this.fw12b96x = json.getString("fw12b96x");
                this.fw13 = json.getString("fw13");
                this.fw14 = json.getString("fw14");
                this.fw15 = json.getString("fw15");
                this.fw16 = json.getString("fw16");
                this.fw17 = json.getString("fw17");
                this.fw18 = json.getString("fw18");
                this.fw19 = json.getString("fw19");
                this.fw2001 = json.getString("fw2001");
                this.fw21 = json.getString("fw21");
                this.fw22 = json.getString("fw22");
                this.fw2301 = json.getString("fw2301");
                this.fw24 = json.getString("fw24");
                this.fw25 = json.getString("fw25");
                this.fw26 = json.getString("fw26");
                this.fw27 = json.getString("fw27");
                this.fw28 = json.getString("fw28");
                this.fw2896x = json.getString("fw2896x");
                this.fws29a = json.getString("fws29a");
                this.fws29b = json.getString("fws29b");
                this.fws29c = json.getString("fws29c");
                this.fws29d = json.getString("fws29d");
                this.fws29e = json.getString("fws29e");
                this.fws29f = json.getString("fws29f");
                this.fws29g = json.getString("fws29g");
                this.fws29h = json.getString("fws29h");
                this.fws29i = json.getString("fws29i");
                this.fws29j = json.getString("fws29j");
                this.fws29k = json.getString("fws29k");
                this.fws29k96x = json.getString("fws29k96x");


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    @Bindable
    public String getWs01() {
        return ws01;
    }

    public void setWs01(String ws01) {
        this.ws01 = ws01;
        notifyPropertyChanged(BR.ws01);
    }
}
