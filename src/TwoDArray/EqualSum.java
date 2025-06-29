package TwoDArray;

public class EqualSum {
    /*
    *Q2. Equal Sum Grid Partition I

You are given an m x n matrix grid of positive integers. Your task is to determine if it is possible to make either one horizontal or one vertical cut on the grid such that:

Each of the two resulting sections formed by the cut is non-empty.
The sum of the elements in both sections is equal.
Return true if such a partition exists; otherwise return false.



Example 1:

Input: grid = [[1,4],[2,3]]

Output: true

Explanation:



A horizontal cut between row 0 and row 1 results in two non-empty sections, each with a sum of 5. Thus, the answer is true.

Example 2:

Input: grid = [[1,3],[2,4]]

Output: false

Explanation:

 No horizontal or vertical cut results in two non-empty sections with equal sums. Thus, the answer is false.

    * */

    public static boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int r = 1; r < m; r++) {

            int top = 0, bottom = 0;


            for (int i = 0; i < r; i++) {
                for (int j = 0; j < n; j++) {
                    top += grid[i][j];
                }
            }
            for (int i = r; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    bottom += grid[i][j];
                }

            }


            System.out.println(top);
            System.out.println(bottom);




        }

        return false;

    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 4},
                {3,2,10},
                {2,3,10},
                {4,3,0}
        };
        System.out.println(canPartitionGrid(grid));
    }
}
