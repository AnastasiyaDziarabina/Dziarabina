package com.stormnet.homework.homework6.Task2;

import java.util.ArrayList;


    public class Task2_Test {
    public static void main(String[] args) {
        ArrayList<Product> shoppingList1 = new ArrayList<>();
        Cashbox cashbox = new Cashbox();
        Buyer buyer = new Buyer(shoppingList1);

        shoppingList1.add(new Product("мясо", 15));
        shoppingList1.add(new Product("макароны", 15));

        cashbox.addBuyerToQuery(buyer);
        cashbox.calculatePrice(buyer);

        cashbox.deleteToQuery(buyer);
    }
}