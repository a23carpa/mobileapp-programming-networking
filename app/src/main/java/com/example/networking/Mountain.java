package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
     private String name;

    //Tillfäligt
    /*
     private String location;
    @SerializedName("size")
    private int heightInMeters;
    @SerializedName("cost")
    private int heightinFeet;
    // Somthing auxdata

     */
    public Mountain(String name) {
        this.name= name;
    }

    public String getName(){
        return this.name;
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