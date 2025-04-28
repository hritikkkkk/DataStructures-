package TwoDArray;

import java.util.Arrays;

/*
Transpose of a Matrix:
-----------------------
The **transpose** of a matrix is formed by swapping its rows and columns.

- The element at position [i][j] in the original matrix moves to position [j][i] in the transposed matrix.
- This process effectively "flips" the matrix over its main diagonal.

Example:
---------
Given a 2D integer array matrix, for example:
Input:
[[1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]]

The transpose will be:
Output:
[[1, 4, 7],
 [2, 5, 8],
 [3, 6, 9]]

The number of rows becomes the number of columns and vice versa.

--- Steps to Transpose:
1. Initialize a new matrix `transposed` with dimensions reversed (i.e., columns of original become rows).
2. Loop through each element of the original matrix.
3. Set the value of element [i][j] in the original matrix to [j][i] in the transposed matrix.
4. Return the transposed matrix.

Time Complexity:
- O(row * col) because we visit each element once.

Space Complexity:
- O(row * col) for storing the transposed matrix.
*/

public class Transpose {

    // Function to transpose a given matrix
    public static int[][] transpose(int[][] matrix) {
        // Get the number of rows and columns of the original matrix
        int row = matrix.length;
        int col = matrix[0].length;

        // Create a new matrix with transposed dimensions (col x row)
        int[][] transposed = new int[col][row];

        // Loop through each element and assign to its transposed position
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < col; i++) {
                transposed[i][j] = matrix[j][i]; // Assign element [j][i] to [i][j]
            }
        }
        return transposed; // Return the transposed matrix
    }



    // Main function to test the transpose operation
    public static void main(String[] args) {
        // Original matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Call the transpose function
        int[][] nums = transpose(matrix);

        // Print the transposed matrix row by row
        for (int[] num : nums) {
            System.out.println(Arrays.toString(num)); // Print each row of the transposed matrix
        }
    }
}

