package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static int minDistance(int[] nums, int cows) {
        Arrays.sort(nums);
        int low = 0;
        int max = 0;


        for (int n : nums) {
            max = Math.max(max, n);
        }

        int high = max;

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isGood(nums, cows, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isGood(int[] nums, int cows, int mid) {
        int count = 1;
        int last_pos = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last_pos >= mid) {

                last_pos = nums[i];
                count++;
            }

            if (count == cows) {
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 8, 9};

        int cows = 3;
        // can we place 3 cows at a maximized minimum distance
        // means the minimum distance between each cow should be as large as possible !

        System.out.println(minDistance(nums,cows));


    }
}
