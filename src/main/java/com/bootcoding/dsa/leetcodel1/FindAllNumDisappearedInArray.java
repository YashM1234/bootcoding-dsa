package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
/*Leetcode Q-448 WAP to find all numbers disappeared in an array
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 */
public class FindAllNumDisappearedInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        //Method Calling
        List<Integer> list = findDisappearedNumbers(nums);
        for(int x : list){
            System.out.println(x);
        }
    }

    //Method Definition
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int index = nums.length + 1;
        int[] arr = new int[index];
        for(int num : nums){
            arr[num] = 1;
        }

        List<Integer> newList = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(arr[i] == 0){
                newList.add(i);
            }
        }
        return newList;
    }
}
