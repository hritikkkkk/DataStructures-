package TwoDArray;

import java.util.ArrayList;
import java.util.List;

/*
Problem:
Print all elements of a matrix in spiral order.

Spiral Order Traversal:
- Traverse the top row → (left to right)
- Traverse the right column → (top to bottom)
- Traverse the bottom row → (right to left)
- Traverse the left column → (bottom to top)
- Repeat for the inner sub-matrix.

Conditions:
- Move layer-by-layer, shrinking boundaries (startRow++, endRow--, startCol++, endCol--).

Time Complexity: O(m * n)
Space Complexity: O(m * n) for output list (excluding input matrix)

Example Dry Run:

Input Matrix:
[
 [1,  2,  3,  4],
 [5,  6,  7,  8],
 [9, 10, 11, 12]
]

Steps:
- Top row: 1, 2, 3, 4
- Right column: 8, 12
- Bottom row (reverse): 11, 10, 9
- Left column (upwards): 5
- Inner sub-matrix:
  - Top row: 6, 7

Output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
*/

public class spiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        // Initialize boundaries
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        List<Integer> ans = new ArrayList<>();

        // Traverse while boundaries are valid
        while (startRow <= endRow && startCol <= endCol) {

            // 1. Traverse the top row (left to right)
            for (int j = startCol; j <= endCol; j++) {
                ans.add(matrix[startRow][j]);
            }

            // 2. Traverse the right column (top to bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }

            // 3. Traverse the bottom row (right to left)
            if (startRow != endRow) { // Avoid double-counting when only one row left
                for (int j = endCol - 1; j >= startCol; j--) {
                    ans.add(matrix[endRow][j]);
                }
            }

            // 4. Traverse the left column (bottom to top)
            if (startCol != endCol) { // Avoid double-counting when only one column left
                for (int i = endRow - 1; i > startRow; i--) {
                    ans.add(matrix[i][startCol]);
                }
            }

            // Move boundaries inward
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(spiralOrder(matrix)); // Output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}
