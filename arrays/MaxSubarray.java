
// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
import java.io.*;
import java.util.*;

class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximun contiguous sum is " + maxSubarray(arr));
    }

    static int maxSubarray(int arr[]) {
        int n = arr.length;
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int i = 0; i < n; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }
}