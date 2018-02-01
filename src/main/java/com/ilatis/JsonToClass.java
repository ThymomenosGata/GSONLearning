package com.ilatis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonToClass {
    public void fjs() {
        String fJson = new String();

        try {
            FileReader reader = new FileReader("/home/thymomenosgata/IdeaProjects/GSONLearning/src/main/resources/data-2897-2017-12-21.json");
            int c;
            while ((c = reader.read()) != -1){
                fJson+=(char)c;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        ClassForBars bars = gson.fromJson(fJson, ClassForBars.class);

        System.out.print(bars.Address);
    }

}
