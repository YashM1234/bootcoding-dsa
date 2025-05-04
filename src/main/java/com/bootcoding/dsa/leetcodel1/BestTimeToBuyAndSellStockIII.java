package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-123 WAP to Find Best Time To Buy And Sell Stock III
You are given an array prices where prices[i] is the price of a given stock on the ith day.
Find the maximum profit you can achieve. You may complete at most two transactions.
Note: You may not engage in multiple transactions simultaneously
(i.e., you must sell the stock before you buy again).

 */
public class BestTimeToBuyAndSellStockIII {
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        //Method Calling
        int result = maxProfit(prices);
        System.out.println(result);
    }

    //Method Definition
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;

        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for(int price: prices){
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }

        return sell2;
    }
}
