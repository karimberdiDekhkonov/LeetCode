package org.example.easy.dynamicProgramming;

//14.04.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/
//OUR APPROACH IS FINDING THE MIN NUMBER AND MAX NUMBER THAT COMES AFTER IT.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int piisn = 0; //price if I sell now
        int tp = 0; //total profit

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            piisn = prices[i] - minPrice;

            if(piisn > tp){
                tp = piisn;
            }
        }

        return tp;
    }
}
