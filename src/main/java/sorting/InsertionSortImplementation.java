package main.java.sorting;

// time complexity: O(n2)
// space complexity: O(n) - inplace sorting
// think of sorting cards as you place them in your hand, one by one.

public class InsertionSortImplementation {
    public static void insertionSort(int[] nums) {
        int i = 1;
        int temp;
        while (i < nums.length) {
            int j = i - 1; // 3
            while (j >= 0) {
                if (nums[j+1] < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                j--;
            }
            i++;
        }
    }
}