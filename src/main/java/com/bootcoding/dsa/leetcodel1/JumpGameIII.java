package com.bootcoding.dsa.leetcodel1;
import java.util.LinkedList;
import java.util.List;
//Leetcode Q-1306 WAP for Jump Game III
public class JumpGameIII {
    public static void main(String[] args) {
        int[] arr = {4,2,3,0,3,1,2};
        int start = 5;
        //Method Calling
        boolean result = canReach(arr, start);
        System.out.println(result);
    }

    //Method Definition
    public static boolean canReach(int[] arr, int start) {
        List<Integer> visited = new LinkedList<>();
        return reachCheck(arr, start, visited);
    }

    private static boolean reachCheck(int[] arr, int start, List<Integer> visited){
        if(arr[0] == 0 || arr[arr.length-1] == 0){
            return true;
        }
        if(start < 0 || start >= arr.length || visited.contains(start)){
            return false;
        }
        if(arr[start] == 0){
            return true;
        }

        visited.add(start);
        boolean right = reachCheck(arr, start + arr[start], visited);
        boolean left = reachCheck(arr, start - arr[start], visited);

        return right || left;
    }

    //OR

//    public static boolean canReach(int[] arr, int start) {
//        boolean[] visited = new boolean[arr.length];
//        return reachCheck(arr, start, visited);
//    }
//    private static boolean reachCheck(int[] arr, int start, boolean[] visited){
//            if(start < 0 || start >= arr.length){
//            return false;
//        }
//        if(arr[start] == 0){
//            return true;
//        }
//        if(visited[start]){
//            return false;
//        }
//        visited[start] = true;
//        boolean right = reachCheck(arr, start + arr[start], visited);
//        boolean left = reachCheck(arr, start - arr[start], visited);
//        visited[start] = false;
//
//        return right || left;
//    }
}
