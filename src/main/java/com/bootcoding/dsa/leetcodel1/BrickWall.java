package com.bootcoding.dsa.leetcodel1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Leetcode Q-554 WAP for Brick Wall
There is a rectangular brick wall in front of you with n rows of bricks. The ith row has some number of bricks
each of the same height (i.e., one unit) but they can be of different widths. The total width of each row is the same.
Draw a vertical line from the top to the bottom and cross the least bricks. If your line goes through the edge of a
brick, then the brick is not considered as crossed. You cannot draw a line just along one of the two vertical edges of
the wall, in which case the line will obviously cross no bricks.
Given the 2D array wall that contains the information about the wall, return the minimum number of crossed bricks
after drawing such a vertical line.
 */
public class BrickWall {
    public static void main(String[] args) {
        List<List<Integer>> wall = List.of(
                List.of(1,2,2,1),
                List.of(3,1,2),
                List.of(1,3,2),
                List.of(2,4),
                List.of(3,1,2),
                List.of(1,3,1,1)
        );

        //Method Calling
        int result = leastBricks(wall);
        System.out.println(result);
    }

    //Method Definition
    public static int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for(List<Integer> row: wall){
            int pos = 0;
            for(int i = 0; i < row.size() - 1; i++){
                pos += row.get(i);
                map.put(pos, map.getOrDefault(pos, 0) + 1);
                max = Math.max(max, map.get(pos));
            }
        }

        return wall.size() - max;
    }
}
