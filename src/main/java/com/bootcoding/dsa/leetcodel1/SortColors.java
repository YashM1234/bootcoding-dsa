package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
/* Leetcode Q-75 WAP to sort colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects
of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
 */
public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        //Method Calling
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    //Method Definition
//    public static void sortColors(int[] nums) {
//        int size = nums.length;
//        for(int i = 0; i < (size-1); i++){
//            //take starting as swapping not occur
//            boolean isSwap = false;
//            for (int j = 0; j < (size-i-1); j++){
//                if(nums[j] > nums[j+1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                    //if swapping occur isSwap set to true
//                    isSwap = true;
//                }
//            }
//            //check if swapping occur or not, if swapping not occur break else continue
//            if(!isSwap) break;
//        }
//    }

    //OR

    public static void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while(mid <= end){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                start++;
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
}
