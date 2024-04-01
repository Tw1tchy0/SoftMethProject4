package com.example.testproject4;

import java.text.DecimalFormat;

/**
 The DonutHole Class creates a DonutHole object.
 @author Aviv Bitton
 */
public class DonutHole extends Donut{

    private static final double DONUT_HOLE_PRICE = 0.39;
    private static final String DONUT_HOLE = "Donut Hole";
    public static final String[] DONUT_HOLE_FLAVORS ={"Glazed", "Jelly", "Cinnamon"};
    private double price;

    /**
     * Basic constructor to create a DonutHole Object
     */
    public DonutHole(){
        price = 0;
    }

    /**
     * Method to return a formatted string of the DonutHole object.
     * @return formated string
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        String priceStr = ("$" + df.format(returnPrice()));
        return  (int)super.returnPrice() + "x "+ DONUT_HOLE + " " + super.toString() + " " + priceStr;
    }

    /**
     * Method to update the price of the Donut based on quantity of Donuts.
     */
    public void itemPrice(){
        price = super.returnPrice() * DONUT_HOLE_PRICE;
    }

    /**
     * Method to return the price of the DonutHoleDonut object.
     * @return a double called price holding the price of the Donut object.
     */
    public double returnPrice(){
        itemPrice();
        return price;
    }
}
