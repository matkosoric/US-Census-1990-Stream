package com.matko.soric.model;

import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import java.io.Serializable;

public class CensusRecord implements Serializable {
    public CensusRecord(Integer caseid, Integer dAge, Integer dAncstry1, Integer dAncstry2, Integer iAvail, Integer iCitizen, Integer iClass, Integer dDepart, Integer iDisabl1, Integer iDisabl2, Integer iEnglish, Integer iFeb55, Integer iFertil, Integer dHispanic, Integer dHour89, Integer dHours, Integer iImmigr, Integer dIncome1, Integer dIncome2, Integer dIncome3, Integer dIncome4, Integer dIncome5, Integer dIncome6, Integer dIncome7, Integer dIncome8, Integer dIndustry, Integer iKorean, Integer iLang1, Integer iLooking, Integer iMarital, Integer iMay75880, Integer iMeans, Integer iMilitary, Integer iMobility, Integer iMobillim, Integer dOccup, Integer iOthrserv, Integer iPerscare, Integer dPOB, Integer dPoverty, Integer dPwgt1, Integer iRagechld, Integer dRearning, Integer iRelat1, Integer iRelat2, Integer iRemplpar, Integer iRiders, Integer iRlabor, Integer iRownchld, Integer dRpincome, Integer iRPOB, Integer iRrelchld, Integer iRspouse, Integer iRvetserv, Integer iSchool, Integer iSept80, Integer iSex, Integer iSubfam1, Integer iSubfam2, Integer iTmpabsnt, Integer dTravtime, Integer iVietnam, Integer dWeek89, Integer iWork89, Integer iWorklwk, Integer iWWII, Integer iYearsch, Integer iYearwrk, Integer dYrsserv) {
        this.caseid = caseid;
        this.dAge = dAge;
        this.dAncstry1 = dAncstry1;
        this.dAncstry2 = dAncstry2;
        this.iAvail = iAvail;
        this.iCitizen = iCitizen;
        this.iClass = iClass;
        this.dDepart = dDepart;
        this.iDisabl1 = iDisabl1;
        this.iDisabl2 = iDisabl2;
        this.iEnglish = iEnglish;
        this.iFeb55 = iFeb55;
        this.iFertil = iFertil;
        this.dHispanic = dHispanic;
        this.dHour89 = dHour89;
        this.dHours = dHours;
        this.iImmigr = iImmigr;
        this.dIncome1 = dIncome1;
        this.dIncome2 = dIncome2;
        this.dIncome3 = dIncome3;
        this.dIncome4 = dIncome4;
        this.dIncome5 = dIncome5;
        this.dIncome6 = dIncome6;
        this.dIncome7 = dIncome7;
        this.dIncome8 = dIncome8;
        this.dIndustry = dIndustry;
        this.iKorean = iKorean;
        this.iLang1 = iLang1;
        this.iLooking = iLooking;
        this.iMarital = iMarital;
        this.iMay75880 = iMay75880;
        this.iMeans = iMeans;
        this.iMilitary = iMilitary;
        this.iMobility = iMobility;
        this.iMobillim = iMobillim;
        this.dOccup = dOccup;
        this.iOthrserv = iOthrserv;
        this.iPerscare = iPerscare;
        this.dPOB = dPOB;
        this.dPoverty = dPoverty;
        this.dPwgt1 = dPwgt1;
        this.iRagechld = iRagechld;
        this.dRearning = dRearning;
        this.iRelat1 = iRelat1;
        this.iRelat2 = iRelat2;
        this.iRemplpar = iRemplpar;
        this.iRiders = iRiders;
        this.iRlabor = iRlabor;
        this.iRownchld = iRownchld;
        this.dRpincome = dRpincome;
        this.iRPOB = iRPOB;
        this.iRrelchld = iRrelchld;
        this.iRspouse = iRspouse;
        this.iRvetserv = iRvetserv;
        this.iSchool = iSchool;
        this.iSept80 = iSept80;
        this.iSex = iSex;
        this.iSubfam1 = iSubfam1;
        this.iSubfam2 = iSubfam2;
        this.iTmpabsnt = iTmpabsnt;
        this.dTravtime = dTravtime;
        this.iVietnam = iVietnam;
        this.dWeek89 = dWeek89;
        this.iWork89 = iWork89;
        this.iWorklwk = iWorklwk;
        this.iWWII = iWWII;
        this.iYearsch = iYearsch;
        this.iYearwrk = iYearwrk;
        this.dYrsserv = dYrsserv;
    }

    private Integer caseid;

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public Integer getdAge() {
        return dAge;
    }

    public void setdAge(Integer dAge) {
        this.dAge = dAge;
    }

    public Integer getdAncstry1() {
        return dAncstry1;
    }

    public void setdAncstry1(Integer dAncstry1) {
        this.dAncstry1 = dAncstry1;
    }

    public Integer getdAncstry2() {
        return dAncstry2;
    }

    public void setdAncstry2(Integer dAncstry2) {
        this.dAncstry2 = dAncstry2;
    }

    public Integer getiAvail() {
        return iAvail;
    }

    public void setiAvail(Integer iAvail) {
        this.iAvail = iAvail;
    }

    public Integer getiCitizen() {
        return iCitizen;
    }

    public void setiCitizen(Integer iCitizen) {
        this.iCitizen = iCitizen;
    }

    public Integer getiClass() {
        return iClass;
    }

    public void setiClass(Integer iClass) {
        this.iClass = iClass;
    }

    public Integer getdDepart() {
        return dDepart;
    }

    public void setdDepart(Integer dDepart) {
        this.dDepart = dDepart;
    }

    public Integer getiDisabl1() {
        return iDisabl1;
    }

    public void setiDisabl1(Integer iDisabl1) {
        this.iDisabl1 = iDisabl1;
    }

    public Integer getiDisabl2() {
        return iDisabl2;
    }

    public void setiDisabl2(Integer iDisabl2) {
        this.iDisabl2 = iDisabl2;
    }

    public Integer getiEnglish() {
        return iEnglish;
    }

    public void setiEnglish(Integer iEnglish) {
        this.iEnglish = iEnglish;
    }

    public Integer getiFeb55() {
        return iFeb55;
    }

    public void setiFeb55(Integer iFeb55) {
        this.iFeb55 = iFeb55;
    }

    public Integer getiFertil() {
        return iFertil;
    }

    public void setiFertil(Integer iFertil) {
        this.iFertil = iFertil;
    }

    public Integer getdHispanic() {
        return dHispanic;
    }

    public void setdHispanic(Integer dHispanic) {
        this.dHispanic = dHispanic;
    }

    public Integer getdHour89() {
        return dHour89;
    }

    public void setdHour89(Integer dHour89) {
        this.dHour89 = dHour89;
    }

    public Integer getdHours() {
        return dHours;
    }

    public void setdHours(Integer dHours) {
        this.dHours = dHours;
    }

    public Integer getiImmigr() {
        return iImmigr;
    }

    public void setiImmigr(Integer iImmigr) {
        this.iImmigr = iImmigr;
    }

    public Integer getdIncome1() {
        return dIncome1;
    }

    public void setdIncome1(Integer dIncome1) {
        this.dIncome1 = dIncome1;
    }

    public Integer getdIncome2() {
        return dIncome2;
    }

    public void setdIncome2(Integer dIncome2) {
        this.dIncome2 = dIncome2;
    }

    public Integer getdIncome3() {
        return dIncome3;
    }

    public void setdIncome3(Integer dIncome3) {
        this.dIncome3 = dIncome3;
    }

    public Integer getdIncome4() {
        return dIncome4;
    }

    public void setdIncome4(Integer dIncome4) {
        this.dIncome4 = dIncome4;
    }

    public Integer getdIncome5() {
        return dIncome5;
    }

    public void setdIncome5(Integer dIncome5) {
        this.dIncome5 = dIncome5;
    }

    public Integer getdIncome6() {
        return dIncome6;
    }

    public void setdIncome6(Integer dIncome6) {
        this.dIncome6 = dIncome6;
    }

    public Integer getdIncome7() {
        return dIncome7;
    }

    public void setdIncome7(Integer dIncome7) {
        this.dIncome7 = dIncome7;
    }

    public Integer getdIncome8() {
        return dIncome8;
    }

    public void setdIncome8(Integer dIncome8) {
        this.dIncome8 = dIncome8;
    }

    public Integer getdIndustry() {
        return dIndustry;
    }

    public void setdIndustry(Integer dIndustry) {
        this.dIndustry = dIndustry;
    }

    public Integer getiKorean() {
        return iKorean;
    }

    public void setiKorean(Integer iKorean) {
        this.iKorean = iKorean;
    }

    public Integer getiLang1() {
        return iLang1;
    }

    public void setiLang1(Integer iLang1) {
        this.iLang1 = iLang1;
    }

    public Integer getiLooking() {
        return iLooking;
    }

    public void setiLooking(Integer iLooking) {
        this.iLooking = iLooking;
    }

    public Integer getiMarital() {
        return iMarital;
    }

    public void setiMarital(Integer iMarital) {
        this.iMarital = iMarital;
    }

    public Integer getiMay75880() {
        return iMay75880;
    }

    public void setiMay75880(Integer iMay75880) {
        this.iMay75880 = iMay75880;
    }

    public Integer getiMeans() {
        return iMeans;
    }

    public void setiMeans(Integer iMeans) {
        this.iMeans = iMeans;
    }

    public Integer getiMilitary() {
        return iMilitary;
    }

    public void setiMilitary(Integer iMilitary) {
        this.iMilitary = iMilitary;
    }

    public Integer getiMobility() {
        return iMobility;
    }

    public void setiMobility(Integer iMobility) {
        this.iMobility = iMobility;
    }

    public Integer getiMobillim() {
        return iMobillim;
    }

    public void setiMobillim(Integer iMobillim) {
        this.iMobillim = iMobillim;
    }

    public Integer getdOccup() {
        return dOccup;
    }

    public void setdOccup(Integer dOccup) {
        this.dOccup = dOccup;
    }

    public Integer getiOthrserv() {
        return iOthrserv;
    }

    public void setiOthrserv(Integer iOthrserv) {
        this.iOthrserv = iOthrserv;
    }

    public Integer getiPerscare() {
        return iPerscare;
    }

    public void setiPerscare(Integer iPerscare) {
        this.iPerscare = iPerscare;
    }

    public Integer getdPOB() {
        return dPOB;
    }

    public void setdPOB(Integer dPOB) {
        this.dPOB = dPOB;
    }

    public Integer getdPoverty() {
        return dPoverty;
    }

    public void setdPoverty(Integer dPoverty) {
        this.dPoverty = dPoverty;
    }

    public Integer getdPwgt1() {
        return dPwgt1;
    }

    public void setdPwgt1(Integer dPwgt1) {
        this.dPwgt1 = dPwgt1;
    }

    public Integer getiRagechld() {
        return iRagechld;
    }

    public void setiRagechld(Integer iRagechld) {
        this.iRagechld = iRagechld;
    }

    public Integer getdRearning() {
        return dRearning;
    }

    public void setdRearning(Integer dRearning) {
        this.dRearning = dRearning;
    }

    public Integer getiRelat1() {
        return iRelat1;
    }

    public void setiRelat1(Integer iRelat1) {
        this.iRelat1 = iRelat1;
    }

    public Integer getiRelat2() {
        return iRelat2;
    }

    public void setiRelat2(Integer iRelat2) {
        this.iRelat2 = iRelat2;
    }

    public Integer getiRemplpar() {
        return iRemplpar;
    }

    public void setiRemplpar(Integer iRemplpar) {
        this.iRemplpar = iRemplpar;
    }

    public Integer getiRiders() {
        return iRiders;
    }

    public void setiRiders(Integer iRiders) {
        this.iRiders = iRiders;
    }

    public Integer getiRlabor() {
        return iRlabor;
    }

    public void setiRlabor(Integer iRlabor) {
        this.iRlabor = iRlabor;
    }

    public Integer getiRownchld() {
        return iRownchld;
    }

    public void setiRownchld(Integer iRownchld) {
        this.iRownchld = iRownchld;
    }

    public Integer getdRpincome() {
        return dRpincome;
    }

    public void setdRpincome(Integer dRpincome) {
        this.dRpincome = dRpincome;
    }

    public Integer getiRPOB() {
        return iRPOB;
    }

    public void setiRPOB(Integer iRPOB) {
        this.iRPOB = iRPOB;
    }

    public Integer getiRrelchld() {
        return iRrelchld;
    }

    public void setiRrelchld(Integer iRrelchld) {
        this.iRrelchld = iRrelchld;
    }

    public Integer getiRspouse() {
        return iRspouse;
    }

    public void setiRspouse(Integer iRspouse) {
        this.iRspouse = iRspouse;
    }

    public Integer getiRvetserv() {
        return iRvetserv;
    }

    public void setiRvetserv(Integer iRvetserv) {
        this.iRvetserv = iRvetserv;
    }

    public Integer getiSchool() {
        return iSchool;
    }

    public void setiSchool(Integer iSchool) {
        this.iSchool = iSchool;
    }

    public Integer getiSept80() {
        return iSept80;
    }

    public void setiSept80(Integer iSept80) {
        this.iSept80 = iSept80;
    }

    public Integer getiSex() {
        return iSex;
    }

    public void setiSex(Integer iSex) {
        this.iSex = iSex;
    }

    public Integer getiSubfam1() {
        return iSubfam1;
    }

    public void setiSubfam1(Integer iSubfam1) {
        this.iSubfam1 = iSubfam1;
    }

    public Integer getiSubfam2() {
        return iSubfam2;
    }

    public void setiSubfam2(Integer iSubfam2) {
        this.iSubfam2 = iSubfam2;
    }

    public Integer getiTmpabsnt() {
        return iTmpabsnt;
    }

    public void setiTmpabsnt(Integer iTmpabsnt) {
        this.iTmpabsnt = iTmpabsnt;
    }

    public Integer getdTravtime() {
        return dTravtime;
    }

    public void setdTravtime(Integer dTravtime) {
        this.dTravtime = dTravtime;
    }

    public Integer getiVietnam() {
        return iVietnam;
    }

    public void setiVietnam(Integer iVietnam) {
        this.iVietnam = iVietnam;
    }

    public Integer getdWeek89() {
        return dWeek89;
    }

    public void setdWeek89(Integer dWeek89) {
        this.dWeek89 = dWeek89;
    }

    public Integer getiWork89() {
        return iWork89;
    }

    public void setiWork89(Integer iWork89) {
        this.iWork89 = iWork89;
    }

    public Integer getiWorklwk() {
        return iWorklwk;
    }

    public void setiWorklwk(Integer iWorklwk) {
        this.iWorklwk = iWorklwk;
    }

    public Integer getiWWII() {
        return iWWII;
    }

    public void setiWWII(Integer iWWII) {
        this.iWWII = iWWII;
    }

    public Integer getiYearsch() {
        return iYearsch;
    }

    public void setiYearsch(Integer iYearsch) {
        this.iYearsch = iYearsch;
    }

    public Integer getiYearwrk() {
        return iYearwrk;
    }

    public void setiYearwrk(Integer iYearwrk) {
        this.iYearwrk = iYearwrk;
    }

    public Integer getdYrsserv() {
        return dYrsserv;
    }

    public void setdYrsserv(Integer dYrsserv) {
        this.dYrsserv = dYrsserv;
    }

    private Integer dAge;
    private Integer dAncstry1;
    private Integer dAncstry2;
    private Integer iAvail;
    private Integer iCitizen;
    private Integer iClass;
    private Integer dDepart;
    private Integer iDisabl1;
    private Integer iDisabl2;
    private Integer iEnglish;
    private Integer iFeb55;
    private Integer iFertil;
    private Integer dHispanic;
    private Integer dHour89;
    private Integer dHours;
    private Integer iImmigr;
    private Integer dIncome1;
    private Integer dIncome2;
    private Integer dIncome3;
    private Integer dIncome4;
    private Integer dIncome5;
    private Integer dIncome6;
    private Integer dIncome7;
    private Integer dIncome8;
    private Integer dIndustry;
    private Integer iKorean;
    private Integer iLang1;
    private Integer iLooking;
    private Integer iMarital;
    private Integer iMay75880;
    private Integer iMeans;
    private Integer iMilitary;
    private Integer iMobility;
    private Integer iMobillim;
    private Integer dOccup;
    private Integer iOthrserv;
    private Integer iPerscare;
    private Integer dPOB;
    private Integer dPoverty;
    private Integer dPwgt1;
    private Integer iRagechld;
    private Integer dRearning;
    private Integer iRelat1;
    private Integer iRelat2;
    private Integer iRemplpar;
    private Integer iRiders;
    private Integer iRlabor;
    private Integer iRownchld;
    private Integer dRpincome;
    private Integer iRPOB;
    private Integer iRrelchld;
    private Integer iRspouse;
    private Integer iRvetserv;
    private Integer iSchool;
    private Integer iSept80;
    private Integer iSex;
    private Integer iSubfam1;
    private Integer iSubfam2;
    private Integer iTmpabsnt;
    private Integer dTravtime;
    private Integer iVietnam;
    private Integer dWeek89;
    private Integer iWork89;
    private Integer iWorklwk;
    private Integer iWWII;
    private Integer iYearsch;
    private Integer iYearwrk;
    private Integer dYrsserv;


    @Override
    public String toString() {
        return "CensusRecord{" +
                "caseid=" + caseid +
                ", dAge=" + dAge +
                ", dAncstry1=" + dAncstry1 +
                ", dAncstry2=" + dAncstry2 +
                ", iAvail=" + iAvail +
                ", iCitizen=" + iCitizen +
                ", iClass=" + iClass +
                ", dDepart=" + dDepart +
                ", iDisabl1=" + iDisabl1 +
                ", iDisabl2=" + iDisabl2 +
                ", iEnglish=" + iEnglish +
                ", iFeb55=" + iFeb55 +
                ", iFertil=" + iFertil +
                ", dHispanic=" + dHispanic +
                ", dHour89=" + dHour89 +
                ", dHours=" + dHours +
                ", iImmigr=" + iImmigr +
                ", dIncome1=" + dIncome1 +
                ", dIncome2=" + dIncome2 +
                ", dIncome3=" + dIncome3 +
                ", dIncome4=" + dIncome4 +
                ", dIncome5=" + dIncome5 +
                ", dIncome6=" + dIncome6 +
                ", dIncome7=" + dIncome7 +
                ", dIncome8=" + dIncome8 +
                ", dIndustry=" + dIndustry +
                ", iKorean=" + iKorean +
                ", iLang1=" + iLang1 +
                ", iLooking=" + iLooking +
                ", iMarital=" + iMarital +
                ", iMay75880=" + iMay75880 +
                ", iMeans=" + iMeans +
                ", iMilitary=" + iMilitary +
                ", iMobility=" + iMobility +
                ", iMobillim=" + iMobillim +
                ", dOccup=" + dOccup +
                ", iOthrserv=" + iOthrserv +
                ", iPerscare=" + iPerscare +
                ", dPOB=" + dPOB +
                ", dPoverty=" + dPoverty +
                ", dPwgt1=" + dPwgt1 +
                ", iRagechld=" + iRagechld +
                ", dRearning=" + dRearning +
                ", iRelat1=" + iRelat1 +
                ", iRelat2=" + iRelat2 +
                ", iRemplpar=" + iRemplpar +
                ", iRiders=" + iRiders +
                ", iRlabor=" + iRlabor +
                ", iRownchld=" + iRownchld +
                ", dRpincome=" + dRpincome +
                ", iRPOB=" + iRPOB +
                ", iRrelchld=" + iRrelchld +
                ", iRspouse=" + iRspouse +
                ", iRvetserv=" + iRvetserv +
                ", iSchool=" + iSchool +
                ", iSept80=" + iSept80 +
                ", iSex=" + iSex +
                ", iSubfam1=" + iSubfam1 +
                ", iSubfam2=" + iSubfam2 +
                ", iTmpabsnt=" + iTmpabsnt +
                ", dTravtime=" + dTravtime +
                ", iVietnam=" + iVietnam +
                ", dWeek89=" + dWeek89 +
                ", iWork89=" + iWork89 +
                ", iWorklwk=" + iWorklwk +
                ", iWWII=" + iWWII +
                ", iYearsch=" + iYearsch +
                ", iYearwrk=" + iYearwrk +
                ", dYrsserv=" + dYrsserv +
                '}';
    }




    private static StructType structType = DataTypes.createStructType(new StructField[] {
            DataTypes.createStructField("caseid", DataTypes.IntegerType, false),
            DataTypes.createStructField("dAge", DataTypes.IntegerType, false),
            DataTypes.createStructField("dAncstry1", DataTypes.IntegerType, false),
            DataTypes.createStructField("dAncstry2", DataTypes.IntegerType, false),
            DataTypes.createStructField("iAvail", DataTypes.IntegerType, false),
            DataTypes.createStructField("iCitizen", DataTypes.IntegerType, false),
            DataTypes.createStructField("iClass", DataTypes.IntegerType, false),
            DataTypes.createStructField("dDepart", DataTypes.IntegerType, false),
            DataTypes.createStructField("iDisabl1", DataTypes.IntegerType, false),
            DataTypes.createStructField("iDisabl2", DataTypes.IntegerType, false),
            DataTypes.createStructField("iEnglish", DataTypes.IntegerType, false),
            DataTypes.createStructField("iFeb55", DataTypes.IntegerType, false),
            DataTypes.createStructField("iFertil", DataTypes.IntegerType, false),
            DataTypes.createStructField("dHispanic", DataTypes.IntegerType, false),
            DataTypes.createStructField("dHour89", DataTypes.IntegerType, false),
            DataTypes.createStructField("dHours", DataTypes.IntegerType, false),
            DataTypes.createStructField("iImmigr", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIncome1", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIncome2", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIncome3", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIncome4", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIncome5", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIncome6", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIncome7", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIncome8", DataTypes.IntegerType, false),
            DataTypes.createStructField("dIndustry", DataTypes.IntegerType, false),
            DataTypes.createStructField("iKorean",DataTypes.IntegerType,false),
            DataTypes.createStructField("iLang1", DataTypes.IntegerType, false),
            DataTypes.createStructField("iLooking", DataTypes.IntegerType, false),
            DataTypes.createStructField("iMarital", DataTypes.IntegerType, false),
            DataTypes.createStructField("iMay75880", DataTypes.IntegerType, false),
            DataTypes.createStructField("iMeans", DataTypes.IntegerType, false),
            DataTypes.createStructField("iMilitary", DataTypes.IntegerType, false),
            DataTypes.createStructField("iMobility", DataTypes.IntegerType, false),
            DataTypes.createStructField("iMobillim", DataTypes.IntegerType, false),
            DataTypes.createStructField("dOccup", DataTypes.IntegerType, false),
            DataTypes.createStructField("iOthrserv", DataTypes.IntegerType, false),
            DataTypes.createStructField("iPerscare", DataTypes.IntegerType, false),
            DataTypes.createStructField("dPOB", DataTypes.IntegerType, false),
            DataTypes.createStructField("dPoverty", DataTypes.IntegerType, false),
            DataTypes.createStructField("dPwgt1", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRagechld", DataTypes.IntegerType, false),
            DataTypes.createStructField("dRearning", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRelat1", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRelat2", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRemplpar", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRiders", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRlabor", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRownchld", DataTypes.IntegerType, false),
            DataTypes.createStructField("dRpincome", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRPOB", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRrelchld", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRspouse", DataTypes.IntegerType, false),
            DataTypes.createStructField("iRvetserv", DataTypes.IntegerType, false),
            DataTypes.createStructField("iSchool", DataTypes.IntegerType, false),
            DataTypes.createStructField("iSept80", DataTypes.IntegerType, false),
            DataTypes.createStructField("iSex", DataTypes.IntegerType, false),
            DataTypes.createStructField("iSubfam1", DataTypes.IntegerType, false),
            DataTypes.createStructField("iSubfam2", DataTypes.IntegerType, false),
            DataTypes.createStructField("iTmpabsnt", DataTypes.IntegerType, false),
            DataTypes.createStructField("dTravtime", DataTypes.IntegerType, false),
            DataTypes.createStructField("iVietnam", DataTypes.IntegerType, false),
            DataTypes.createStructField("dWeek89", DataTypes.IntegerType, false),
            DataTypes.createStructField("iWork89", DataTypes.IntegerType, false),
            DataTypes.createStructField("iWorklwk", DataTypes.IntegerType, false),
            DataTypes.createStructField("iWWII", DataTypes.IntegerType, false),
            DataTypes.createStructField("iYearsch", DataTypes.IntegerType, false),
            DataTypes.createStructField("iYearwrk", DataTypes.IntegerType, false),
            DataTypes.createStructField("dYrsserv", DataTypes.IntegerType, false)
    });

    public static StructType getStructType() {
        return structType;
    }

    public Object[] getAllValues() {
        return new Object[]{caseid, dAge, dAncstry1, dAncstry2, iAvail, iCitizen, iClass, dDepart, iDisabl1, iDisabl2, iEnglish, iFeb55, iFertil, dHispanic, dHour89, dHours, iImmigr, dIncome1, dIncome2, dIncome3, dIncome4, dIncome5, dIncome6, dIncome7, dIncome8, dIndustry, iKorean, iLang1, iLooking, iMarital, iMay75880, iMeans, iMilitary, iMobility, iMobillim, dOccup, iOthrserv, iPerscare, dPOB, dPoverty, dPwgt1, iRagechld, dRearning, iRelat1, iRelat2, iRemplpar, iRiders, iRlabor, iRownchld, dRpincome, iRPOB, iRrelchld, iRspouse, iRvetserv, iSchool, iSept80, iSex, iSubfam1, iSubfam2, iTmpabsnt, dTravtime, iVietnam, dWeek89, iWork89, iWorklwk, iWWII, iYearsch, iYearwrk, dYrsserv};
    }



}
