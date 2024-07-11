package com.bootcoding.dsa.leetcodel1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Leetcode Q-120 WAP for triangle
Given a triangle array, return the minimum path sum from top to bottom.
For each step, you may move to an adjacent number of the row below.
More formally, if you are on index i on the current row, you may move to
either index i or index i + 1 on the next row.
 */
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(0, Collections.singletonList(2));
        triangle.add(1, Arrays.asList(3, 4));
        triangle.add(2, Arrays.asList(6, 5, 7));
        triangle.add(3, Arrays.asList(4, 1, 8, 3));
        //Method Calling
        int minPathSum = minimumTotal(triangle);
        System.out.println(minPathSum);
    }

    //Method Definition
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) {
            return 0;
        }
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }

        int triangleSize = triangle.size();
        int[] array = new int[triangleSize + 1];

        for(int i = triangleSize-1; i >= 0; i--) {
            minFinder(triangle.get(i), array);
        }

        return array[0];
    }
    //Method Definition
    private static void minFinder(List<Integer> list, int[] array) {
        for(int j = 0; j < list.size(); j++) {
            array[j] = list.get(j) + Math.min(array[j], array[j + 1]);
        }
    }
}
