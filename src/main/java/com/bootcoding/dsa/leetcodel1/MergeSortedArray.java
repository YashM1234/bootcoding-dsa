package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-88 WAP to merge a sorted array
nums1.length == m + n, nums1 contain m element
nums2.length == n , nums2 contain n element
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        //Method Calling
        int[] mArr = merge(nums1, 3, nums2, 3);
        for(int element : mArr){
            System.out.println(element);
        }
    }

    //Method Definition
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;
    }
}
