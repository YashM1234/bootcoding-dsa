package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-258 WAP to add digits until the result has only one digit
public class AddDigits {
    public static void main(String[] args) {
        int num = 39;
        //Method Calling
        int result = addDigits(num);
        System.out.println(result);
    }

    //Method Definition
//    public static int addDigits(int num) {
//        if(num == 0){
//            return 0;
//        }
//        return 1 + ((num - 1) % 9);
//    }

    // using recursion

    public static int addDigits(int num) {
        if(num % 10 == num){
            return num;
        }else{
            return addDigits(add(num));
        }
    }
    public static int add(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}
