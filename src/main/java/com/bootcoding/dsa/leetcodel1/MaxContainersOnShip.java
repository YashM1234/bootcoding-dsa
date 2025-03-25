package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3492 WAP to find Maximum Containers on a ship
You are given a positive integer n representing an n x n cargo deck on a ship.
Each cell on the deck can hold one container with a weight of exactly w.
However, the total weight of all containers, if loaded onto the deck,
must not exceed the ship's maximum weight capacity, maxWeight.
Return the maximum number of containers that can be loaded onto the ship.
*/
public class MaxContainersOnShip {
    public static void main(String[] args) {
        int n = 2;
        int w = 3;
        int maxWeight = 15;

        //Method Calling
        int result = maxContainers(n, w, maxWeight);
        System.out.println(result);
    }

    //Method Definition
    public static int maxContainers(int n, int w, int maxWeight) {
//        int maxPossibleContainers  = maxWeight/w;
//        int totalSlots = n * n;
//        while (maxPossibleContainers  > totalSlots && maxWeight <= maxPossibleContainers  * w){
//            maxPossibleContainers --;
//        }
//        return maxPossibleContainers ;

        // OR

        return Math.min(n * n, maxWeight / w);
    }
}
