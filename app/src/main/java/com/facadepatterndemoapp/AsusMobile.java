package com.facadepatterndemoapp;

import com.facadepatterndemoapp.interfaces.MobileStore;

public class AsusMobile implements MobileStore {
    private static final String MODEL_NAME = "Asus-Zen-phone";
    private static final double SALE = 20000;

    @Override
    public String modelName() {
        return MODEL_NAME;
    }

    @Override
    public double sale() {
        return SALE;
    }
}

