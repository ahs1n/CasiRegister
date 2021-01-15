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

    // Section U5 - Screening Log
    public String cs01;
    public String cs01a;
    public String cs01b;
    public String cs02;
    public String cs03;
    public String cs04;
    public String cs05;
    public String cs05a;
    public String cs06;
    public String cs06096x;
    public String cs07;
    public String cs0801;
    public String cs0802;
    public String cs0803;
    public String cs09;
    public String cs10;
    public String cs10a;
    public String cs11;
    public String cs11a;
    public String cs12;
    public String cs12a;
    public String cs13;
    public String cs1401;
    public String cs1402;
    public String cs1403;
    public String cs1501;
    public String cs1502;
    public String cs16;
    public String cs17;
    public String cs18;
    public String cs19;
    public String cs20a;
    public String cs20b;
    public String cs21;
    public String cs22;
    public String cs23;
    public String cs24;
    public String cs2401;
    public String cs2402;
    public String cs2403;
    public String cs2404;
    public String cs2405;
    public String cs2406;
    public String cs25;
    public String cs25a01;
    public String cs25b01;
    public String cs25c;
    public String cs25c096x;
    public String cs26;
    public String cs2601;
    public String cs2602;
    public String cs2603;
    public String cs2604;
    public String cs2605;
    public String cs2701;
    public String cs2702;
    public String cs2703;
    public String cs2704;
    public String cs28a;
    public String cs28b;
    public String cs28c;
    public String cs28d;
    public String cs28e;
    public String cs28f;
    public String cs28f01x;
    public String cs29;
    public String cs30a;
    public String cs30b;
    public String cs30c;
    public String cs30d;
    public String cs30e;
    public String cs30f;
    public String cs30f096x;
    public String cs31;
    public String cs32a;
    public String cs32b;
    public String cs32c;
    public String cs32d;
    public String cs32e;
    public String cs32f;
    public String cs32g;
    public String cs32h;
    public String cs32h096x;


    // Section U5 - Screening Log
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
    private String s01cs = "";
    private String s02CB = "";
    private String s03CS = "";
    private String s04IM = "";
    private String s05PD = "";
    private String s06BF = "";
    private String s07CV = "";
    private String s08SE = "";

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


    public String getS02CB() {
        return s02CB;
    }

    public Form setS02CB(String s02CB) {
        this.s02CB = s02CB;
        return this;
    }

    public String getS03CS() {
        return s03CS;
    }

    public Form setS03CS(String s03CS) {
        this.s03CS = s03CS;
        return this;
    }

    public String getS04IM() {
        return s04IM;
    }

    public Form setS04IM(String s04IM) {
        this.s04IM = s04IM;
        return this;
    }

    public String getS05PD() {
        return s05PD;
    }

    public Form setS05PD(String s05PD) {
        this.s05PD = s05PD;
        return this;
    }

    public String getS06BF() {
        return s06BF;
    }

    public Form setS06BF(String s06BF) {
        this.s06BF = s06BF;
        return this;
    }

    public String getS07CV() {
        return s07CV;
    }

    public Form setS07CV(String s07CV) {
        this.s07CV = s07CV;
        return this;
    }

    public String getS08SE() {
        return s08SE;
    }

    public Form setS08SE(String s08SE) {
        this.s08SE = s08SE;
        return this;
    }


    @Bindable
    public String getS01cs() {
        return s01cs;
    }

    public void setS01cs(String s01cs) {
        this.s01cs = s01cs;
    }


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

        this.s01cs = jsonObject.getString(FormsContract.FormsTable.COLUMN_S01CS);


        this.s02CB = jsonObject.getString(FormsContract.FormsTable.COLUMN_S02CB);
        this.s03CS = jsonObject.getString(FormsContract.FormsTable.COLUMN_S03CS);
        this.s04IM = jsonObject.getString(FormsContract.FormsTable.COLUMN_S04IM);
        this.s05PD = jsonObject.getString(FormsContract.FormsTable.COLUMN_S05PD);
        this.s06BF = jsonObject.getString(FormsContract.FormsTable.COLUMN_S06BF);
        this.s07CV = jsonObject.getString(FormsContract.FormsTable.COLUMN_S07CV);
        this.s08SE = jsonObject.getString(FormsContract.FormsTable.COLUMN_S08SE);

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


        cs01Hydrate(cursor.getString(cursor.getColumnIndex(FormsContract.FormsTable.COLUMN_S01CS)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form.class);
    }


    public String cs01toString() {
        JSONObject json = new JSONObject();

        try {
            json.put("cs01", s01cs)
                    .put("cs01a", cs01a);

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

            json.put(FormsContract.FormsTable.COLUMN_S01CS, new JSONObject(cs01toString()));


            if (this.s01cs != null && !this.s01cs.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S01CS, new JSONObject(this.s01cs));
            }

            if (this.s02CB != null && !this.s02CB.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S02CB, new JSONObject(this.s02CB));
            }

            if (this.s03CS != null && !this.s03CS.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S03CS, new JSONObject(this.s03CS));
            }

            if (this.s04IM != null && !this.s04IM.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S04IM, new JSONObject(this.s04IM));
            }

            if (this.s05PD != null && !this.s05PD.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S05PD, new JSONObject(this.s05PD));
            }

            if (this.s06BF != null && !this.s06BF.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S06BF, new JSONObject(this.s06BF));
            }

            if (this.s07CV != null && !this.s07CV.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S07CV, new JSONObject(this.s07CV));
            }

            if (this.s08SE != null && !this.s08SE.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S08SE, new JSONObject(this.s08SE));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void cs01Hydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.s01cs = json.getString("cs01");
                this.cs01a = json.getString("cs01a");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}
