package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 3},


        };
        int[][] m2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] ans = new int[m1.length][m2[0].length];



        for (int[] rows : m1) {

            int j = 0;
            while (j < m2[0].length) {
                int sum = 0;
                for (int i = 0; i < rows.length; i++) {
                    sum += rows[i] * m2[i][j];
                }

                j++;
            }







        }
        System.out.println(Arrays.deepToString(ans));
    }
}
