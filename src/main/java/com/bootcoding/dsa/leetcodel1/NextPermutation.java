package com.bootcoding.dsa.leetcodel1;
import java.util.Arrays;
//Leetcode Q-31 WAP to find the next permutation
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        NextPermutationSolution nextPermutationSolution = new NextPermutationSolution();
        nextPermutationSolution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}

//class containing all logic to find next permutation
class NextPermutationSolution {
    public void nextPermutation(int[] nums) {
        int x = -1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                x = i;
                break;
            }
        }
        if(x == -1){
            reverse(nums, 0);
        }
        else{
            int index = -1;
            for(int i = nums.length - 1; i >= (x + 1); i--){
                if(nums[i] > nums[x]){
                    index = i;
                    break;
                }
            }
            swap(nums, x, index);
            reverse(nums, x + 1);
        }
    }

    private void swap(int[] nums, int first, int next){
        int temp = nums[first];
        nums[first] = nums[next];
        nums[next] = temp;
    }

    private void reverse(int[] nums, int start){
        int end = nums.length - 1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}