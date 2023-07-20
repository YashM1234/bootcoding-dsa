package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-1470 WAP for shuffle the array
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
public class ArrayShuffle {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {1, 1, 2, 2};
        int n = nums.length/2;
        //Method Calling
        int[] result = shuffle(nums, n);
        for(int x : result){
            System.out.println(x);
        }
    }

    //Method definition
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i = 0, j = 0; i < nums.length/2; i++){
            arr[j++] = nums[i];
            arr[j++] = nums[n++];
        }
//        System.gc(); //beat 100% Memory in Leetcode
        return arr;
    }
}
