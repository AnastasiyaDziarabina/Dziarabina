package com.stormnet.homework.homework6.Task2;

import java.util.ArrayList;

public class Buyer implements Comparable<Buyer>{

    private ArrayList<T2_Product> shoppingList = new ArrayList<>();

    public ArrayList<T2_Product> getShoppingList() {
        return shoppingList;
    }

    public Buyer(ArrayList<T2_Product> shoppingList) {
        this.shoppingList = shoppingList;
    }
    public Buyer() {
        this.shoppingList = shoppingList;
    }

    @Override
    public int compareTo(Buyer buyer) {
        return 0;
    }
}