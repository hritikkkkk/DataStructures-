package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaveFormat {


    public static void main(String[] args) {
        int[][] arr = {

                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };  // output should return [ 1,5,9,10,6,2,3,7,11,12,8,4 ]
        int n = arr.length;
        int m = arr[0].length;
        int[][] matrix = new int[n][m];
//        for (int i = 0; i < m; i++) {
//
//            for (int j = n - 1; j >= 0; j--) {
//                matrix[i][j] = arr[j][i];
//            }
//
//        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                matrix[j][n - 1 - i] = arr[i][j];
            }

        }


        System.out.println(Arrays.deepToString(matrix));
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < arr[0].length; i++) {
//
//
//            if (i % 2 == 0) {
//                for (int j = 0; j < arr.length; j++) {
//                    list.add(arr[j][i]);
//                }
//            } else {
//                for (int j = arr.length - 1; j >= 0; j--) {
//                    list.add(arr[j][i]);
//                }
//            }
//        }


    }
}
