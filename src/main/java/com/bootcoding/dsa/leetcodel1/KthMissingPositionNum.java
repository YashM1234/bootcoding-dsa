package com.bootcoding.dsa.leetcodel1;
//Leetcode Q 1539. WAP to find kth missing position number
public class KthMissingPositionNum {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] arr = {1, 2, 3, 4};
        int k = 2;

        //Method Calling
        int result = findKthPositive(arr, k);
        System.out.println(result);
    }

    //Method definition
    public static int findKthPositive(int[] arr, int k) {
        int[] newArr = new int[k+1];
        for(int i = 0, j = 1, x = 0, y = 0; i < arr[arr.length-1] && y < newArr.length; i++){
            if(j == arr[x]){
                x++;
            }
            else{
                newArr[y] = j;
                y++;
            }
            j++;
        }
        if(newArr[k-1] == 0){
            return arr.length + k;
        }
        return newArr[k-1];
    }
}
