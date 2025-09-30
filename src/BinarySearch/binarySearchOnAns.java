package BinarySearch;

public class binarySearchOnAns {
    public static int FlipCost(int[] nums, int k) {
        int sum = 0, max = 0, res = -1;
        for (int n : nums) {
            sum += n;
            max = Math.max(max, n);
        }

        int start = max;
        int end = sum;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValid(nums, mid, k)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        System.out.println(FlipCost(nums, 2));
    }

    public static boolean isValid(int[] nums, int max, int k) {
        int sum = 0, student = 1;

        for (int n : nums) {
            sum += n;
            if (sum > max) {
                student++;
                sum = n;
            }
        }
        return student <= k;
    }
}
