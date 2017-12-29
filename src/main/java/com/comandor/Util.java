package com.comandor;

public class Util {

    public static void pause (int secounds) {
        try {
            Thread.sleep(secounds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
