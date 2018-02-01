package com.ilatis;

public class GsonMain {
    public static void main(String[] args) {
        GsonConvertor gsonConvertor = new GsonConvertor();
        gsonConvertor.json();

        JsonToClass JS = new JsonToClass();
        JS.fjs();
    }
}
