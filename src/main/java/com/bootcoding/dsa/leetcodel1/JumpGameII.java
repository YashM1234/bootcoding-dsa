package com.bootcoding.dsa.leetcodel1;
//Letcode Q-45 WAP for jump game II
public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2,3,0,1,4};
        //Method Calling
        int minJump = jump(nums);
        System.out.println(minJump);
    }

    //Method Definition
    public static int jump(int[] nums) {
        int size = nums.length - 1;
        int jumpCount = 0;
        int maxJump = 0;
        int preJump = 0;
        for(int i = 0; i < size; i++){
            maxJump = Math.max(maxJump, i + nums[i]);
            if(i == preJump){
                preJump = maxJump;
                ++jumpCount;
                if(maxJump == size){
                    break;
                }
            }
        }
        return jumpCount;
    }
}
