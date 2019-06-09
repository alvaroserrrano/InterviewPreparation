// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Example:

// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
class MoveZeroes {

    public static void main(String[] args) {
        int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
        moveZeroes(arr);
        System.out.println(arr);
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int count = 0; // Non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}