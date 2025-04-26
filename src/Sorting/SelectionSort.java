package Sorting;

import java.util.Arrays;

/*
Selection Sort Theory:
-----------------------
- Selection sort divides the array into two parts:
  1. Sorted part (left side)
  2. Unsorted part (right side)

- In every pass:
  - Find the minimum element from the unsorted part.
  - Swap it with the first element of the unsorted part.

- After each pass, the sorted part grows by one element.
- Time Complexity: O(n^2)
- Space Complexity: O(1) (no extra space needed)
- Not suitable for large datasets.

Example:
Initial Array: [5, 3, 8, 1]
Pass 1: Find 1 → Swap with 5 → [1, 3, 8, 5]
Pass 2: Find 3 → Already at correct position
Pass 3: Find 5 → Swap with 8 → [1, 3, 5, 8]
Array sorted!
*/

public class SelectionSort {

    // Function to perform Selection Sort
    public static void selectionSort(int[] nums) {

        // Traverse through all elements of the array
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i; // Assume the current index has the minimum

            // Find the minimum element in remaining unsorted array
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j; // Update minPos if a smaller element found
                }
            }

            // Swap the found minimum element with the first element
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 5, 6};

        selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
