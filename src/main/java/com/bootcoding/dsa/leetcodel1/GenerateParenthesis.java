package com.bootcoding.dsa.leetcodel1;
import java.util.LinkedList;
import java.util.List;
//Leetcode Q-22 WAP to generate all combination of well-formed parenthesis
public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        GenerateParenthesisSolution generateParenthesisSolution = new GenerateParenthesisSolution();
        List<String> combination = generateParenthesisSolution.generateParenthesis(n);
        for(String s: combination){
            System.out.println(s);
        }
    }
}

//With StringBuilder
class GenerateParenthesisSolution {
    public List<String> generateParenthesis(int n) {
        List<String> pCombination = new LinkedList<>();
        StringBuilder generateP = new StringBuilder();
        gParenthesis(n, 0, 0, generateP, pCombination);

        return pCombination;
    }

    private void gParenthesis(int n, int left, int right, StringBuilder generateP, List<String> pCombination){
        if(generateP.length() == n * 2){
            pCombination.add(String.valueOf(generateP));
            return;
        }

        if(left < n){
            gParenthesis(n, left + 1, right, generateP.append("("), pCombination);
        }

        generateP.delete((left+right), generateP.length());

        if(left > right){
            gParenthesis(n, left , right + 1, generateP.append(")"), pCombination);
        }

        generateP.delete((left+right), generateP.length());
    }
}

    //OR

//With String
//class GenerateParenthesisSolution {
//    public List<String> generateParenthesis(int n) {
//        List<String> pCombination = new LinkedList<>();
//        gParenthesis(n, 0, 0, "", pCombination);
//
//        return pCombination;
//    }
//
//    private void gParenthesis(int n, int left, int right, String generateP, List<String> pCombination){
//        if(generateP.length() == n * 2){
//            pCombination.add(generateP);
//            return;
//        }
//
//        if(left < n){
//            gParenthesis(n, left + 1, right, generateP + "(", pCombination);
//        }
//        if(left > right){
//            gParenthesis(n, left , right + 1, generateP + ")", pCombination);
//        }
//    }
//}