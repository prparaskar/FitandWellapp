package com.example.fitwell;

public class Appliicantdata {
    String name;
    String address;
    String dob;
    String coursename;


    public Appliicantdata(String name, String dob, String address, String coursename) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.coursename = coursename;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getCoursename() {
        return coursename;
    }
}
