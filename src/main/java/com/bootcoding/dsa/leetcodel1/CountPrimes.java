package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-204 WAP to Count Primes
Given an integer n, return the number of prime numbers that are strictly less than n.
 */
public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        //Method calling
        int result = countPrimes(n);
        System.out.println(result);
    }
    //Method Definition
    public static int countPrimes(int n) {
        if(n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i < n; i++){
            if(isPrime[i]){
                for(int j = i * i; j < n; j += i){
                    isPrime[j] = false;
                }
            }
        }

        int count  = 0;
        for(boolean prime: isPrime){
            if(prime) count++;
        }

        return count;
    }
}
