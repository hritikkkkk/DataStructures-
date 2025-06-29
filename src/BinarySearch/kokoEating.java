package BinarySearch;

public class kokoEating {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = 0;
        for (int n : piles) {
            max = Math.max(n, max);
        }

        int high = max;
        int res = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(piles, mid, h)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static boolean isValid(int[] nums, int max, int hour) {
        int time = 0;
        for (int n : nums) {
            time += Math.ceil((double) n / max);

        }

        return time <= hour;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 11};
        System.out.println(minEatingSpeed(nums, 8));

    }
}
