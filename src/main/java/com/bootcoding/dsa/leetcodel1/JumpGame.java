package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-55 WAP for Jump Game
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        //Method Calling
        boolean result = canJump(nums);
        System.out.println(result);
    }

    //Method Definition
    public static boolean canJump(int[] nums) {
        int size = nums.length - 1;
        int maxJump = 0;
        for(int i = 0; i <= size; i++){
            if(i > maxJump){
                return false;
            }
            maxJump = (maxJump > i + nums[i])? maxJump : i + nums[i];
        }
        return true;
    }
    //OR

//    public static boolean canJump(int[] nums) {
//        int maxJump = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(i > maxJump){
//                return false;
//            }
//
//            maxJump = Math.max(maxJump, i + nums[i]);
//
//            if(i + nums[i] == nums.length-1){
//                break;
//            }
//        }
//        return true;
//    }
}
