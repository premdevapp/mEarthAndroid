package com.example.mearthwatch.Model;

public class EarthQuake {
    private String place;
    private String detailLink;
    private String type;
    private double magnitude;
    private double latitude;
    private double longitude;
    private long time;

    public EarthQuake(){}

    public EarthQuake(String place, String detailLink, String type, double magnitude, double latitude, double longitude, long time) {
        this.place = place;
        this.detailLink = detailLink;
        this.type = type;
        this.magnitude = magnitude;
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDetailLink() {
        return detailLink;
    }

    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
