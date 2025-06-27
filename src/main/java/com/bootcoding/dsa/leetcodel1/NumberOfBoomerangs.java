package com.bootcoding.dsa.leetcodel1;

import java.util.HashMap;
import java.util.Map;

/*
Leetcode Q-447 WAP to find Number of Boomerangs
You are given n points in the plane that are all distinct, where points[i] = [xi, yi]. A boomerang is a tuple
of points (i, j, k) such that the distance between i and j equals the distance between i and k
(the order of the tuple matters).
Return the number of boomerangs.
 */
public class NumberOfBoomerangs {
    public static void main(String[] args) {
        int[][] points = {{0,0},{1,0},{2,0}};
        //Method Calling
        int result = numberOfBoomerangs(points);
        System.out.println(result);
    }

    //Method Definition
    public static int numberOfBoomerangs(int[][] points) {
        int result = 0;

        for(int i = 0; i < points.length; i++){
            Map<Integer, Integer> map = new HashMap<>();

            for(int j = 0; j < points.length; j++){
                if(i == j) continue;

                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int dist = dx * dx + dy * dy;

                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }

            for(int count: map.values()){
                result += count * (count - 1);
            }
        }

        return result;
    }
}
