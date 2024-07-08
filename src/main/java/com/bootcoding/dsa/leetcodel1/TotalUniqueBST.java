package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-96 WAP to find total number of unique binary search trees
public class TotalUniqueBST {
    public static void main(String[] args) {
        int n = 3;
        //Method Calling
        int totalUniqueBST = numTrees(n);
        System.out.println(totalUniqueBST);
    }

    //Method Definition
    public static int numTrees(int n) {
        if(n <= 2){
            return n;
        }
        int[] bstArr = new int[n + 1];
        return uniqueBST(n, bstArr);
    }
    private static int uniqueBST(int n, int[] bstArr){
        if(n <= 1){
            return 1;
        }
        if(bstArr[n] > 0){
            return bstArr[n];
        }
        for(int i = 1; i <= n; i++){
            bstArr[n] = bstArr[n] + (uniqueBST(i - 1, bstArr) * uniqueBST(n - i, bstArr));
        }
        return bstArr[n];
    }
}
