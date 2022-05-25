package com.company;

public enum FoodType {
    MEAT(0.1), CROPS(0.2), ALL(0.3);

    public double  foodToBodyRatio;

    FoodType(Double  foodToBodyRatio)
    {
        this. foodToBodyRatio =  foodToBodyRatio;
    }
}
