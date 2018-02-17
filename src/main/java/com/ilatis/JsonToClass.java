package com.ilatis;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class JsonToClass {
    public void fjs() {

        Gson gson = new Gson();
        BufferedReader br;
        List<ClassForBars> list;

        try {
            br = new BufferedReader(new FileReader("/home/thymomenosgata/IdeaProjects/GSONLearning/src/main/resources/data-2897-2017-12-21.json"));
            Type founderListType = new TypeToken<ArrayList<ClassForBars>>(){}.getType();
            list = gson.fromJson(br, founderListType);
            for(ClassForBars cl : list){
                System.out.println(cl.geoData.coordinates);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
