package com.facadepatterndemoapp;

import com.facadepatterndemoapp.interfaces.MobileStore;

public class SamsungMobile implements MobileStore {

    private static final String MODEL_NAME = "Samsung-J7";
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
