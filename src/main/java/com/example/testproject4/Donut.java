package com.example.testproject4;

import java.util.ArrayList;
import java.util.Collections;

/**
 The Donut Abstract Class creates a Donut object template with methods to manipulate donut objs
 @author Aviv Bitton
 */
public abstract class Donut extends MenuItem{

    private int quantity;
    private ArrayList<String> flavors = new ArrayList<String>();

    public boolean add(Object object){
        if(object instanceof String){
            String newFlavor = (String) object;
            flavors.add(newFlavor);
            Collections.sort(flavors);
            return true;
        }
        return false;
    }

    public boolean remove(Object object){
        if(object instanceof String){
            String newFlavor = (String) object;
            if(!flavors.contains(newFlavor)) return false;
            flavors.remove(newFlavor);
            Collections.sort(flavors);
            return true;
        }
        return false;
    }

    public String toString(){
        return flavors.toString();
    }

    public double returnPrice(){
        return quantity;
    }

    public ArrayList<String> returnFlavors() {return flavors;}

    abstract void itemPrice();

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}