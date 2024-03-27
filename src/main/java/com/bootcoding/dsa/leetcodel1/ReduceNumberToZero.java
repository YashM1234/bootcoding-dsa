package com.bootcoding.dsa.leetcodel1;
// Leetcode Q-1342. WAP to find number of steps to reduce a number to zero
public class ReduceNumberToZero {
    public static void main(String[] args) {
        //Take single input from user
        String value = args[0];
        int num = Integer.parseInt(value);

        //Method calling
        int totalSteps = numberOfSteps(num);
        System.out.println(totalSteps);
    }
        public static int numberOfSteps(int num) {
            int steps = 0;
                //if num is zero return steps without executing while loop
                //if num is greater then zero
                while (num != 0) {
                    //if number is even divide it by 2
                    if (num % 2 == 0) {
                        num = num / 2;
                    }
                    //if number is odd subtract it by 1
                    else {
                        num--;
                    }
                    //count steps in each iteration
                    steps++;
                }
            //return steps
            return steps;
        }
}
