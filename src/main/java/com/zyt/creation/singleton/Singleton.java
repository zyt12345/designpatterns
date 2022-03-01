package com.zyt.creation.singleton;

public class Singleton {
    private volatile static Singleton INSTANCE;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
