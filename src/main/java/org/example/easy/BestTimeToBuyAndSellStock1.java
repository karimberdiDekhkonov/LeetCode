package org.example.easy;
//24.02.2024
//OF COURSE WE NEED A LOOP TO SOLVE THIS PROBLEM. LOGIC IS IF NUMS[I] IS LESS THEN NUMS[I+1] WE GOT A PROFIT AND WE WILL ADD IT TO OUR TOTAL PROFIT.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
public class BestTimeToBuyAndSellStock1 {
    public int maxProfit(int[] prices){
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) profit+=prices[i] - prices[i-1];
        }
        return profit;
    }
}
