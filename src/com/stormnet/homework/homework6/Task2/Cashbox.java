package com.stormnet.homework.homework6.Task2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Cashbox {

    private PriorityQueue<Buyer> turnCashbox = new PriorityQueue<>();

    void addBuyerToQuery(Buyer buyer) {
        turnCashbox.add(buyer);
    }
    void calculatePrice(Buyer buyer) {

        ArrayList<T2_Product> shoppingList;
        buyer = turnCashbox.peek();

        double sum = 0;

        for (T2_Product product : buyer.getShoppingList()) {

            sum += product.getPrice();
        }
        System.out.println("Сумма товаров равна: " + sum + "\nПокупатель рассчитан!");
    }
    void deleteToQuery(Buyer buyer) {
        turnCashbox.remove(buyer);
    }
}