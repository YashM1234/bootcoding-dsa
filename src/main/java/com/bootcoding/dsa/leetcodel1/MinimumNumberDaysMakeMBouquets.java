package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-1482 WAP for minimum number of days to make m bouquets
You are given an integer array bloomDay, an integer m and an integer k.
You want to make m bouquets. To make a bouquet, you need to use k adjacent
flowers from the garden.
The garden consists of n flowers, the ith flower will bloom in the bloomDay[i]
and then can be used in exactly one bouquet.
Return the minimum number of days you need to wait to be able to make m bouquets
from the garden. If it is impossible to make m bouquets return -1.
 */
public class MinimumNumberDaysMakeMBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;

        //Method Calling
        int minDays = minDays(bloomDay, m, k);
        System.out.println(minDays);
    }

    //Method Definition
    public static int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < ((long)m * k)){
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : bloomDay){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        while(min < max){
            int mid = (max + min) / 2;
            int bouq = getBouquets(bloomDay, mid, k);

            if(bouq < m){
                min = mid + 1;
            }else{
                max = mid;
            }
        }
        return min;
    }

    private static int getBouquets(int[] bloomDay, int mid, int k){
        int bouquets = 0;
        int fCollection = 0;
        for(int i : bloomDay){
            if(i > mid){
                fCollection = 0;
            }
            else if(++fCollection >= k){
                bouquets++;
                fCollection = 0;
            }
        }
        return bouquets;
    }
}
