package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-349 WAP to find intersection of two arrays
public class TwoArrIntersection {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums1 = {1,2, 2, 1};
        int[] nums2 = {2, 2};
        //Method Calling
        int[] result = intersection(nums1, nums2);
        for(int x : result){
            System.out.println(x);
        }
    }

    //Method definition
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        int count = 0;
        for (int k : nums1) {
            temp[k] = 1;
        }
        for (int k : nums2) {
            if (temp[k] == 1) {
                temp[k] = 2;
                count++;
            }
        }
        int[] result = new int[count];
        for(int i = 0, j = 0; i < temp.length && j < count; i++) {
            if(temp[i] == 2) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}
