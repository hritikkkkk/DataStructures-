package TwoDArray;

/*
Searching for an Element in a 2D Matrix

There are three main approaches:

1. Brute Force (Simple Way):
   - Check each element one-by-one.
   - Time Complexity: O(m * n), where m = number of rows, n = number of columns.
   - Space Complexity: O(1).

2. Row-wise Binary Search (When each row is sorted individually):
   - Apply Binary Search on each row separately.
   - Time Complexity: O(m * log n).
   - Space Complexity: O(1).

3. Optimized Approach (Top-Right Corner Search - Best if matrix is row-wise and column-wise sorted):
   - Start from the top-right corner:
     - If the current element == target ➔ Return true.
     - If the current element > target ➔ Move Left (col--).
     - If the current element < target ➔ Move Down (row++).
   - Time Complexity: O(m + n).
   - Space Complexity: O(1).

Example:

Input Matrix:
[
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
]
Target = 8

Steps (Top-Right Search):
- Start at matrix[0][2] → 3 (less than 8) ➔ move down
- matrix[1][2] → 6 (less than 8) ➔ move down
- matrix[2][2] → 9 (greater than 8) ➔ move left
- matrix[2][1] → 8 (found!) ➔ return true
*/

public class searchInAMatrix {

    // 1. Brute Force Approach: Check every element
    public static boolean searchInMatrix(int[][] matrix, int target) {
        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true; // Target found
                }
            }
        }
        return false; // Target not found
    }

    // 2. Row-wise Binary Search: Search each row individually
    public static boolean searchUsingBinarySearch(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (binarySearch(row, target)) {
                return true; // Found in this row
            }
        }
        return false; // Not found in any row
    }

    // Helper function for binary search on a 1D array
    private static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevent integer overflow

            if (nums[mid] == target) {
                return true; // Found
            }

            if (nums[mid] < target) {
                start = mid + 1; // Move to the right half
            } else {
                end = mid - 1;   // Move to the left half
            }
        }
        return false; // Target not found
    }

    // 3. Optimized Approach: Start from top-right corner
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Edge case: empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1; // Start at top-right corner

        // Move within matrix boundaries
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Target found
            }

            if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 8;

        // Testing all three approaches
        System.out.println("Brute Force: " + searchInMatrix(matrix, target));            // true
        System.out.println("Row-wise Binary Search: " + searchUsingBinarySearch(matrix, target)); // true
        System.out.println("Optimized Search: " + searchMatrix(matrix, target));          // true
    }
}
