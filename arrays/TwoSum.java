// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    // BRUTE FORCE
    // Time O(n^2); Space O(1)
    public int[] twoSum1(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No such possible solution");
    }

    // TWO PASS HASH TABLE
    // Time O (n); Space O(n)
    public int[] twoSum2(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No possible solution was found");
    }

    // ONE PASS HASH TABLE
    // Time O(n); Space O(n)
    public int[] twoSum3(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No possible solution was found");
    }
}