package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-2011 WAP to find final value of variable after performing increment/decrement operations
public class FIndValueAfterOperations {
    public static void main(String[] args) {
         //Declaring and initialising string array
         String[] str = {"--X", "++X", "X++", "X--", "++X"};
         //Method calling
         int result = finalValueAfterOperations(str);
         System.out.println(result);
    }
    //Method definition
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                x = x + 1;
            }
            else if(operations[i].equals("X--") || operations[i].equals("--X")){
                x = x - 1;
            }
        }
        return x;
    }
}
