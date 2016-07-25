package com.example;

/**
 * Created by karol on 25.07.16.
 */
public class User {

    private String fname;
    private String lname;

    User(String fname,  String lname){
        this.fname=fname;
        this.lname=lname;
    }


    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
