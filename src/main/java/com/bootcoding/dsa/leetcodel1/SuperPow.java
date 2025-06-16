package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-372 WAP to Find Super Pow
Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer
given in the form of an array.
 */
public class SuperPow {
    private static final int MOD = 1337;

    public static void main(String[] args) {
        int a = 2;
        int[] b = {4,3,3,8,5,2};
        //Method Calling
        int result = superPow(a, b);
        System.out.println(result);
    }

    //Method Definition
    public static int superPow(int a, int[] b) {
        return helper(a, b, b.length - 1);
    }

    private static int helper(int a, int[] b, int index){
        if(index < 0) return 1;

        int part1 = modPow(helper(a, b, index - 1), 10);
        int part2 = modPow(a, b[index]);
        return (part1 * part2) % MOD;
    }

    private static int modPow(int x, int n){
        int result = 1;
        x %= MOD;
        while(n > 0){
            if((n % 2) == 1){
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            n /= 2;
        }
        return result;
    }
}
