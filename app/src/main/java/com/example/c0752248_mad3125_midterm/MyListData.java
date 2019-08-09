package com.example.c0752248_mad3125_midterm;

import java.io.Serializable;
import java.util.ArrayList;

public class MyListData implements Serializable {

    static ArrayList<MyListData> DataList = new ArrayList<MyListData>();
    private String missionName;
    private String flightNumber;
    private String launchYear;
    private String rocketId;
    private String rocketType;

    public MyListData(String missionName, String flightNumber, String launchYear, String rocketId, String rocketType) {
        this.missionName = missionName;
        this.flightNumber = flightNumber;
        this.launchYear = launchYear;
        this.rocketId = rocketId;
        this.rocketType = rocketType;
    }

    public String getDescription() {
        return missionName;
    }
    public void setDescription(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }
}
