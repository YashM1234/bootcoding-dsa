package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-771. WAP for jewels and stones problem
/*
You're given strings jewels representing the types of stones that are jewels,
and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        //Declaring and initialising strings
        String jewels = "aA";
        String stones = "aAAbbbb";
        //Method calling
        int total = numJewelsInStones(jewels, stones);
        System.out.println(total);
    }
    //Method definition
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        //Converting string into character
        char[] newJewels = jewels.toCharArray();
        char[] newStones = stones.toCharArray();
        //Outer loop for newJewels
        for (char newJewel : newJewels) {
            //An inner loop for newStones
            for (char newStone : newStones) {
                //for every element of newJewels, all elements of newStones are compared
                if (newJewel == newStone) {
                    count++;
                }
            }
        }
        //Return count
        return count;
    }
}
