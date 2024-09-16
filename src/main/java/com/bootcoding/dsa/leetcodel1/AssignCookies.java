package com.bootcoding.dsa.leetcodel1;

import java.util.Arrays;

/*
Leetcode Q-455 WAP for Assign Cookies
Assume you are an awesome parent and want to give your children some cookies.
But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i,
and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
 */
public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};

        //Method Calling
        int output = findContentChildren(g, s);
        System.out.println(output);
    }

    //Method Definition
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;

        for(int cookieIndex = 0; cookieIndex < s.length && contentChildren < g.length; cookieIndex++){
            if(s[cookieIndex] >= g[contentChildren]){
                contentChildren++;
            }
        }
        return contentChildren;
    }
}
