import java.util.Arrays;
import java.util.HashSet;

// Given an array of integers, find if the array contains any duplicates.

// Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
// Example 1:

// Input: [1,2,3,1]
// Output: true
// Example 2:

// Input: [1,2,3,4]
// Output: false
// Example 3:

// Input: [1,1,1,3,3,4,3,2,4,2]
// Output: true
class ContainsDuplicate {
    // O(n^2)
    public static boolean hasDuplicate1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    return true;

            }
        }
        return false;
    }

    // Sorting is O(n \log n)O(nlogn) and the sweeping is O(n)O(n).
    // After sorting the elements will be consecutive
    public static boolean hasDuplicate2(int[] arr) {
        Arrays.sort(arr);
        int max = arr.length;
        for (int i = 0; i < max; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }
        return false;
    }

    // hash table O(n)
    public static boolean hasDuplicate3(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(x))
                return true;
            set.add(x);
        }
        return false;
    }
}