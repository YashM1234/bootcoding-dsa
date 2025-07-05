package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-722 WAP to remove Comments
Given a C++ program, remove comments from it. The program source is an array of strings source where source[i] is
the ith line of the source code. This represents the result of splitting the original source code string by
the newline character '\n'.
 */
public class RemoveComments {
    public static void main(String[] args) {
        String[] source = {"/*Test program */", "int main()", "{ ",
                "  // variable declaration ", "int a, b, c;",
                "/* This is a test", "   multiline  ",
                "   comment for ", "   testing */", "a = b + c;", "}"};

        //Method calling
        List<String> result = removeComments(source);
        System.out.println(result);
    }

    //Method Definition
    public static List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        boolean inBlock = false;
        StringBuilder newline = new StringBuilder();

        for(String line: source){
            int i = 0;
            char[] chars = line.toCharArray();

            if(!inBlock) newline = new StringBuilder();

            while(i < chars.length) {
                if (!inBlock && i + 1 < chars.length && chars[ i ] == '/' && chars[ i + 1 ] == '*') {
                    inBlock = true;
                    i += 2;
                } else if (inBlock && i + 1 < chars.length && chars[ i ] == '*' && chars[ i + 1 ] == '/') {
                    inBlock = false;
                    i += 2;
                } else if (!inBlock && i + 1 < chars.length && chars[ i ] == '/' && chars[ i + 1 ] == '/') {
                    break;
                } else if (!inBlock) {
                    newline.append(chars[ i ]);
                    i++;
                } else {
                    i++;
                }
            }

            if(!inBlock && newline.length() > 0){
                result.add(newline.toString());
            }
        }

       return result;
    }

}
