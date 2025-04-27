package Sorting;

import java.util.Arrays;

/*
Bubble Sort Theory:
--------------------
- Bubble Sort is a simple sorting method.
- It works by **repeatedly swapping** adjacent elements if they are in the wrong order.

How it works:
- Compare each pair of adjacent elements.
- If the left one is bigger, swap them.
- After each pass, the largest element "bubbles" to the end.
- Repeat until the array is sorted.

Optimization:
- If no swaps happen in a full pass, the array is already sorted (break early).

Time Complexity: O(n^2) (worst and average)
Best Case (already sorted): O(n)
Space Complexity: O(1) (in-place sorting)

Example:
Input: [5, 2, 8, 1]
Pass 1:
- Compare 5 and 2 → Swap → [2, 5, 8, 1]
- Compare 5 and 8 → OK
- Compare 8 and 1 → Swap → [2, 5, 1, 8]
Pass 2:
- Compare 2 and 5 → OK
- Compare 5 and 1 → Swap → [2, 1, 5, 8]
Pass 3:
- Compare 2 and 1 → Swap → [1, 2, 5, 8]
Sorted!
*/

public class BubbleSort {

    // Function to perform Optimized Bubble Sort
    public static void bubbleSort(int[] arr) {

        // Outer loop for passes
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false; // To track if swapping happens in this pass

            // Inner loop for pairwise comparison
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {  // for decreasing order you can use '<' operator
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true; // Mark that a swap happened
                }
            }

            // If no swaps in the current pass, array is already sorted
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 8, 6};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
