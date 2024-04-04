package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-27 WAP to remove element
Given an integer array nums and an integer val,
remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then
return the number of elements in nums which are not equal to val.
 */
public class RemoveElement {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        //Method Calling
        int k = removeElement(nums, val);
        System.out.println(k);
    }

    //Method definition
    public static int removeElement(int[] nums, int val) {
//        int count = 0;
//        int temp;
//        int j = 1;
//        for (int num : nums) {
//            if (num == val) {
//                count++;
//            }
//        }
//        for(int i = 0; i < nums.length-count; i++){
//            if(nums[i] == val){
//                temp = nums[i];
//                if(nums[nums.length-j] != val) {
//                    nums[i] = nums[nums.length - j];
//                    nums[nums.length - j] = temp;
//                }
//                else {
//                    i--;
//                }
//                j++;
//            }
//        }
//        return nums.length-count;
//    }
        //OR
        int count = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
        return count;
    }
}
