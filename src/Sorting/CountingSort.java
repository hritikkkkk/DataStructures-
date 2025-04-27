package Sorting;

import java.util.Arrays;

/*
Counting Sort Theory:
----------------------
- Best for non-negative integers and when values are within a small known range.

How it works:
1. Find max element in array.
2. Create a count array of size (max + 1).
3. Count frequency of each number.
4. Rebuild sorted array using the count array.

Time Complexity: O(n + k)
(k = max element)
Space: O(k)

⚠ Only works with non-negative integers. Needs modification for negatives.

Example:
Input: [4, 2, 2, 8, 3]
Count: [0, 0, 2, 1, 1, 0, 0, 0, 1]
Sorted: [2, 2, 3, 4, 8]
*/

public class CountingSort {

    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Step 1: Find max element
        int max = Arrays.stream(arr).max().getAsInt();

        // Step 2: Create count array --> frequency array
        int[] count = new int[max + 1];

        // Step 3: Store frequencies
        for (int num : arr) {
            count[num]++;
        }

        // Step 4: Rebuild sorted array from frequency array
        int index = 0;
        for (int i = count.length - 1; i >= 0; i--) {  // for increasing order start i from 0 to count.length
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 8, 3, 3, 1};

        countingSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}

