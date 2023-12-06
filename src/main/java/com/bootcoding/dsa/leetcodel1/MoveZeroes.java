package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-283. WAP to move zeroes to the end of array while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {0, 1, 3, 0, 19, 0};
        //Method Calling
        moveZeroes(nums);
    }
    //Method definition
    public static void moveZeroes(int[] nums) {
        //Move a non-zero element at the left of array
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        //Fill remaining location with value 0
        for(int i = index; i < nums.length; i++ ){
            nums[i] = 0;
        }
        //Print output with zeroes at the end of array using for-each loop
        for (int result: nums){
            System.out.print(result + " ");
        }
    }
}
