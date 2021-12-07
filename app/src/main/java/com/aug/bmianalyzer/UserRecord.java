package com.aug.bmianalyzer;

public class UserRecord {
    private  String status;
    private  String weight;
    private  String height;
    private  String dob;

    public UserRecord(String status, String weight, String height, String dob) {
        this.status = status;
        this.weight = weight;
        this.height = height;
        this.dob = dob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
