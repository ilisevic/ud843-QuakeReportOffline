package com.example.android.quakereport;

public class Eartquake {

    private String location;

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public Eartquake(String location, String date, double magnitude) {
        this.location = location;
        this.date = date;
        this.magnitude = magnitude;
    }

    private String date;
    private double magnitude;

}
