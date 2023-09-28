package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
/* Leetcode Q-77 WAP to find combinations
Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
 */
public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        //Creating the object of CombinationSolution Class
        CombinationSolution combinationSolution = new CombinationSolution();
        //Method Calling
        List<List<Integer>> allCombination = combinationSolution.combine(n, k);
        //Printing all combinations
        System.out.println(allCombination);
    }
}
//class containing all logic to find the combinations
class CombinationSolution {
    private int n;
    private int k;

    public List<List<Integer>> combine(int n, int k) {
        this. n = n;
        this.k = k;
        List<List<Integer>> combination = new ArrayList<>();
        getCombination(new ArrayList<>(), 1, combination);
        return combination;
    }

    private void getCombination(List<Integer> current, int start, List<List<Integer>> combination){
        if(current.size() == k){
            combination.add(new ArrayList<>(current));
            return;
        }

        int need = k - current.size();
        int remain = (n - start) + 1;
        int available = remain - need;

        for(int i = start; i <= (start + available); i++){
            current.add(i);
            getCombination(current, i + 1, combination);
            current.remove(current.size() - 1);
        }
    }
}