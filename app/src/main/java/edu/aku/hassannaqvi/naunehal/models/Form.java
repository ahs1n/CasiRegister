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
    public String getHh01() {
        return hh01;
    }

    public void setHh01(String hh01) {
        this.hh01 = hh01;
        notifyPropertyChanged(BR.hh01);
    }

    @Bindable
    public String getHh0201() {
        return hh0201;
    }

    public void setHh0201(String hh0201) {
        this.hh0201 = hh0201;
        notifyPropertyChanged(BR.hh0201);
    }

    @Bindable
    public String getHh0202() {
        return hh0202;
    }

    public void setHh0202(String hh0202) {
        this.hh0202 = hh0202;
        notifyPropertyChanged(BR.hh0202);
    }

    @Bindable
    public String getHh03() {
        return hh03;
    }

    public void setHh03(String hh03) {
        this.hh03 = hh03;
        notifyPropertyChanged(BR.hh03);
    }

    @Bindable
    public String getHh04() {
        return hh04;
    }

    public void setHh04(String hh04) {
        this.hh04 = hh04;
        notifyPropertyChanged(BR.hh04);
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
    public String getHh07() {
        return hh07;
    }

    public void setHh07(String hh07) {
        this.hh07 = hh07;
        notifyPropertyChanged(BR.hh07);
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

    @Bindable
    public String getHh10() {
        return hh10;
    }

    public void setHh10(String hh10) {
        this.hh10 = hh10;
        notifyPropertyChanged(BR.hh10);
    }

    @Bindable
    public String getHh11() {
        return hh11;
    }

    public void setHh11(String hh11) {
        this.hh11 = hh11;
        notifyPropertyChanged(BR.hh11);
    }

    @Bindable
    public String getHh12() {
        return hh12;
    }

    public void setHh12(String hh12) {
        this.hh12 = hh12;
        notifyPropertyChanged(BR.hh12);
    }

    @Bindable
    public String getHh13() {
        return hh13;
    }

    public void setHh13(String hh13) {
        this.hh13 = hh13;
        notifyPropertyChanged(BR.hh13);
    }

    @Bindable
    public String getHh14() {
        return hh14;
    }

    public void setHh14(String hh14) {
        this.hh14 = hh14;
        notifyPropertyChanged(BR.hh14);
    }

    @Bindable
    public String getHh15() {
        return hh15;
    }

    public void setHh15(String hh15) {
        this.hh15 = hh15;
        notifyPropertyChanged(BR.hh15);
    }

    @Bindable
    public String getHh16() {
        return hh16;
    }

    public void setHh16(String hh16) {
        this.hh16 = hh16;
        notifyPropertyChanged(BR.hh16);
    }

    @Bindable
    public String getHh17() {
        return hh17;
    }

    public void setHh17(String hh17) {
        this.hh17 = hh17;
        notifyPropertyChanged(BR.hh17);
    }

    @Bindable
    public String getHh1796x() {
        return hh1796x;
    }

    public void setHh1796x(String hh1796x) {
        this.hh1796x = hh1796x;
        notifyPropertyChanged(BR.hh1796x);
    }

    @Bindable
    public String getHh18() {
        return hh18;
    }

    public void setHh18(String hh18) {
        this.hh18 = hh18;
        notifyPropertyChanged(BR.hh18);
    }

    @Bindable
    public String getHh19() {
        return hh19;
    }

    public void setHh19(String hh19) {
        this.hh19 = hh19;
        notifyPropertyChanged(BR.hh19);
    }

    @Bindable
    public String getHh20() {
        return hh20;
    }

    public void setHh20(String hh20) {
        this.hh20 = hh20;
        notifyPropertyChanged(BR.hh20);
    }

    @Bindable
    public String getHh2096x() {
        return hh2096x;
    }

    public void setHh2096x(String hh2096x) {
        this.hh2096x = hh2096x;
        notifyPropertyChanged(BR.hh2096x);
    }

    @Bindable
    public String getHh21() {
        return hh21;
    }

    public void setHh21(String hh21) {
        this.hh21 = hh21;
        notifyPropertyChanged(BR.hh21);
    }

    @Bindable
    public String getHh22() {
        return hh22;
    }

    public void setHh22(String hh22) {
        this.hh22 = hh22;
        notifyPropertyChanged(BR.hh22);
    }

    @Bindable
    public String getHh23() {
        return hh23;
    }

    public void setHh23(String hh23) {
        this.hh23 = hh23;
        notifyPropertyChanged(BR.hh23);
    }

    @Bindable
    public String getHh24() {
        return hh24;
    }

    public void setHh24(String hh24) {
        this.hh24 = hh24;
        notifyPropertyChanged(BR.hh24);
    }

    @Bindable
    public String getHh25() {
        return hh25;
    }

    public void setHh25(String hh25) {
        this.hh25 = hh25;
        notifyPropertyChanged(BR.hh25);
    }

    @Bindable
    public String getHh26() {
        return hh26;
    }

    public void setHh26(String hh26) {
        this.hh26 = hh26;
        notifyPropertyChanged(BR.hh26);
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
    public String getCs01() {
        return cs01;
    }

    public void setCs01(String cs01) {
        this.cs01 = cs01;
        notifyPropertyChanged(BR.cs01);
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
    public String getCs06() {
        return cs06;
    }

    public void setCs06(String cs06) {
        this.cs06 = cs06;
        notifyPropertyChanged(BR.cs06);
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
    public String getCs07961x() {
        return cs07961x;
    }

    public void setCs07961x(String cs07961x) {
        this.cs07961x = cs07961x;
        notifyPropertyChanged(BR.cs07961x);
    }

    @Bindable
    public String getCs07962x() {
        return cs07962x;
    }

    public void setCs07962x(String cs07962x) {
        this.cs07962x = cs07962x;
        notifyPropertyChanged(BR.cs07962x);
    }

    @Bindable
    public String getCs08() {
        return cs08;
    }

    public void setCs08(String cs08) {
        this.cs08 = cs08;
        notifyPropertyChanged(BR.cs08);
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
    public String getCs0804() {
        return cs0804;
    }

    public void setCs0804(String cs0804) {
        this.cs0804 = cs0804;
        notifyPropertyChanged(BR.cs0804);
    }

    @Bindable
    public String getCs0805() {
        return cs0805;
    }

    public void setCs0805(String cs0805) {
        this.cs0805 = cs0805;
        notifyPropertyChanged(BR.cs0805);
    }

    @Bindable
    public String getCs0806() {
        return cs0806;
    }

    public void setCs0806(String cs0806) {
        this.cs0806 = cs0806;
        notifyPropertyChanged(BR.cs0806);
    }

    @Bindable
    public String getCs0807() {
        return cs0807;
    }

    public void setCs0807(String cs0807) {
        this.cs0807 = cs0807;
        notifyPropertyChanged(BR.cs0807);
    }

    @Bindable
    public String getCs0809() {
        return cs0809;
    }

    public void setCs0809(String cs0809) {
        this.cs0809 = cs0809;
        notifyPropertyChanged(BR.cs0809);
    }

    @Bindable
    public String getCs0810() {
        return cs0810;
    }

    public void setCs0810(String cs0810) {
        this.cs0810 = cs0810;
        notifyPropertyChanged(BR.cs0810);
    }

    @Bindable
    public String getCs0896() {
        return cs0896;
    }

    public void setCs0896(String cs0896) {
        this.cs0896 = cs0896;
        notifyPropertyChanged(BR.cs0896);
    }

    @Bindable
    public String getCs0896x() {
        return cs0896x;
    }

    public void setCs0896x(String cs0896x) {
        this.cs0896x = cs0896x;
        notifyPropertyChanged(BR.cs0896x);
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
    public String getCs0996x() {
        return cs0996x;
    }

    public void setCs0996x(String cs0996x) {
        this.cs0996x = cs0996x;
        notifyPropertyChanged(BR.cs0996x);
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
    public String getCs11() {
        return cs11;
    }

    public void setCs11(String cs11) {
        this.cs11 = cs11;
        notifyPropertyChanged(BR.cs11);
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
    public String getCs13() {
        return cs13;
    }

    public void setCs13(String cs13) {
        this.cs13 = cs13;
        notifyPropertyChanged(BR.cs13);
    }

    @Bindable
    public String getCs14() {
        return cs14;
    }

    public void setCs14(String cs14) {
        this.cs14 = cs14;
        notifyPropertyChanged(BR.cs14);
    }

    @Bindable
    public String getCs15() {
        return cs15;
    }

    public void setCs15(String cs15) {
        this.cs15 = cs15;
        notifyPropertyChanged(BR.cs15);
    }

    @Bindable
    public String getCs1596x() {
        return cs1596x;
    }

    public void setCs1596x(String cs1596x) {
        this.cs1596x = cs1596x;
        notifyPropertyChanged(BR.cs1596x);
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
    public String getCs17961x() {
        return cs17961x;
    }

    public void setCs17961x(String cs17961x) {
        this.cs17961x = cs17961x;
        notifyPropertyChanged(BR.cs17961x);
    }

    @Bindable
    public String getCs17962x() {
        return cs17962x;
    }

    public void setCs17962x(String cs17962x) {
        this.cs17962x = cs17962x;
        notifyPropertyChanged(BR.cs17962x);
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
    public String getCs1896x() {
        return cs1896x;
    }

    public void setCs1896x(String cs1896x) {
        this.cs1896x = cs1896x;
        notifyPropertyChanged(BR.cs1896x);
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
    public String getCs1996x() {
        return cs1996x;
    }

    public void setCs1996x(String cs1996x) {
        this.cs1996x = cs1996x;
        notifyPropertyChanged(BR.cs1996x);
    }


    @Bindable
    public String getIm02() {
        return im02;
    }

    public void setIm02(String im02) {
        this.im02 = im02;
        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;
        notifyPropertyChanged(BR.im01);
    }

    @Bindable
    public String getIm03() {
        return im03;
    }

    public void setIm03(String im03) {
        this.im03 = im03;
        notifyPropertyChanged(BR.im03);
    }

    @Bindable
    public String getIm04_dd() {
        return im04_dd;
    }

    public void setIm04_dd(String im04_dd) {
        this.im04_dd = im04_dd;
        notifyPropertyChanged(BR.im04_dd);
    }

    @Bindable
    public String getIm04_mm() {
        return im04_mm;
    }

    public void setIm04_mm(String im04_mm) {
        this.im04_mm = im04_mm;
        notifyPropertyChanged(BR.im04_mm);
    }

    @Bindable
    public String getIm04_yy() {
        return im04_yy;
    }

    public void setIm04_yy(String im04_yy) {
        this.im04_yy = im04_yy;
        notifyPropertyChanged(BR.im04_yy);
    }

    @Bindable
    public String getIm05_01_dd() {
        return im05_01_dd;
    }

    public void setIm05_01_dd(String im05_01_dd) {
        this.im05_01_dd = im05_01_dd;
        notifyPropertyChanged(BR.im05_01_dd);
    }

    @Bindable
    public String getIm05_01_mm() {
        return im05_01_mm;
    }

    public void setIm05_01_mm(String im05_01_mm) {
        this.im05_01_mm = im05_01_mm;
        notifyPropertyChanged(BR.im05_01_mm);
    }

    @Bindable
    public String getIm05_01_yy() {
        return im05_01_yy;
    }

    public void setIm05_01_yy(String im05_01_yy) {
        this.im05_01_yy = im05_01_yy;
        notifyPropertyChanged(BR.im05_01_yy);
    }

    @Bindable
    public String getIm05_02_dd() {
        return im05_02_dd;
    }

    public void setIm05_02_dd(String im05_02_dd) {
        this.im05_02_dd = im05_02_dd;
        notifyPropertyChanged(BR.im05_02_dd);
    }

    @Bindable
    public String getIm05_02_mm() {
        return im05_02_mm;
    }

    public void setIm05_02_mm(String im05_02_mm) {
        this.im05_02_mm = im05_02_mm;
        notifyPropertyChanged(BR.im05_02_mm);
    }

    @Bindable
    public String getIm05_02_yy() {
        return im05_02_yy;
    }

    public void setIm05_02_yy(String im05_02_yy) {
        this.im05_02_yy = im05_02_yy;
        notifyPropertyChanged(BR.im05_02_yy);
    }

    @Bindable
    public String getIm05_03_dd() {
        return im05_03_dd;
    }

    public void setIm05_03_dd(String im05_03_dd) {
        this.im05_03_dd = im05_03_dd;
        notifyPropertyChanged(BR.im05_03_dd);
    }

    @Bindable
    public String getIm05_03_mm() {
        return im05_03_mm;
    }

    public void setIm05_03_mm(String im05_03_mm) {
        this.im05_03_mm = im05_03_mm;
        notifyPropertyChanged(BR.im05_03_mm);
    }

    @Bindable
    public String getIm05_03_yy() {
        return im05_03_yy;
    }

    public void setIm05_03_yy(String im05_03_yy) {
        this.im05_03_yy = im05_03_yy;
        notifyPropertyChanged(BR.im05_03_yy);
    }

    @Bindable
    public String getIm05_04_dd() {
        return im05_04_dd;
    }

    public void setIm05_04_dd(String im05_04_dd) {
        this.im05_04_dd = im05_04_dd;
        notifyPropertyChanged(BR.im05_04_dd);
    }

    @Bindable
    public String getIm05_04_mm() {
        return im05_04_mm;
    }

    public void setIm05_04_mm(String im05_04_mm) {
        this.im05_04_mm = im05_04_mm;
        notifyPropertyChanged(BR.im05_04_mm);
    }

    @Bindable
    public String getIm05_04_yy() {
        return im05_04_yy;
    }

    public void setIm05_04_yy(String im05_04_yy) {
        this.im05_04_yy = im05_04_yy;
        notifyPropertyChanged(BR.im05_04_yy);
    }

    @Bindable
    public String getIm05_05_dd() {
        return im05_05_dd;
    }

    public void setIm05_05_dd(String im05_05_dd) {
        this.im05_05_dd = im05_05_dd;
        notifyPropertyChanged(BR.im05_05_dd);
    }

    @Bindable
    public String getIm05_05_mm() {
        return im05_05_mm;
    }

    public void setIm05_05_mm(String im05_05_mm) {
        this.im05_05_mm = im05_05_mm;
        notifyPropertyChanged(BR.im05_05_mm);
    }

    @Bindable
    public String getIm05_05_yy() {
        return im05_05_yy;
    }

    public void setIm05_05_yy(String im05_05_yy) {
        this.im05_05_yy = im05_05_yy;
        notifyPropertyChanged(BR.im05_05_yy);
    }

    @Bindable
    public String getIm05_06_dd() {
        return im05_06_dd;
    }

    public void setIm05_06_dd(String im05_06_dd) {
        this.im05_06_dd = im05_06_dd;
        notifyPropertyChanged(BR.im05_06_dd);
    }

    @Bindable
    public String getIm05_06_mm() {
        return im05_06_mm;
    }

    public void setIm05_06_mm(String im05_06_mm) {
        this.im05_06_mm = im05_06_mm;
        notifyPropertyChanged(BR.im05_06_mm);
    }

    @Bindable
    public String getIm05_06_yy() {
        return im05_06_yy;
    }

    public void setIm05_06_yy(String im05_06_yy) {
        this.im05_06_yy = im05_06_yy;
        notifyPropertyChanged(BR.im05_06_yy);
    }

    @Bindable
    public String getIm05_07_dd() {
        return im05_07_dd;
    }

    public void setIm05_07_dd(String im05_07_dd) {
        this.im05_07_dd = im05_07_dd;
        notifyPropertyChanged(BR.im05_07_dd);
    }

    @Bindable
    public String getIm05_07_mm() {
        return im05_07_mm;
    }

    public void setIm05_07_mm(String im05_07_mm) {
        this.im05_07_mm = im05_07_mm;
        notifyPropertyChanged(BR.im05_07_mm);
    }

    @Bindable
    public String getIm05_07_yy() {
        return im05_07_yy;
    }

    public void setIm05_07_yy(String im05_07_yy) {
        this.im05_07_yy = im05_07_yy;
        notifyPropertyChanged(BR.im05_07_yy);
    }

    @Bindable
    public String getIm05_08_dd() {
        return im05_08_dd;
    }

    public void setIm05_08_dd(String im05_08_dd) {
        this.im05_08_dd = im05_08_dd;
        notifyPropertyChanged(BR.im05_08_dd);
    }

    @Bindable
    public String getIm05_08_mm() {
        return im05_08_mm;
    }

    public void setIm05_08_mm(String im05_08_mm) {
        this.im05_08_mm = im05_08_mm;
        notifyPropertyChanged(BR.im05_08_mm);
    }

    @Bindable
    public String getIm05_08_yy() {
        return im05_08_yy;
    }

    public void setIm05_08_yy(String im05_08_yy) {
        this.im05_08_yy = im05_08_yy;
        notifyPropertyChanged(BR.im05_08_yy);
    }

    @Bindable
    public String getIm05_09_dd() {
        return im05_09_dd;
    }

    public void setIm05_09_dd(String im05_09_dd) {
        this.im05_09_dd = im05_09_dd;
        notifyPropertyChanged(BR.im05_09_dd);
    }

    @Bindable
    public String getIm05_09_mm() {
        return im05_09_mm;
    }

    public void setIm05_09_mm(String im05_09_mm) {
        this.im05_09_mm = im05_09_mm;
        notifyPropertyChanged(BR.im05_09_mm);
    }

    @Bindable
    public String getIm05_09_yy() {
        return im05_09_yy;
    }

    public void setIm05_09_yy(String im05_09_yy) {
        this.im05_09_yy = im05_09_yy;
        notifyPropertyChanged(BR.im05_09_yy);
    }

    @Bindable
    public String getIm05_10_dd() {
        return im05_10_dd;
    }

    public void setIm05_10_dd(String im05_10_dd) {
        this.im05_10_dd = im05_10_dd;
        notifyPropertyChanged(BR.im05_10_dd);
    }

    @Bindable
    public String getIm05_10_mm() {
        return im05_10_mm;
    }

    public void setIm05_10_mm(String im05_10_mm) {
        this.im05_10_mm = im05_10_mm;
        notifyPropertyChanged(BR.im05_10_mm);
    }

    @Bindable
    public String getIm05_10_yy() {
        return im05_10_yy;
    }

    public void setIm05_10_yy(String im05_10_yy) {
        this.im05_10_yy = im05_10_yy;
        notifyPropertyChanged(BR.im05_10_yy);
    }

    @Bindable
    public String getIm05_11_dd() {
        return im05_11_dd;
    }

    public void setIm05_11_dd(String im05_11_dd) {
        this.im05_11_dd = im05_11_dd;
        notifyPropertyChanged(BR.im05_11_dd);
    }

    @Bindable
    public String getIm05_11_mm() {
        return im05_11_mm;
    }

    public void setIm05_11_mm(String im05_11_mm) {
        this.im05_11_mm = im05_11_mm;
        notifyPropertyChanged(BR.im05_11_mm);
    }

    @Bindable
    public String getIm05_11_yy() {
        return im05_11_yy;
    }

    public void setIm05_11_yy(String im05_11_yy) {
        this.im05_11_yy = im05_11_yy;
        notifyPropertyChanged(BR.im05_11_yy);
    }

    @Bindable
    public String getIm05_12_dd() {
        return im05_12_dd;
    }

    public void setIm05_12_dd(String im05_12_dd) {
        this.im05_12_dd = im05_12_dd;
        notifyPropertyChanged(BR.im05_12_dd);
    }

    @Bindable
    public String getIm05_12_mm() {
        return im05_12_mm;
    }

    public void setIm05_12_mm(String im05_12_mm) {
        this.im05_12_mm = im05_12_mm;
        notifyPropertyChanged(BR.im05_12_mm);
    }

    @Bindable
    public String getIm05_12_yy() {
        return im05_12_yy;
    }

    public void setIm05_12_yy(String im05_12_yy) {
        this.im05_12_yy = im05_12_yy;
        notifyPropertyChanged(BR.im05_12_yy);
    }

    @Bindable
    public String getIm05_13_dd() {
        return im05_13_dd;
    }

    public void setIm05_13_dd(String im05_13_dd) {
        this.im05_13_dd = im05_13_dd;
        notifyPropertyChanged(BR.im05_13_dd);
    }

    @Bindable
    public String getIm05_13_mm() {
        return im05_13_mm;
    }

    public void setIm05_13_mm(String im05_13_mm) {
        this.im05_13_mm = im05_13_mm;
        notifyPropertyChanged(BR.im05_13_mm);
    }

    @Bindable
    public String getIm05_13_yy() {
        return im05_13_yy;
    }

    public void setIm05_13_yy(String im05_13_yy) {
        this.im05_13_yy = im05_13_yy;
        notifyPropertyChanged(BR.im05_13_yy);
    }

    @Bindable
    public String getIm05_14_dd() {
        return im05_14_dd;
    }

    public void setIm05_14_dd(String im05_14_dd) {
        this.im05_14_dd = im05_14_dd;
        notifyPropertyChanged(BR.im05_14_dd);
    }

    @Bindable
    public String getIm05_14_mm() {
        return im05_14_mm;
    }

    public void setIm05_14_mm(String im05_14_mm) {
        this.im05_14_mm = im05_14_mm;
        notifyPropertyChanged(BR.im05_14_mm);
    }

    @Bindable
    public String getIm05_14_yy() {
        return im05_14_yy;
    }

    public void setIm05_14_yy(String im05_14_yy) {
        this.im05_14_yy = im05_14_yy;
        notifyPropertyChanged(BR.im05_14_yy);
    }

    @Bindable
    public String getIm05_15_dd() {
        return im05_15_dd;
    }

    public void setIm05_15_dd(String im05_15_dd) {
        this.im05_15_dd = im05_15_dd;
        notifyPropertyChanged(BR.im05_15_dd);
    }

    @Bindable
    public String getIm05_15_mm() {
        return im05_15_mm;
    }

    public void setIm05_15_mm(String im05_15_mm) {
        this.im05_15_mm = im05_15_mm;
        notifyPropertyChanged(BR.im05_15_mm);
    }

    @Bindable
    public String getIm05_15_yy() {
        return im05_15_yy;
    }

    public void setIm05_15_yy(String im05_15_yy) {
        this.im05_15_yy = im05_15_yy;
        notifyPropertyChanged(BR.im05_15_yy);
    }

    @Bindable
    public String getIm05_16_dd() {
        return im05_16_dd;
    }

    public void setIm05_16_dd(String im05_16_dd) {
        this.im05_16_dd = im05_16_dd;
        notifyPropertyChanged(BR.im05_16_dd);
    }

    @Bindable
    public String getIm05_16_mm() {
        return im05_16_mm;
    }

    public void setIm05_16_mm(String im05_16_mm) {
        this.im05_16_mm = im05_16_mm;
        notifyPropertyChanged(BR.im05_16_mm);
    }

    @Bindable
    public String getIm05_16_yy() {
        return im05_16_yy;
    }

    public void setIm05_16_yy(String im05_16_yy) {
        this.im05_16_yy = im05_16_yy;
        notifyPropertyChanged(BR.im05_16_yy);
    }

    @Bindable
    public String getIm07() {
        return im07;
    }

    public void setIm07(String im07) {
        this.im07 = im07;
        notifyPropertyChanged(BR.im07);
    }

    @Bindable
    public String getIm08() {
        return im08;
    }

    public void setIm08(String im08) {
        this.im08 = im08;
        notifyPropertyChanged(BR.im08);
    }

    @Bindable
    public String getIm08a() {
        return im08a;
    }

    public void setIm08a(String im08a) {
        this.im08a = im08a;
        notifyPropertyChanged(BR.im08a);
    }

    @Bindable
    public String getIm08b() {
        return im08b;
    }

    public void setIm08b(String im08b) {
        this.im08b = im08b;
        notifyPropertyChanged(BR.im08b);
    }

    @Bindable
    public String getIm09() {
        return im09;
    }

    public void setIm09(String im09) {
        this.im09 = im09;
        notifyPropertyChanged(BR.im09);
    }

    @Bindable
    public String getIm10() {
        return im10;
    }

    public void setIm10(String im10) {
        this.im10 = im10;
        notifyPropertyChanged(BR.im10);
    }

    @Bindable
    public String getIm11() {
        return im11;
    }

    public void setIm11(String im11) {
        this.im11 = im11;
        notifyPropertyChanged(BR.im11);
    }

    @Bindable
    public String getIm12() {
        return im12;
    }

    public void setIm12(String im12) {
        this.im12 = im12;
        notifyPropertyChanged(BR.im12);
    }

    @Bindable
    public String getIm12_1x() {
        return im12_1x;
    }

    public void setIm12_1x(String im12_1x) {
        this.im12_1x = im12_1x;
        notifyPropertyChanged(BR.im12_1x);
    }

    @Bindable
    public String getIm12a() {
        return im12a;
    }

    public void setIm12a(String im12a) {
        this.im12a = im12a;
        notifyPropertyChanged(BR.im12a);
    }

    @Bindable
    public String getIm12a1x() {
        return im12a1x;
    }

    public void setIm12a1x(String im12a1x) {
        this.im12a1x = im12a1x;
        notifyPropertyChanged(BR.im12a1x);
    }

    @Bindable
    public String getIm13() {
        return im13;
    }

    public void setIm13(String im13) {
        this.im13 = im13;
        notifyPropertyChanged(BR.im13);
    }

    @Bindable
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
        notifyPropertyChanged(BR.im14);
    }

    @Bindable
    public String getIm15() {
        return im15;
    }

    public void setIm15(String im15) {
        this.im15 = im15;
        notifyPropertyChanged(BR.im15);
    }

    @Bindable
    public String getIm15_1() {
        return im15_1;
    }

    public void setIm15_1(String im15_1) {
        this.im15_1 = im15_1;
        notifyPropertyChanged(BR.im15_1);
    }

    @Bindable
    public String getIm16() {
        return im16;
    }

    public void setIm16(String im16) {
        this.im16 = im16;
        notifyPropertyChanged(BR.im16);
    }

    @Bindable
    public String getIm17() {
        return im17;
    }

    public void setIm17(String im17) {
        this.im17 = im17;
        notifyPropertyChanged(BR.im17);
    }

    @Bindable
    public String getIm17_1() {
        return im17_1;
    }

    public void setIm17_1(String im17_1) {
        this.im17_1 = im17_1;
        notifyPropertyChanged(BR.im17_1);
    }

    @Bindable
    public String getIm18() {
        return im18;
    }

    public void setIm18(String im18) {
        this.im18 = im18;
        notifyPropertyChanged(BR.im18);
    }

    @Bindable
    public String getIm19() {
        return im19;
    }

    public void setIm19(String im19) {
        this.im19 = im19;
        notifyPropertyChanged(BR.im19);
    }

    @Bindable
    public String getIm19_1x() {
        return im19_1x;
    }

    public void setIm19_1x(String im19_1x) {
        this.im19_1x = im19_1x;
        notifyPropertyChanged(BR.im19_1x);
    }

    @Bindable
    public String getIm20() {
        return im20;
    }

    public void setIm20(String im20) {
        this.im20 = im20;
        notifyPropertyChanged(BR.im20);
    }

    @Bindable
    public String getIm21() {
        return im21;
    }

    public void setIm21(String im21) {
        this.im21 = im21;
        notifyPropertyChanged(BR.im21);
    }

    @Bindable
    public String getIm22() {
        return im22;
    }

    public void setIm22(String im22) {
        this.im22 = im22;
        notifyPropertyChanged(BR.im22);
    }

    @Bindable
    public String getIm22_1() {
        return im22_1;
    }

    public void setIm22_1(String im22_1) {
        this.im22_1 = im22_1;
        notifyPropertyChanged(BR.im22_1);
    }

    @Bindable
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm23_6x() {
        return im23_6x;
    }

    public void setIm23_6x(String im23_6x) {
        this.im23_6x = im23_6x;
        notifyPropertyChanged(BR.im23_6x);
    }

    @Bindable
    public String getIm23a() {
        return im23a;
    }

    public void setIm23a(String im23a) {
        this.im23a = im23a;
        notifyPropertyChanged(BR.im23a);
    }

    @Bindable
    public String getIm23b_1() {
        return im23b_1;
    }

    public void setIm23b_1(String im23b_1) {
        this.im23b_1 = im23b_1;
        notifyPropertyChanged(BR.im23b_1);
    }

    @Bindable
    public String getIm23b_2() {
        return im23b_2;
    }

    public void setIm23b_2(String im23b_2) {
        this.im23b_2 = im23b_2;
        notifyPropertyChanged(BR.im23b_2);
    }

    @Bindable
    public String getIm24() {
        return im24;
    }

    public void setIm24(String im24) {
        this.im24 = im24;
        notifyPropertyChanged(BR.im24);
    }

    @Bindable
    public String getIm24_96x() {
        return im24_96x;
    }

    public void setIm24_96x(String im24_96x) {
        this.im24_96x = im24_96x;
        notifyPropertyChanged(BR.im24_96x);
    }

    @Bindable
    public String getIm25() {
        return im25;
    }

    public void setIm25(String im25) {
        this.im25 = im25;
        notifyPropertyChanged(BR.im25);
    }


    @Bindable
    public String getPd01() {
        return pd01;
    }

    public void setPd01(String pd01) {
        this.pd01 = pd01;
        notifyPropertyChanged(BR.pd01);
    }

    @Bindable
    public String getPd02() {
        return pd02;
    }

    public void setPd02(String pd02) {
        this.pd02 = pd02;
        notifyPropertyChanged(BR.pd02);
    }

    @Bindable
    public String getPd03() {
        return pd03;
    }

    public void setPd03(String pd03) {
        this.pd03 = pd03;
        notifyPropertyChanged(BR.pd03);
    }

    @Bindable
    public String getPd04() {
        return pd04;
    }

    public void setPd04(String pd04) {
        this.pd04 = pd04;
        notifyPropertyChanged(BR.pd04);
    }

    @Bindable
    public String getPd05() {
        return pd05;
    }

    public void setPd05(String pd05) {
        this.pd05 = pd05;
        notifyPropertyChanged(BR.pd05);
    }

    @Bindable
    public String getPd0596x() {
        return pd0596x;
    }

    public void setPd0596x(String pd0596x) {
        this.pd0596x = pd0596x;
        notifyPropertyChanged(BR.pd0596x);
    }

    @Bindable
    public String getPd06() {
        return pd06;
    }

    public void setPd06(String pd06) {
        this.pd06 = pd06;
        notifyPropertyChanged(BR.pd06);
    }

    @Bindable
    public String getPd06961x() {
        return pd06961x;
    }

    public void setPd06961x(String pd06961x) {
        this.pd06961x = pd06961x;
        notifyPropertyChanged(BR.pd06961x);
    }

    @Bindable
    public String getPd06962x() {
        return pd06962x;
    }

    public void setPd06962x(String pd06962x) {
        this.pd06962x = pd06962x;
        notifyPropertyChanged(BR.pd06962x);
    }

    @Bindable
    public String getPd07() {
        return pd07;
    }

    public void setPd07(String pd07) {
        this.pd07 = pd07;
        notifyPropertyChanged(BR.pd07);
    }

    @Bindable
    public String getPd0701x() {
        return pd0701x;
    }

    public void setPd0701x(String pd0701x) {
        this.pd0701x = pd0701x;
        notifyPropertyChanged(BR.pd0701x);
    }

    @Bindable
    public String getPd08() {
        return pd08;
    }

    public void setPd08(String pd08) {
        this.pd08 = pd08;
        notifyPropertyChanged(BR.pd08);
    }

    @Bindable
    public String getPd09() {
        return pd09;
    }

    public void setPd09(String pd09) {
        this.pd09 = pd09;
        notifyPropertyChanged(BR.pd09);
    }

    @Bindable
    public String getPd10() {
        return pd10;
    }

    public void setPd10(String pd10) {
        this.pd10 = pd10;
        notifyPropertyChanged(BR.pd10);
    }

    @Bindable
    public String getPd1101() {
        return pd1101;
    }

    public void setPd1101(String pd1101) {
        this.pd1101 = pd1101;
        notifyPropertyChanged(BR.pd1101);
    }

    @Bindable
    public String getPd1102() {
        return pd1102;
    }

    public void setPd1102(String pd1102) {
        this.pd1102 = pd1102;
        notifyPropertyChanged(BR.pd1102);
    }

    @Bindable
    public String getPd12() {
        return pd12;
    }

    public void setPd12(String pd12) {
        this.pd12 = pd12;
        notifyPropertyChanged(BR.pd12);
    }

    @Bindable
    public String getPd1296x() {
        return pd1296x;
    }

    public void setPd1296x(String pd1296x) {
        this.pd1296x = pd1296x;
        notifyPropertyChanged(BR.pd1296x);
    }

    @Bindable
    public String getPd13() {
        return pd13;
    }

    public void setPd13(String pd13) {
        this.pd13 = pd13;
        notifyPropertyChanged(BR.pd13);
    }

    @Bindable
    public String getPd13961x() {
        return pd13961x;
    }

    public void setPd13961x(String pd13961x) {
        this.pd13961x = pd13961x;
        notifyPropertyChanged(BR.pd13961x);
    }

    @Bindable
    public String getPd13962x() {
        return pd13962x;
    }

    public void setPd13962x(String pd13962x) {
        this.pd13962x = pd13962x;
        notifyPropertyChanged(BR.pd13962x);
    }

    @Bindable
    public String getPd14() {
        return pd14;
    }

    public void setPd14(String pd14) {
        this.pd14 = pd14;
        notifyPropertyChanged(BR.pd14);
    }

    @Bindable
    public String getPd1496x() {
        return pd1496x;
    }

    public void setPd1496x(String pd1496x) {
        this.pd1496x = pd1496x;
        notifyPropertyChanged(BR.pd1496x);
    }

    @Bindable
    public String getPd15() {
        return pd15;
    }

    public void setPd15(String pd15) {
        this.pd15 = pd15;
        notifyPropertyChanged(BR.pd15);
    }

    @Bindable
    public String getPd16() {
        return pd16;
    }

    public void setPd16(String pd16) {
        this.pd16 = pd16;
        notifyPropertyChanged(BR.pd16);
    }

    @Bindable
    public String getPd1601() {
        return pd1601;
    }

    public void setPd1601(String pd1601) {
        this.pd1601 = pd1601;
        notifyPropertyChanged(BR.pd1601);
    }

    @Bindable
    public String getPd1602() {
        return pd1602;
    }

    public void setPd1602(String pd1602) {
        this.pd1602 = pd1602;
        notifyPropertyChanged(BR.pd1602);
    }

    @Bindable
    public String getPd1603() {
        return pd1603;
    }

    public void setPd1603(String pd1603) {
        this.pd1603 = pd1603;
        notifyPropertyChanged(BR.pd1603);
    }

    @Bindable
    public String getPd1604() {
        return pd1604;
    }

    public void setPd1604(String pd1604) {
        this.pd1604 = pd1604;
        notifyPropertyChanged(BR.pd1604);
    }

    @Bindable
    public String getPd1605() {
        return pd1605;
    }

    public void setPd1605(String pd1605) {
        this.pd1605 = pd1605;
        notifyPropertyChanged(BR.pd1605);
    }

    @Bindable
    public String getPd1606() {
        return pd1606;
    }

    public void setPd1606(String pd1606) {
        this.pd1606 = pd1606;
        notifyPropertyChanged(BR.pd1606);
    }

    @Bindable
    public String getPd1607() {
        return pd1607;
    }

    public void setPd1607(String pd1607) {
        this.pd1607 = pd1607;
        notifyPropertyChanged(BR.pd1607);
    }

    @Bindable
    public String getPd1696() {
        return pd1696;
    }

    public void setPd1696(String pd1696) {
        this.pd1696 = pd1696;
        notifyPropertyChanged(BR.pd1696);
    }

    @Bindable
    public String getPd1696x() {
        return pd1696x;
    }

    public void setPd1696x(String pd1696x) {
        this.pd1696x = pd1696x;
        notifyPropertyChanged(BR.pd1696x);
    }

    @Bindable
    public String getPd17() {
        return pd17;
    }

    public void setPd17(String pd17) {
        this.pd17 = pd17;
        notifyPropertyChanged(BR.pd17);
    }

    @Bindable
    public String getPd1701x() {
        return pd1701x;
    }

    public void setPd1701x(String pd1701x) {
        this.pd1701x = pd1701x;
        notifyPropertyChanged(BR.pd1701x);
    }

    @Bindable
    public String getPd1702x() {
        return pd1702x;
    }

    public void setPd1702x(String pd1702x) {
        this.pd1702x = pd1702x;
        notifyPropertyChanged(BR.pd1702x);
    }

    @Bindable
    public String getPd1703x() {
        return pd1703x;
    }

    public void setPd1703x(String pd1703x) {
        this.pd1703x = pd1703x;
        notifyPropertyChanged(BR.pd1703x);
    }

    @Bindable
    public String getPd18() {
        return pd18;
    }

    public void setPd18(String pd18) {
        this.pd18 = pd18;
        notifyPropertyChanged(BR.pd18);
    }

    @Bindable
    public String getPd19() {
        return pd19;
    }

    public void setPd19(String pd19) {
        this.pd19 = pd19;
        notifyPropertyChanged(BR.pd19);
    }

    @Bindable
    public String getPd20() {
        return pd20;
    }

    public void setPd20(String pd20) {
        this.pd20 = pd20;
        notifyPropertyChanged(BR.pd20);
    }

    @Bindable
    public String getPd2001() {
        return pd2001;
    }

    public void setPd2001(String pd2001) {
        this.pd2001 = pd2001;
        notifyPropertyChanged(BR.pd2001);
    }


    @Bindable
    public String getPd2002() {
        return pd2002;
    }

    public void setPd2002(String pd2002) {
        this.pd2002 = pd2002;
        notifyPropertyChanged(BR.pd2002);
    }

    @Bindable
    public String getPd2003() {
        return pd2003;
    }

    public void setPd2003(String pd2003) {
        this.pd2003 = pd2003;
        notifyPropertyChanged(BR.pd2003);
    }

    @Bindable
    public String getPd2004() {
        return pd2004;
    }

    public void setPd2004(String pd2004) {
        this.pd2004 = pd2004;
        notifyPropertyChanged(BR.pd2004);
    }

    @Bindable
    public String getPd2005() {
        return pd2005;
    }

    public void setPd2005(String pd2005) {
        this.pd2005 = pd2005;
        notifyPropertyChanged(BR.pd2005);
    }

    @Bindable
    public String getPd2006() {
        return pd2006;
    }

    public void setPd2006(String pd2006) {
        this.pd2006 = pd2006;
        notifyPropertyChanged(BR.pd2006);
    }

    @Bindable
    public String getPd2007() {
        return pd2007;
    }

    public void setPd2007(String pd2007) {
        this.pd2007 = pd2007;
        notifyPropertyChanged(BR.pd2007);
    }

    @Bindable
    public String getPd2096() {
        return pd2096;
    }

    public void setPd2096(String pd2096) {
        this.pd2096 = pd2096;
        notifyPropertyChanged(BR.pd2096);
    }

    @Bindable
    public String getPd2096x() {
        return pd2096x;
    }

    public void setPd2096x(String pd2096x) {
        this.pd2096x = pd2096x;
        notifyPropertyChanged(BR.pd2096x);
    }

    @Bindable
    public String getPd21() {
        return pd21;
    }

    public void setPd21(String pd21) {
        this.pd21 = pd21;
        notifyPropertyChanged(BR.pd21);
    }

    @Bindable
    public String getPd2101x() {
        return pd2101x;
    }

    public void setPd2101x(String pd2101x) {
        this.pd2101x = pd2101x;
        notifyPropertyChanged(BR.pd2101x);
    }

    @Bindable
    public String getPd2102x() {
        return pd2102x;
    }

    public void setPd2102x(String pd2102x) {
        this.pd2102x = pd2102x;
        notifyPropertyChanged(BR.pd2102x);
    }

    @Bindable
    public String getPd2103x() {
        return pd2103x;
    }

    public void setPd2103x(String pd2103x) {
        this.pd2103x = pd2103x;
        notifyPropertyChanged(BR.pd2103x);
    }

    @Bindable
    public String getPd22() {
        return pd22;
    }

    public void setPd22(String pd22) {
        this.pd22 = pd22;
        notifyPropertyChanged(BR.pd22);
    }

    @Bindable
    public String getBf01() {
        return bf01;
    }

    public void setBf01(String bf01) {
        this.bf01 = bf01;
        notifyPropertyChanged(BR.bf01);
    }

    @Bindable
    public String getBf02() {
        return bf02;
    }

    public void setBf02(String bf02) {
        this.bf02 = bf02;
        notifyPropertyChanged(BR.bf02);
    }

    @Bindable
    public String getBf03() {
        return bf03;
    }

    public void setBf03(String bf03) {
        this.bf03 = bf03;
        notifyPropertyChanged(BR.bf03);
    }

    @Bindable
    public String getBf3y() {
        return bf3y;
    }

    public void setBf3y(String bf3y) {
        this.bf3y = bf3y;
        notifyPropertyChanged(BR.bf3y);
    }

    @Bindable
    public String getBf03m() {
        return bf03m;
    }

    public void setBf03m(String bf03m) {
        this.bf03m = bf03m;
        notifyPropertyChanged(BR.bf03m);
    }

    @Bindable
    public String getBf3d() {
        return bf3d;
    }

    public void setBf3d(String bf3d) {
        this.bf3d = bf3d;
        notifyPropertyChanged(BR.bf3d);
    }

    @Bindable
    public String getBf04() {
        return bf04;
    }

    public void setBf04(String bf04) {
        this.bf04 = bf04;
        notifyPropertyChanged(BR.bf04);
    }

    @Bindable
    public String getBf05() {
        return bf05;
    }

    public void setBf05(String bf05) {
        this.bf05 = bf05;
        notifyPropertyChanged(BR.bf05);
    }

    @Bindable
    public String getBf0502x() {
        return bf0502x;
    }

    public void setBf0502x(String bf0502x) {
        this.bf0502x = bf0502x;
        notifyPropertyChanged(BR.bf0502x);
    }

    @Bindable
    public String getBf0503x() {
        return bf0503x;
    }

    public void setBf0503x(String bf0503x) {
        this.bf0503x = bf0503x;
        notifyPropertyChanged(BR.bf0503x);
    }

    @Bindable
    public String getBf06() {
        return bf06;
    }

    public void setBf06(String bf06) {
        this.bf06 = bf06;
        notifyPropertyChanged(BR.bf06);
    }

    @Bindable
    public String getBf07() {
        return bf07;
    }

    public void setBf07(String bf07) {
        this.bf07 = bf07;
        notifyPropertyChanged(BR.bf07);
    }

    @Bindable
    public String getBf0796x() {
        return bf0796x;
    }

    public void setBf0796x(String bf0796x) {
        this.bf0796x = bf0796x;
        notifyPropertyChanged(BR.bf0796x);
    }

    @Bindable
    public String getBf08() {
        return bf08;
    }

    public void setBf08(String bf08) {
        this.bf08 = bf08;
        notifyPropertyChanged(BR.bf08);
    }

    @Bindable
    public String getBf09() {
        return bf09;
    }

    public void setBf09(String bf09) {
        this.bf09 = bf09;
        notifyPropertyChanged(BR.bf09);
    }

    @Bindable
    public String getBf0996x() {
        return bf0996x;
    }

    public void setBf0996x(String bf0996x) {
        this.bf0996x = bf0996x;
        notifyPropertyChanged(BR.bf0996x);
    }

    @Bindable
    public String getBf10() {
        return bf10;
    }

    public void setBf10(String bf10) {
        this.bf10 = bf10;
        notifyPropertyChanged(BR.bf10);
    }

    @Bindable
    public String getBf11() {
        return bf11;
    }

    public void setBf11(String bf11) {
        this.bf11 = bf11;
        notifyPropertyChanged(BR.bf11);
    }

    @Bindable
    public String getBf12() {
        return bf12;
    }

    public void setBf12(String bf12) {
        this.bf12 = bf12;
        notifyPropertyChanged(BR.bf12);
    }

    @Bindable
    public String getBf13() {
        return bf13;
    }

    public void setBf13(String bf13) {
        this.bf13 = bf13;
        notifyPropertyChanged(BR.bf13);
    }

    @Bindable
    public String getCv01() {
        return cv01;
    }

    public void setCv01(String cv01) {
        this.cv01 = cv01;
        notifyPropertyChanged(BR.cv01);
    }

    @Bindable
    public String getCv02() {
        return cv02;
    }

    public void setCv02(String cv02) {
        this.cv02 = cv02;
        notifyPropertyChanged(BR.cv02);
    }

    @Bindable
    public String getCv03() {
        return cv03;
    }

    public void setCv03(String cv03) {
        this.cv03 = cv03;
        notifyPropertyChanged(BR.cv03);
    }

    @Bindable
    public String getCv04() {
        return cv04;
    }

    public void setCv04(String cv04) {
        this.cv04 = cv04;
        notifyPropertyChanged(BR.cv04);
    }

    @Bindable
    public String getCv05() {
        return cv05;
    }

    public void setCv05(String cv05) {
        this.cv05 = cv05;
        notifyPropertyChanged(BR.cv05);
    }

    @Bindable
    public String getCv0596x() {
        return cv0596x;
    }

    public void setCv0596x(String cv0596x) {
        this.cv0596x = cv0596x;
        notifyPropertyChanged(BR.cv0596x);
    }

    @Bindable
    public String getCv06() {
        return cv06;
    }

    public void setCv06(String cv06) {
        this.cv06 = cv06;
        notifyPropertyChanged(BR.cv06);
    }

    @Bindable
    public String getCv07() {
        return cv07;
    }

    public void setCv07(String cv07) {
        this.cv07 = cv07;
        notifyPropertyChanged(BR.cv07);
    }

    @Bindable
    public String getCv08() {
        return cv08;
    }

    public void setCv08(String cv08) {
        this.cv08 = cv08;
        notifyPropertyChanged(BR.cv08);
    }

    @Bindable
    public String getCv09() {
        return cv09;
    }

    public void setCv09(String cv09) {
        this.cv09 = cv09;
        notifyPropertyChanged(BR.cv09);
    }

    @Bindable
    public String getCv10() {
        return cv10;
    }

    public void setCv10(String cv10) {
        this.cv10 = cv10;
        notifyPropertyChanged(BR.cv10);
    }

    @Bindable
    public String getCv11() {
        return cv11;
    }

    public void setCv11(String cv11) {
        this.cv11 = cv11;
        notifyPropertyChanged(BR.cv11);
    }

    @Bindable
    public String getCv12() {
        return cv12;
    }

    public void setCv12(String cv12) {
        this.cv12 = cv12;
        notifyPropertyChanged(BR.cv12);
    }

    @Bindable
    public String getCv1296x() {
        return cv1296x;
    }

    public void setCv1296x(String cv1296x) {
        this.cv1296x = cv1296x;
        notifyPropertyChanged(BR.cv1296x);
    }

    @Bindable
    public String getCv13() {
        return cv13;
    }

    public void setCv13(String cv13) {
        this.cv13 = cv13;
        notifyPropertyChanged(BR.cv13);
    }

    @Bindable
    public String getCv14() {
        return cv14;
    }

    public void setCv14(String cv14) {
        this.cv14 = cv14;
        notifyPropertyChanged(BR.cv14);
    }

    @Bindable
    public String getCv15() {
        return cv15;
    }

    public void setCv15(String cv15) {
        this.cv15 = cv15;
        notifyPropertyChanged(BR.cv15);
    }

    @Bindable
    public String getCv16() {
        return cv16;
    }

    public void setCv16(String cv16) {
        this.cv16 = cv16;
        notifyPropertyChanged(BR.cv16);
    }

    @Bindable
    public String getCv1696x() {
        return cv1696x;
    }

    public void setCv1696x(String cv1696x) {
        this.cv1696x = cv1696x;
        notifyPropertyChanged(BR.cv1696x);
    }

    @Bindable
    public String getCv17() {
        return cv17;
    }

    public void setCv17(String cv17) {
        this.cv17 = cv17;
        notifyPropertyChanged(BR.cv17);
    }

    @Bindable
    public String getCv18() {
        return cv18;
    }

    public void setCv18(String cv18) {
        this.cv18 = cv18;
        notifyPropertyChanged(BR.cv18);
    }

    @Bindable
    public String getCv1896x() {
        return cv1896x;
    }

    public void setCv1896x(String cv1896x) {
        this.cv1896x = cv1896x;
        notifyPropertyChanged(BR.cv1896x);
    }

    @Bindable
    public String getCv19() {
        return cv19;
    }

    public void setCv19(String cv19) {
        this.cv19 = cv19;
        notifyPropertyChanged(BR.cv19);
    }

    @Bindable
    public String getCv1996x() {
        return cv1996x;
    }

    public void setCv1996x(String cv1996x) {
        this.cv1996x = cv1996x;
        notifyPropertyChanged(BR.cv1996x);
    }


    @Bindable
    public String getSe01() {
        return se01;
    }

    public void setSe01(String se01) {
        this.se01 = se01;
        notifyPropertyChanged(BR.se01);
    }

    @Bindable
    public String getSe0196x() {
        return se0196x;
    }

    public void setSe0196x(String se0196x) {
        this.se0196x = se0196x;
        notifyPropertyChanged(BR.se0196x);
    }

    @Bindable
    public String getSe02() {
        return se02;
    }

    public void setSe02(String se02) {
        this.se02 = se02;
        notifyPropertyChanged(BR.se02);
    }

    @Bindable
    public String getSe0296x() {
        return se0296x;
    }

    public void setSe0296x(String se0296x) {
        this.se0296x = se0296x;
        notifyPropertyChanged(BR.se0296x);
    }

    @Bindable
    public String getSe03() {
        return se03;
    }

    public void setSe03(String se03) {
        this.se03 = se03;
        notifyPropertyChanged(BR.se03);
    }

    @Bindable
    public String getSe0396x() {
        return se0396x;
    }

    public void setSe0396x(String se0396x) {
        this.se0396x = se0396x;
        notifyPropertyChanged(BR.se0396x);
    }

    @Bindable
    public String getSe04() {
        return se04;
    }

    public void setSe04(String se04) {
        this.se04 = se04;
        notifyPropertyChanged(BR.se04);
    }

    @Bindable
    public String getSe0496x() {
        return se0496x;
    }

    public void setSe0496x(String se0496x) {
        this.se0496x = se0496x;
        notifyPropertyChanged(BR.se0496x);
    }

    @Bindable
    public String getSe05() {
        return se05;
    }

    public void setSe05(String se05) {
        this.se05 = se05;
        notifyPropertyChanged(BR.se05);
    }

    @Bindable
    public String getSe0596x() {
        return se0596x;
    }

    public void setSe0596x(String se0596x) {
        this.se0596x = se0596x;
        notifyPropertyChanged(BR.se0596x);
    }

    @Bindable
    public String getSe06a() {
        return se06a;
    }

    public void setSe06a(String se06a) {
        this.se06a = se06a;
        notifyPropertyChanged(BR.se06a);
    }

    @Bindable
    public String getSe07a() {
        return se07a;
    }

    public void setSe07a(String se07a) {
        this.se07a = se07a;
        notifyPropertyChanged(BR.se07a);
    }

    @Bindable
    public String getSe08() {
        return se08;
    }

    public void setSe08(String se08) {
        this.se08 = se08;
        notifyPropertyChanged(BR.se08);
    }

    @Bindable
    public String getSe0896x() {
        return se0896x;
    }

    public void setSe0896x(String se0896x) {
        this.se0896x = se0896x;
        notifyPropertyChanged(BR.se0896x);
    }

    @Bindable
    public String getSe09() {
        return se09;
    }

    public void setSe09(String se09) {
        this.se09 = se09;
        notifyPropertyChanged(BR.se09);
    }

    @Bindable
    public String getSe10() {
        return se10;
    }

    public void setSe10(String se10) {
        this.se10 = se10;
        notifyPropertyChanged(BR.se10);
    }

    @Bindable
    public String getSe1099x() {
        return se1099x;
    }

    public void setSe1099x(String se1099x) {
        this.se1099x = se1099x;
        notifyPropertyChanged(BR.se1099x);
    }

    @Bindable
    public String getSe11() {
        return se11;
    }

    public void setSe11(String se11) {
        this.se11 = se11;
        notifyPropertyChanged(BR.se11);
    }

    @Bindable
    public String getSe1196x() {
        return se1196x;
    }

    public void setSe1196x(String se1196x) {
        this.se1196x = se1196x;
        notifyPropertyChanged(BR.se1196x);
    }

    @Bindable
    public String getSe12() {
        return se12;
    }

    public void setSe12(String se12) {
        this.se12 = se12;
        notifyPropertyChanged(BR.se12);
    }

    @Bindable
    public String getSe1296x() {
        return se1296x;
    }

    public void setSe1296x(String se1296x) {
        this.se1296x = se1296x;
        notifyPropertyChanged(BR.se1296x);
    }

    @Bindable
    public String getSe13() {
        return se13;
    }

    public void setSe13(String se13) {
        this.se13 = se13;
        notifyPropertyChanged(BR.se13);
    }

    @Bindable
    public String getSe14() {
        return se14;
    }

    public void setSe14(String se14) {
        this.se14 = se14;
        notifyPropertyChanged(BR.se14);
    }

    @Bindable
    public String getSe15() {
        return se15;
    }

    public void setSe15(String se15) {
        this.se15 = se15;
        notifyPropertyChanged(BR.se15);
    }

    @Bindable
    public String getSe16() {
        return se16;
    }

    public void setSe16(String se16) {
        this.se16 = se16;
        notifyPropertyChanged(BR.se16);
    }

    @Bindable
    public String getSe17() {
        return se17;
    }

    public void setSe17(String se17) {
        this.se17 = se17;
        notifyPropertyChanged(BR.se17);
    }

    @Bindable
    public String getSe1701() {
        return se1701;
    }

    public void setSe1701(String se1701) {
        this.se1701 = se1701;
        notifyPropertyChanged(BR.se1701);
    }

    @Bindable
    public String getSe1702() {
        return se1702;
    }

    public void setSe1702(String se1702) {
        this.se1702 = se1702;
        notifyPropertyChanged(BR.se1702);
    }

    @Bindable
    public String getSe1703() {
        return se1703;
    }

    public void setSe1703(String se1703) {
        this.se1703 = se1703;
        notifyPropertyChanged(BR.se1703);
    }

    @Bindable
    public String getSe1704() {
        return se1704;
    }

    public void setSe1704(String se1704) {
        this.se1704 = se1704;
        notifyPropertyChanged(BR.se1704);
    }

    @Bindable
    public String getSe1705() {
        return se1705;
    }

    public void setSe1705(String se1705) {
        this.se1705 = se1705;
        notifyPropertyChanged(BR.se1705);
    }

    @Bindable
    public String getSe1801() {
        return se1801;
    }

    public void setSe1801(String se1801) {
        this.se1801 = se1801;
        notifyPropertyChanged(BR.se1801);
    }

    @Bindable
    public String getSe1802() {
        return se1802;
    }

    public void setSe1802(String se1802) {
        this.se1802 = se1802;
        notifyPropertyChanged(BR.se1802);
    }

    @Bindable
    public String getSe1803() {
        return se1803;
    }

    public void setSe1803(String se1803) {
        this.se1803 = se1803;
        notifyPropertyChanged(BR.se1803);
    }

    @Bindable
    public String getSe1804() {
        return se1804;
    }

    public void setSe1804(String se1804) {
        this.se1804 = se1804;
        notifyPropertyChanged(BR.se1804);
    }

    @Bindable
    public String getSe1805() {
        return se1805;
    }

    public void setSe1805(String se1805) {
        this.se1805 = se1805;
        notifyPropertyChanged(BR.se1805);
    }

    @Bindable
    public String getSe1896() {
        return se1896;
    }

    public void setSe1896(String se1896) {
        this.se1896 = se1896;
        notifyPropertyChanged(BR.se1896);
    }

    @Bindable
    public String getSe189601x() {
        return se189601x;
    }

    public void setSe189601x(String se189601x) {
        this.se189601x = se189601x;
        notifyPropertyChanged(BR.se189601x);
    }

    @Bindable
    public String getSe19() {
        return se19;
    }

    public void setSe19(String se19) {
        this.se19 = se19;
        notifyPropertyChanged(BR.se19);
    }

    @Bindable
    public String getSe1996x() {
        return se1996x;
    }

    public void setSe1996x(String se1996x) {
        this.se1996x = se1996x;
        notifyPropertyChanged(BR.se1996x);
    }

    @Bindable
    public String getSe20() {
        return se20;
    }

    public void setSe20(String se20) {
        this.se20 = se20;
        notifyPropertyChanged(BR.se20);
    }

    @Bindable
    public String getSe2001() {
        return se2001;
    }

    public void setSe2001(String se2001) {
        this.se2001 = se2001;
        notifyPropertyChanged(BR.se2001);
    }

    @Bindable
    public String getSe2002() {
        return se2002;
    }

    public void setSe2002(String se2002) {
        this.se2002 = se2002;
        notifyPropertyChanged(BR.se2002);
    }

    @Bindable
    public String getSe2003() {
        return se2003;
    }

    public void setSe2003(String se2003) {
        this.se2003 = se2003;
        notifyPropertyChanged(BR.se2003);
    }

    @Bindable
    public String getSe2004() {
        return se2004;
    }

    public void setSe2004(String se2004) {
        this.se2004 = se2004;
        notifyPropertyChanged(BR.se2004);
    }

    @Bindable
    public String getSe2005() {
        return se2005;
    }

    public void setSe2005(String se2005) {
        this.se2005 = se2005;
        notifyPropertyChanged(BR.se2005);
    }

    @Bindable
    public String getSe2096() {
        return se2096;
    }

    public void setSe2096(String se2096) {
        this.se2096 = se2096;
        notifyPropertyChanged(BR.se2096);
    }

    @Bindable
    public String getSe2096x() {
        return se2096x;
    }

    public void setSe2096x(String se2096x) {
        this.se2096x = se2096x;
        notifyPropertyChanged(BR.se2096x);
    }

    @Bindable
    public String getSe21() {
        return se21;
    }

    public void setSe21(String se21) {
        this.se21 = se21;
        notifyPropertyChanged(BR.se21);
    }

    @Bindable
    public String getSe2101() {
        return se2101;
    }

    public void setSe2101(String se2101) {
        this.se2101 = se2101;
        notifyPropertyChanged(BR.se2101);
    }

    @Bindable
    public String getSe2102() {
        return se2102;
    }

    public void setSe2102(String se2102) {
        this.se2102 = se2102;
        notifyPropertyChanged(BR.se2102);
    }

    @Bindable
    public String getSe2103() {
        return se2103;
    }

    public void setSe2103(String se2103) {
        this.se2103 = se2103;
        notifyPropertyChanged(BR.se2103);
    }

    @Bindable
    public String getSe2104() {
        return se2104;
    }

    public void setSe2104(String se2104) {
        this.se2104 = se2104;
        notifyPropertyChanged(BR.se2104);
    }

    @Bindable
    public String getSe2105() {
        return se2105;
    }

    public void setSe2105(String se2105) {
        this.se2105 = se2105;
        notifyPropertyChanged(BR.se2105);
    }

    @Bindable
    public String getSe2196() {
        return se2196;
    }

    public void setSe2196(String se2196) {
        this.se2196 = se2196;
        notifyPropertyChanged(BR.se2196);
    }

    @Bindable
    public String getSe2196x() {
        return se2196x;
    }

    public void setSe2196x(String se2196x) {
        this.se2196x = se2196x;
        notifyPropertyChanged(BR.se2196x);
    }

    @Bindable
    public String getSe2201() {
        return se2201;
    }

    public void setSe2201(String se2201) {
        this.se2201 = se2201;
        notifyPropertyChanged(BR.se2201);
    }

    @Bindable
    public String getSe2202() {
        return se2202;
    }

    public void setSe2202(String se2202) {
        this.se2202 = se2202;
        notifyPropertyChanged(BR.se2202);
    }

    @Bindable
    public String getSe2203() {
        return se2203;
    }

    public void setSe2203(String se2203) {
        this.se2203 = se2203;
        notifyPropertyChanged(BR.se2203);
    }

    @Bindable
    public String getSe2204() {
        return se2204;
    }

    public void setSe2204(String se2204) {
        this.se2204 = se2204;
        notifyPropertyChanged(BR.se2204);
    }

    @Bindable
    public String getSe2205() {
        return se2205;
    }

    public void setSe2205(String se2205) {
        this.se2205 = se2205;
        notifyPropertyChanged(BR.se2205);
    }

    @Bindable
    public String getSe2206() {
        return se2206;
    }

    public void setSe2206(String se2206) {
        this.se2206 = se2206;
        notifyPropertyChanged(BR.se2206);
    }

    @Bindable
    public String getSe2207() {
        return se2207;
    }

    public void setSe2207(String se2207) {
        this.se2207 = se2207;
        notifyPropertyChanged(BR.se2207);
    }

    @Bindable
    public String getSe2208() {
        return se2208;
    }

    public void setSe2208(String se2208) {
        this.se2208 = se2208;
        notifyPropertyChanged(BR.se2208);
    }

    @Bindable
    public String getSe2209() {
        return se2209;
    }

    public void setSe2209(String se2209) {
        this.se2209 = se2209;
        notifyPropertyChanged(BR.se2209);
    }

    @Bindable
    public String getSe2210() {
        return se2210;
    }

    public void setSe2210(String se2210) {
        this.se2210 = se2210;
        notifyPropertyChanged(BR.se2210);
    }

    @Bindable
    public String getSe2211() {
        return se2211;
    }

    public void setSe2211(String se2211) {
        this.se2211 = se2211;
        notifyPropertyChanged(BR.se2211);
    }

    @Bindable
    public String getSe2212() {
        return se2212;
    }

    public void setSe2212(String se2212) {
        this.se2212 = se2212;
        notifyPropertyChanged(BR.se2212);
    }

    @Bindable
    public String getSe2213() {
        return se2213;
    }

    public void setSe2213(String se2213) {
        this.se2213 = se2213;
        notifyPropertyChanged(BR.se2213);
    }

    @Bindable
    public String getSe2214() {
        return se2214;
    }

    public void setSe2214(String se2214) {
        this.se2214 = se2214;
        notifyPropertyChanged(BR.se2214);
    }

    @Bindable
    public String getSe2215() {
        return se2215;
    }

    public void setSe2215(String se2215) {
        this.se2215 = se2215;
        notifyPropertyChanged(BR.se2215);
    }

    @Bindable
    public String getSe2216() {
        return se2216;
    }

    public void setSe2216(String se2216) {
        this.se2216 = se2216;
        notifyPropertyChanged(BR.se2216);
    }

    @Bindable
    public String getSe2217() {
        return se2217;
    }

    public void setSe2217(String se2217) {
        this.se2217 = se2217;
        notifyPropertyChanged(BR.se2217);
    }

    @Bindable
    public String getSe2218() {
        return se2218;
    }

    public void setSe2218(String se2218) {
        this.se2218 = se2218;
        notifyPropertyChanged(BR.se2218);
    }

    @Bindable
    public String getSe23() {
        return se23;
    }

    public void setSe23(String se23) {
        this.se23 = se23;
        notifyPropertyChanged(BR.se23);
    }

    @Bindable
    public String getSe24() {
        return se24;
    }

    public void setSe24(String se24) {
        this.se24 = se24;
        notifyPropertyChanged(BR.se24);
    }

    @Bindable
    public String getSe25() {
        return se25;
    }

    public void setSe25(String se25) {
        this.se25 = se25;
        notifyPropertyChanged(BR.se25);
    }

    @Bindable
    public String getSe26() {
        return se26;
    }

    public void setSe26(String se26) {
        this.se26 = se26;
        notifyPropertyChanged(BR.se26);
    }

    @Bindable
    public String getSe27() {
        return se27;
    }

    public void setSe27(String se27) {
        this.se27 = se27;
        notifyPropertyChanged(BR.se27);
    }

    @Bindable
    public String getSe2701() {
        return se2701;
    }

    public void setSe2701(String se2701) {
        this.se2701 = se2701;
        notifyPropertyChanged(BR.se2701);
    }

    @Bindable
    public String getSe2702() {
        return se2702;
    }

    public void setSe2702(String se2702) {
        this.se2702 = se2702;
        notifyPropertyChanged(BR.se2702);
    }

    @Bindable
    public String getSe2703() {
        return se2703;
    }

    public void setSe2703(String se2703) {
        this.se2703 = se2703;
        notifyPropertyChanged(BR.se2703);
    }

    @Bindable
    public String getSe2704() {
        return se2704;
    }

    public void setSe2704(String se2704) {
        this.se2704 = se2704;
        notifyPropertyChanged(BR.se2704);
    }

    @Bindable
    public String getSe28() {
        return se28;
    }

    public void setSe28(String se28) {
        this.se28 = se28;
        notifyPropertyChanged(BR.se28);
    }

    @Bindable
    public String getSe2801() {
        return se2801;
    }

    public void setSe2801(String se2801) {
        this.se2801 = se2801;
        notifyPropertyChanged(BR.se2801);
    }

    @Bindable
    public String getSe2802() {
        return se2802;
    }

    public void setSe2802(String se2802) {
        this.se2802 = se2802;
        notifyPropertyChanged(BR.se2802);
    }

    @Bindable
    public String getSe2803() {
        return se2803;
    }

    public void setSe2803(String se2803) {
        this.se2803 = se2803;
        notifyPropertyChanged(BR.se2803);
    }

    @Bindable
    public String getSe29() {
        return se29;
    }

    public void setSe29(String se29) {
        this.se29 = se29;
        notifyPropertyChanged(BR.se29);
    }

    @Bindable
    public String getSe30() {
        return se30;
    }

    public void setSe30(String se30) {
        this.se30 = se30;
        notifyPropertyChanged(BR.se30);
    }

    @Bindable
    public String getSe3001() {
        return se3001;
    }

    public void setSe3001(String se3001) {
        this.se3001 = se3001;
        notifyPropertyChanged(BR.se3001);
    }

    @Bindable
    public String getSe3002() {
        return se3002;
    }

    public void setSe3002(String se3002) {
        this.se3002 = se3002;
        notifyPropertyChanged(BR.se3002);
    }

    @Bindable
    public String getSe3003() {
        return se3003;
    }

    public void setSe3003(String se3003) {
        this.se3003 = se3003;
        notifyPropertyChanged(BR.se3003);
    }

    @Bindable
    public String getSe3096() {
        return se3096;
    }

    public void setSe3096(String se3096) {
        this.se3096 = se3096;
        notifyPropertyChanged(BR.se3096);
    }

    @Bindable
    public String getSe3096x() {
        return se3096x;
    }

    public void setSe3096x(String se3096x) {
        this.se3096x = se3096x;
        notifyPropertyChanged(BR.se3096x);
    }

    @Bindable
    public String getSe31() {
        return se31;
    }

    public void setSe31(String se31) {
        this.se31 = se31;
        notifyPropertyChanged(BR.se31);
    }

    @Bindable
    public String getSe3196x() {
        return se3196x;
    }

    public void setSe3196x(String se3196x) {
        this.se3196x = se3196x;
        notifyPropertyChanged(BR.se3196x);
    }

    @Bindable
    public String getSe32() {
        return se32;
    }

    public void setSe32(String se32) {
        this.se32 = se32;
        notifyPropertyChanged(BR.se32);
    }

    @Bindable
    public String getSe3302() {
        return se3302;
    }

    public void setSe3302(String se3302) {
        this.se3302 = se3302;
        notifyPropertyChanged(BR.se3302);
    }

    @Bindable
    public String getSe3301() {
        return se3301;
    }

    public void setSe3301(String se3301) {
        this.se3301 = se3301;
        notifyPropertyChanged(BR.se3301);
    }

    @Bindable
    public String getSe3401() {
        return se3401;
    }

    public void setSe3401(String se3401) {
        this.se3401 = se3401;
        notifyPropertyChanged(BR.se3401);
    }

    @Bindable
    public String getSe3402() {
        return se3402;
    }

    public void setSe3402(String se3402) {
        this.se3402 = se3402;
        notifyPropertyChanged(BR.se3402);
    }

    @Bindable
    public String getSe35() {
        return se35;
    }

    public void setSe35(String se35) {
        this.se35 = se35;
        notifyPropertyChanged(BR.se35);
    }

    @Bindable
    public String getSe36() {
        return se36;
    }

    public void setSe36(String se36) {
        this.se36 = se36;
        notifyPropertyChanged(BR.se36);
    }

    @Bindable
    public String getSe37() {
        return se37;
    }

    public void setSe37(String se37) {
        this.se37 = se37;
        notifyPropertyChanged(BR.se37);
    }

    @Bindable
    public String getSe3701() {
        return se3701;
    }

    public void setSe3701(String se3701) {
        this.se3701 = se3701;
        notifyPropertyChanged(BR.se3701);
    }

    @Bindable
    public String getSe3702() {
        return se3702;
    }

    public void setSe3702(String se3702) {
        this.se3702 = se3702;
        notifyPropertyChanged(BR.se3702);
    }

    @Bindable
    public String getSe3703() {
        return se3703;
    }

    public void setSe3703(String se3703) {
        this.se3703 = se3703;
        notifyPropertyChanged(BR.se3703);
    }

    @Bindable
    public String getSe3704() {
        return se3704;
    }

    public void setSe3704(String se3704) {
        this.se3704 = se3704;
        notifyPropertyChanged(BR.se3704);
    }

    @Bindable
    public String getSe3705() {
        return se3705;
    }

    public void setSe3705(String se3705) {
        this.se3705 = se3705;
        notifyPropertyChanged(BR.se3705);
    }

    @Bindable
    public String getSe3706() {
        return se3706;
    }

    public void setSe3706(String se3706) {
        this.se3706 = se3706;
        notifyPropertyChanged(BR.se3706);
    }

    @Bindable
    public String getSe3707() {
        return se3707;
    }

    public void setSe3707(String se3707) {
        this.se3707 = se3707;
        notifyPropertyChanged(BR.se3707);
    }

    @Bindable
    public String getSe3708() {
        return se3708;
    }

    public void setSe3708(String se3708) {
        this.se3708 = se3708;
        notifyPropertyChanged(BR.se3708);
    }

    @Bindable
    public String getSe3709() {
        return se3709;
    }

    public void setSe3709(String se3709) {
        this.se3709 = se3709;
        notifyPropertyChanged(BR.se3709);
    }

    @Bindable
    public String getSe3796() {
        return se3796;
    }

    public void setSe3796(String se3796) {
        this.se3796 = se3796;
        notifyPropertyChanged(BR.se3796);
    }

    @Bindable
    public String getSe3796x() {
        return se3796x;
    }

    public void setSe3796x(String se3796x) {
        this.se3796x = se3796x;
        notifyPropertyChanged(BR.se3796x);
    }

    @Bindable
    public String getSe38() {
        return se38;
    }

    public void setSe38(String se38) {
        this.se38 = se38;
        notifyPropertyChanged(BR.se38);
    }

    @Bindable
    public String getSe39() {
        return se39;
    }

    public void setSe39(String se39) {
        this.se39 = se39;
        notifyPropertyChanged(BR.se39);
    }

    @Bindable
    public String getSe40() {
        return se40;
    }

    public void setSe40(String se40) {
        this.se40 = se40;
        notifyPropertyChanged(BR.se40);
    }
}
