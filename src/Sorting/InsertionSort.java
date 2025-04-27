package Sorting;

import java.util.Arrays;

/*
 Idea -> Pick an element from unsorted part & place in the right position in the sorted part
- Builds the sorted array one element at a time.
- Takes each element and inserts it into its correct position in the sorted part (like sorting cards in hand).

How it works:
- Start from index 1 (second element).
- Compare it with the previous elements.
- Shift elements to the right until correct position is found.
- Insert the current element there.

Time Complexity: O(n^2)
Best Case: O(n) when already sorted
Space: O(1) (in-place)

Example:
Input: [5, 3, 1]
Pass 1: Insert 3 → [3, 5, 1]
Pass 2: Insert 1 → [1, 3, 5]
Sorted!
*/

public class InsertionSort {


    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Element to insert
            int j = i - 1;

            // Shift elements greater than key to the right
            // so that we can find out the correct position to insert
            while (j >= 0 && arr[j] > key) {  // for decreasing order you can use '<' operator
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key in correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 4, 1, 3};

        insertionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
