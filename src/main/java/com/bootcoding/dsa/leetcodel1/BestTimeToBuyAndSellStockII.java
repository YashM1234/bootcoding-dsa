package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-122 WAP to Find Best Time TO Buy And Sell Stock II
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of
the stock at any time. However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.
 */
public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
         int[] prices = {7,1,5,3,6,4};
         //Method Calling
        int result = maxProfit(prices);
        System.out.println(result);
    }

   //Method Definition
   public static int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
   }
}
