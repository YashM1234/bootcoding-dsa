package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Leetcode Q-71 WAP to Simplify Path
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'.
Your task is to transform this absolute path into its simplified canonical path.
The rules of a Unix-style file system are as follows:
A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name.
For example, '...' and '....' are valid directory or file names.
The simplified canonical path should follow these rules:
The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
Return the simplified canonical path.
 */
public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        //Method Calling
        String result = simplifyPath(path);
        System.out.println(result);
    }

    //Method Definition
    public static String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for(String part: parts){
            if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(!part.isEmpty() && !part.equals(".")){
                stack.push(part);
            }
        }

        StringBuilder result  = new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0, "/" + stack.pop());
        }

        return result.length() == 0 ? "/": result.toString();
    }
}
