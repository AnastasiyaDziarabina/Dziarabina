package com.stormnet.homework.homework6.Task2;

import java.util.ArrayList;

public class Buyer {

    private ArrayList<Product> shoppingList = new ArrayList<>();

    public ArrayList<Product> getShoppingList() {
        return shoppingList;
    }

    public Buyer(ArrayList<Product> shoppingList) {
        this.shoppingList = shoppingList;
    }
    public Buyer() {
        this.shoppingList = shoppingList;
    }

}