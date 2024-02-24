package org.example;

import org.example.easy.BestTimeToBuyAndSellStock1;
import org.example.easy.RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock1 stock = new BestTimeToBuyAndSellStock1();
        int input [] = {7,1,5,3,6,4};
        int service = stock.maxProfit(input);
        System.out.println(service);
    }
}