package com.company.singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    public static Singleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    private Singleton() {}

    private int count = 5;
    public int getCount(){
        return count;
    }
    public void increment(){
        count++;
    }


}
