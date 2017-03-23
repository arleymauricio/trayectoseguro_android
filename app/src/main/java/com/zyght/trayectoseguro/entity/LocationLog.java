package com.zyght.trayectoseguro.entity;

import java.util.UUID;

/**
 * Created by Arley Mauricio Duarte on 3/21/17.
 */

public class LocationLog {
    private double latitude;
    private double longitude;
    private String date;


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
