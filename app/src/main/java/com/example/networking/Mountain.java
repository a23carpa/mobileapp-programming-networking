package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
     private String name;
     private String location;
    @SerializedName("size")
    private int heightInMeters;
    @SerializedName("cost")
    private int heightinFeet;
    private Auxdata auxdata;

    public Mountain(String name) {
        this.name= name;
    }

    public String getName(){
        return this.name;
    }

    public String getLocation() {
        return location;
    }

    public int getHeightInMeters() {
        return heightInMeters;
    }

    public int getHeightinFeet() {
        return heightinFeet;
    }

    public Auxdata getAuxdata() {
        return auxdata;
    }
}

/*
   "ID": "mobilprog_kinnekulle",
        "name": "Kinnekulle",
        "type": "brom",
        "company": "",
        "location": "Skaraborg",
        "category": "",
        "size": 306,
        "cost": 1004,
        "auxdata": {
            "wiki": "https://sv.wikipedia.org/wiki/Kinnekulle",
            "img":
 */