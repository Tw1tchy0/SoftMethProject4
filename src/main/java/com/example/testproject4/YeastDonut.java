package com.example.testproject4;

import java.text.DecimalFormat;

/**
 The YeastDonut Class creates a YeastDonut object.
 @author Aviv Bitton
 */
public class YeastDonut extends Donut {

    private static final double YEAST_DONUT_PRICE = 1.79;
    private static final String YEAST_DONUT = "Yeast Donut";
    public static final String[] YEAST_FLAVORS = {"Jelly", "Glazed", "Chocolate Frosted", "Strawberry Frosted",
            "Sugar", "Vanilla Frosted"};
    private double price = 0;

    /**
     * Basic constructor for YeastDonut object
     */
    public YeastDonut() {
        price = 0;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String priceStr = ("$" + df.format(returnPrice()));
        return (int) super.returnPrice() + "x " + YEAST_DONUT + " " + super.toString() + " " + priceStr;
    }

    public void itemPrice() {
        price = super.returnPrice() * YEAST_DONUT_PRICE;
    }
}