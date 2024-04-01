package com.example.testproject4;/*
package cafe;

import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

*/
/**
 The Coffee Class create Coffee Object and provides method for said object.
 @author Aviv Bitton
 *//*

public class Coffee extends MenuItem {
    private String cupSize;
    private ArrayList<String> extras;
    private int quantity;

    private static final double SHORT_PRICE = 1.99;
    private static final double TALL_PRICE = 2.49;
    private static final double GRANDE_PRICE = 2.99;
    private static final double VENTI_PRICE = 3.49;
    private static final double EXTRA = 0.30;

    // Constructor
    public Coffee(String cupSize, ArrayList<String> extras, int quantity) {
        this.cupSize = cupSize;
        this.extras = extras;
        this.quantity = quantity;
    }

    // Override price() method to calculate the price of the coffee
    @Override
    public double price() {
        double basePrice = calculateBasePrice();
        double extrasPrice = calculateExtrasPrice();
        return (basePrice + extrasPrice) * quantity;
    }

    // Helper method to calculate base price based on cup size
    private double calculateBasePrice() {
        switch (cupSize) {
            case "Short":
                return SHORT_PRICE;
            case "Tall":
                return TALL_PRICE;
            case "Grande":
                return GRANDE_PRICE;
            case "Venti":
                return VENTI_PRICE;
            default:
                return 0.0; // Invalid cup size
        }
    }

    // Helper method to calculate additional price for add-ins
    private double calculateExtrasPrice() {
        return extras.size() * EXTRA;
    }

    // Method to add an extra to the coffee
    public void addExtra(String extra) {
        extras.add(extra);
    }

    // Method to remove an extra from the coffee
    public void removeExtra(String extra) {
        extras.remove(extra);
    }

    // Getters and setters (removed for brevity)

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String priceStr = "$" + df.format(price());
        return quantity + "x " + cupSize + " Coffee " + extras.toString() + " " + priceStr;
    }
}*/
