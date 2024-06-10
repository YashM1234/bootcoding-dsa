package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-69 WAP to find Sqrt(x) i.e Square Root of X and return round up value
public class SquareRootOfX {
    public static void main(String[] args) {
        int x = 5;
        //Method Calling
        double squareRoot = mySqrt(x);
        System.out.println(squareRoot);
    }

    //Method Definition
    public static int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int low = 1;
        int high = x;
        int sqrt = 0;

        while(low <= high){
            int mid = (low + high)/2;
            if(x/mid == mid){
                return mid;
            }
            else if(x/mid < mid){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                sqrt = mid;
            }
        }
        return sqrt;
    }
}
