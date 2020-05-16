package com.stormnet.homework.homework6.Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cashbox {

    private Queue<Buyer> turnCashbox = new LinkedList<>();

    void addBuyerToQuery(Buyer buyer) {
        turnCashbox.add(buyer);
    }

    void calculatePrice(Buyer buyer) {
        ArrayList<T2_Product> shoppingList;
        buyer = turnCashbox.peek();

        double sum = 0;

        shoppingList = buyer.getShoppingList();

        for (T2_Product product : shoppingList) {

            sum += product.getPrice();
        }
        System.out.println("Сумма товаров равна: " + sum + "\nПокупатель рассчитан!");
    }

    void deleteToQuery(Buyer buyer) {
        turnCashbox.remove(buyer);
    }
}