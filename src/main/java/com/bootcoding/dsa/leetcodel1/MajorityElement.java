package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-169 WAP to find majority element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 4, 4, 4, 5, 4, 4};
        //Method Calling
        int result = majorityElement(nums);
        System.out.println(result);
    }

    //Method Definition
    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int num : nums){
            if(count == 0 && element !=num){
                element = num;
                count++;
            }else if(element == num){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}
