package com.ilatis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonConvertor {


    public void json() {
        Pers person = new Pers(2, 120, 349, "WAR", "Patric");
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.print(gson.toJson(person));
    }

}
