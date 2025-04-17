package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3516 WAP to Find Closest Person
You are given three integers x, y, and z, representing the positions of three people on a number line:
x is the position of Person 1.
y is the position of Person 2.
z is the position of Person 3, who does not move.
Both Person 1 and Person 2 move toward Person 3 at the same speed.
Determine which person reaches Person 3 first:
Return 1 if Person 1 arrives first.
Return 2 if Person 2 arrives first.
Return 0 if both arrive at the same time.
Return the result accordingly.
 */
public class FindClosestPerson {
    public static void main(String[] args) {
        int x = 2;
        int y = 7;
        int z = 4;

        //Method Calling
        int result = findClosest(x, y, z);
        System.out.println(result);
    }

    //Method Definition
    public static int findClosest(int x, int y, int z) {
        if(Math.abs(z - x) == Math.abs(z - y)) return 0;
        return Math.abs(z - x) < Math.abs(z - y) ? 1 : 2 ;
    }
}
