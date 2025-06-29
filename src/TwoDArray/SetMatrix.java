package TwoDArray;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetMatrix {

    //how can we do it without using extra space

    //we need to read each and every element of matrix

    //for that while we iterate we need to marked up wherever zero comes without using space

    // whenever we find zero we know eventually all that rows and cols for that particular element
    // should be converted into 0's

    //to keep a marker of what row need to be converted to zero we make the starting of the same row
    // and col as 0

    public static void setMatrixZero(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;



        boolean isRow = false, isCol = false;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;

                    if (i == 0) isRow = true;
                    if (j == 0) isCol = true;
                }
            }


        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isRow) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }

        if (isCol) {
            for (int j = 0; j < m; j++) {
                matrix[j][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 0, 4},
                {5, 0, 6, 8},
                {9, 5, 11, 12}
        };
        setMatrixZero(matrix);
        System.out.println(Arrays.deepToString(matrix));




    }
}
