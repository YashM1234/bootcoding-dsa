package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Leetcode Q-591 WAP for Tag Validator
Given a string representing a code snippet, implement a tag validator to parse the code and return whether it is valid.
A code snippet is valid if all the following rules hold:
The code must be wrapped in a valid closed tag. Otherwise, the code is invalid.
A closed tag (not necessarily valid) has exactly the following format : <TAG_NAME>TAG_CONTENT</TAG_NAME>. Among them,
<TAG_NAME> is the start tag, and </TAG_NAME> is the end tag. The TAG_NAME in start and end tags should be the same.
A closed tag is valid if and only if the TAG_NAME and TAG_CONTENT are valid.
A valid TAG_NAME only contain upper-case letters, and has length in range [1,9]. Otherwise, the TAG_NAME is invalid.
A valid TAG_CONTENT may contain other valid closed tags, cdata and any characters (see note1) EXCEPT unmatched <,
unmatched start and end tag, and unmatched or closed tags with invalid TAG_NAME. Otherwise, the TAG_CONTENT is invalid.
A start tag is unmatched if no end tag exists with the same TAG_NAME, and vice versa. However, you also need to consider
the issue of unbalanced when tags are nested.
A < is unmatched if you cannot find a subsequent >. And when you find a < or </, all the subsequent characters until
the next > should be parsed as TAG_NAME (not necessarily valid).
The cdata has the following format : <![CDATA[CDATA_CONTENT]]>. The range of CDATA_CONTENT is defined as the characters
between <![CDATA[ and the first subsequent ]]>.
CDATA_CONTENT may contain any characters. The function of cdata is to forbid the validator to parse CDATA_CONTENT,
so even it has some characters that can be parsed as tag (no matter valid or invalid), you should treat it as regular
characters.
 */
public class TagValidator {
    public static void main(String[] args) {
        String code = "<DIV>This is the first line <![CDATA[<div>]]></DIV>";
        //Method Calling
        boolean result = isValid(code);
        System.out.println(result);
    }
    //Method Definition
    public static boolean isValid(String code) {
        Deque<String> stack = new ArrayDeque<>();
        int i = 0;
        int n = code.length();

        while(i < n){
            if(code.startsWith("<![CDATA[", i)){
                if(stack.isEmpty()) return false;
                int j = code.indexOf("]]>", i);
                if(j < 0) return false;
                i = j + 3;
            }else if(code.startsWith("</", i)){
                int j = code.indexOf(">", i);
                if(j < 0) return false;
                String tag = code.substring(i + 2, j);
                if(!isValidTagName(tag)) return false;
                if(stack.isEmpty() || !stack.pop().equals(tag)) return false;
                i = j + 1;
                if(stack.isEmpty() && i < code.length()) return false;
            }else if(code.startsWith("<", i)){
                int j = code.indexOf(">", i);
                if(j < 0) return false;
                String tag = code.substring(i + 1, j);
                if(!isValidTagName(tag)) return false;
                stack.push(tag);
                i = j + 1;
            }else{
                if(stack.isEmpty()) return false;
                i++;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isValidTagName(String tag){
        if(tag.length() < 1 || tag.length() > 9) return false;
        for(char c: tag.toCharArray()){
            if(c < 'A' || c > 'Z') return false;
        }
        return true;
    }
}
