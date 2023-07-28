package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-2520 WAP to count the digits that divide a number
public class CountDigitsThatDivNum {
    public static void main(String[] args) {
        int num = 121;
        //Method Calling
        int total = countDigits(num);
        System.out.println(total);
    }

    //Method Definition
    public static int countDigits(int num) {
            int tempNum = num;
            int count = 0;
            while(tempNum > 0){
                int eachDigit = tempNum % 10;
                tempNum = tempNum/10;
                if(num % eachDigit == 0){
                    count++;
                }
            }
        return count;
    }

}
