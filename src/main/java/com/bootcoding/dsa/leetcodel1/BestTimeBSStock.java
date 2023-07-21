package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-121 WAP to find best time to buy and sell stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a
different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any
profit, return 0.
 */
public class BestTimeBSStock {
    public static void main(String[] args) {
        int[] prices = {7,6,5,4,3,2,1};
        //Method Calling
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    //Method Definition
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        for (int price : prices) {
            if(buy > price){
                buy = price;
            }
            sell = Math.max(sell, price - buy);
        }
        return sell;
    }
}
