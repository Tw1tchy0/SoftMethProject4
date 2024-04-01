package com.example.testproject4;

/**
 The MenuItem Class holds the Donut and Coffee Object Classes.
 @author Aviv Bitton
 @author Helen Ma
 */
public abstract class MenuItem{

    private double price;
    private int quantity;

    /**
     * Method to return the price of the Object.
     * @return a double called price holding the price of the Object.
     */
    public abstract double returnPrice();

    /**
     * Method to return formatted String of the Object
     * @return formatted string
     */
    public abstract String toString();

    /**
     * Setter method for the quantity of the Object
     * @param quantity num of items being set
     */
    public abstract void setQuantity(int quantity);

    /**
     * Method to update the price of the MenuItems
     */
    abstract void itemPrice();

}
