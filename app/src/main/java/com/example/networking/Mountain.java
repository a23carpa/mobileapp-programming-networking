package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    private String namn;

    //Tillfäligt
    /*
     private String location;
    @SerializedName("size")
    private int heightInMeters;
    @SerializedName("cost")
    private int heightinFeet;
    // Somthing auxdata

     */
    public Mountain(String namn) {
        this.namn = namn;
    }

    public String getNamn(){
        return this.namn;
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