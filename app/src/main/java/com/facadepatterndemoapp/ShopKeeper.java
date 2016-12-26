package com.facadepatterndemoapp;

import com.facadepatterndemoapp.interfaces.MobileStore;

public class ShopKeeper {
    private MobileStore asusMobilePhone;
    private MobileStore samsungMobilePhone;
    private MobileStore motorolaMobilePhone;

    private static String MODEL_NAME = "MODEL NAME = ";
    private static String AMOUNT = "\nAMOUNT = ";

    public ShopKeeper(){
        asusMobilePhone = new AsusMobile();
        samsungMobilePhone = new SamsungMobile();
        motorolaMobilePhone = new MotorolaMobile();
    }
    public String asusMobileSale(){
        return MODEL_NAME + asusMobilePhone.modelName() + AMOUNT + asusMobilePhone.sale();
    }
    public String samsungMobileSale(){
        return MODEL_NAME + samsungMobilePhone.modelName() + AMOUNT + samsungMobilePhone.sale();
    }
    public String motorolaMobileSale(){
        return MODEL_NAME + motorolaMobilePhone.modelName() + AMOUNT + motorolaMobilePhone.sale();
    }
}
