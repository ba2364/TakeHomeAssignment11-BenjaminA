package com.ba2364.takehomeassignment11_benjamina;

import java.io.Serializable;

public class City implements Serializable {

    public String cityName;
    public String yearEst;
    public int logoIDNum;

    public City() {
    }

    public City(String cityName, String yearEst, int logoIDNum) {
        this.cityName = cityName;
        this.yearEst = yearEst;
        this.logoIDNum = logoIDNum;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getYearEst() {
        return yearEst;
    }

    public void setYearEst(String yearEst) {
        this.yearEst = yearEst;
    }

    public int getLogoIDNum() {
        return logoIDNum;
    }

    public void setLogoIDNum(int logoIDNum) {
        this.logoIDNum = logoIDNum;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", yearEst='" + yearEst + '\'' +
                ", logoIDNum=" + logoIDNum +
                '}';
    }
}