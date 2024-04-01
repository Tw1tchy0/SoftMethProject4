package com.example.testproject4;

import java.text.DecimalFormat;

/**
 The CakeDonut Class creates a CakeDonut object.
 @author Aviv Bitton
 */
public class CakeDonut extends Donut {
    private static final double CAKE_DONUT_PRICE = 1.89;
    private static final String CAKE_DONUT = "Cake Donut";
    public static final String[] CAKE_FLAVORS = {"Strawberry", "Blueberry", "Cinnamon", "Chocolate"};
    private double price;

    /**
     * Basic constructor that creates a CakeDonut Object
     */
    public CakeDonut(){
        price = 0;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        String priceStr = ("$" + df.format(returnPrice()));
        return  (int)super.returnPrice() + "x "+ CAKE_DONUT + " " + super.toString() + " " + priceStr;
    }

    public void itemPrice(){
        price = super.returnPrice() * CAKE_DONUT_PRICE;
    }

    public double returnPrice(){
        itemPrice();
        return price;
    }
}
