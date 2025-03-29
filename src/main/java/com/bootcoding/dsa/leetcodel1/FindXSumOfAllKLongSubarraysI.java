package com.bootcoding.dsa.leetcodel1;

import java.util.*;

/*
Leetcode Q-3318 WAP to Find X-Sum of All K-Long Subarrays I
You are given an array nums of n integers and two integers k and x.
The x-sum of an array is calculated by the following procedure:
Count the occurrences of all elements in the array.
Keep only the occurrences of the top x most frequent elements. If two elements have the same number of occurrences,
the element with the bigger value is considered more frequent.
Calculate the sum of the resulting array.
Note that if an array has less than x distinct elements, its x-sum is the sum of the array.
Return an integer array answer of length n - k + 1 where answer[i] is the x-sum of the subarray nums[i..i + k - 1].
 */
public class FindXSumOfAllKLongSubarraysI {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,2,3};
        int k = 6;
        int x = 2;

        //Method Calling
        int[] result = findXSum(nums, k, x);
        System.out.println(Arrays.toString(result));
    }

    //Method Definition
    public static int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Frequency Map to store counts of elements in the window
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Sorted frequency map (TreeMap) - keys are frequency counts
        TreeMap<Integer, Set<Integer>> sortedMap = new TreeMap<>(Collections.reverseOrder());

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            addToMap(nums[i], frequencyMap, sortedMap);
        }
        result[0] = computeXSum(sortedMap, x);

        // Sliding window iteration
        for (int i = 1; i <= n - k; i++) {
            int outElement = nums[i - 1];   // Element leaving window
            int inElement = nums[i + k - 1]; // Element entering window

            removeFromMap(outElement, frequencyMap, sortedMap);
            addToMap(inElement, frequencyMap, sortedMap);

            result[i] = computeXSum(sortedMap, x);
        }

        return result;
    }

    private static void addToMap(int num, Map<Integer, Integer> freqMap, TreeMap<Integer, Set<Integer>> sortedMap) {
        int oldCount = freqMap.getOrDefault(num, 0);
        int newCount = oldCount + 1;
        freqMap.put(num, newCount);

        if (oldCount > 0) {
            sortedMap.get(oldCount).remove(num);
            if (sortedMap.get(oldCount).isEmpty()) {
                sortedMap.remove(oldCount);
            }
        }

        sortedMap.putIfAbsent(newCount, new HashSet<>());
        sortedMap.get(newCount).add(num);
    }

    private static void removeFromMap(int num, Map<Integer, Integer> freqMap, TreeMap<Integer, Set<Integer>> sortedMap) {
        int oldCount = freqMap.get(num);
        if (oldCount == 1) {
            freqMap.remove(num);
        } else {
            freqMap.put(num, oldCount - 1);
        }

        sortedMap.get(oldCount).remove(num);
        if (sortedMap.get(oldCount).isEmpty()) {
            sortedMap.remove(oldCount);
        }

        if (oldCount > 1) {
            sortedMap.putIfAbsent(oldCount - 1, new HashSet<>());
            sortedMap.get(oldCount - 1).add(num);
        }
    }

    private static int computeXSum(TreeMap<Integer, Set<Integer>> sortedMap, int x) {
        int sum = 0;
        int count = 0;

        for (var entry : sortedMap.entrySet()) {
            int freq = entry.getKey();
            List<Integer> numbers = new ArrayList<>(entry.getValue());
            numbers.sort(Collections.reverseOrder());

            for (int num : numbers) {
                if (count == x) return sum;
                sum += num * freq;
                count++;
            }
        }

        return sum;
    }
}
