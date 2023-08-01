package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-1089 WAP to duplicate each occurrence of zero, shifting the remaining elements to the right.
public class DuplicateZeros {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        //Method calling
        duplicateZeros(arr);
        for (int x : arr){
            System.out.println(x);
        }
    }

    //Method Definition
    public static void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int n  = arr.length;
                for(int j = i+1; j < arr.length; j++){
                    arr[--n] = arr[n-1];
                }
                i++;
            }
        }
    }
}
