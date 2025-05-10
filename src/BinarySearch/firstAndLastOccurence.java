package BinarySearch;

public class firstAndLastOccurence {

    /**
     * Finds the first and last occurrence of a target element in a sorted array.
     * Intuition:
     * - Since the array is sorted, we can use modified binary search to find the
     * leftmost (first) and rightmost (last) position of the target.
     * - Binary search is run twice: once shifting the right pointer when found (for first),
     * and once shifting the left pointer when found (for last).
     * <p>
     * Time Complexity: O(log n) for each binary search → Total: O(log n)
     * Space Complexity: O(1) - iterative binary search
     */
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    // Binary search to find first (leftmost) index of target
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;        // record answer
                right = mid - 1;     // continue left to find earlier index
            } else if (nums[mid] < target) {
                left = mid + 1;      // move right
            } else {
                right = mid - 1;     // move left
            }
        }

        return result;
    }

    // Binary search to find last (rightmost) index of target
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;        // record answer
                left = mid + 1;      // continue right to find later index
            } else if (nums[mid] < target) {
                left = mid + 1;      // move right
            } else {
                right = mid - 1;     // move left
            }
        }

        return result;
    }

    public static void main(String[] args) {
        firstAndLastOccurence obj = new firstAndLastOccurence();

        // Test 1: Multiple occurrences
        int[] result1 = obj.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println("Expected: [3, 4], Actual: [" + result1[0] + ", " + result1[1] + "]");

        // Test 2: Single occurrence
        int[] result2 = obj.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 10);
        System.out.println("Expected: [5, 5], Actual: [" + result2[0] + ", " + result2[1] + "]");

        // Test 3: Not found
        int[] result3 = obj.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        System.out.println("Expected: [-1, -1], Actual: [" + result3[0] + ", " + result3[1] + "]");

        // Test 4: All elements are the target
        int[] result4 = obj.searchRange(new int[]{2, 2, 2, 2, 2}, 2);
        System.out.println("Expected: [0, 4], Actual: [" + result4[0] + ", " + result4[1] + "]");

        // Test 5: Target is the first element
        int[] result5 = obj.searchRange(new int[]{1, 2, 3, 4, 5}, 1);
        System.out.println("Expected: [0, 0], Actual: [" + result5[0] + ", " + result5[1] + "]");

        // Test 6: Target is the last element
        int[] result6 = obj.searchRange(new int[]{1, 2, 3, 4, 5}, 5);
        System.out.println("Expected: [4, 4], Actual: [" + result6[0] + ", " + result6[1] + "]");

        // Test 7: Empty array
        int[] result7 = obj.searchRange(new int[]{}, 3);
        System.out.println("Expected: [-1, -1], Actual: [" + result7[0] + ", " + result7[1] + "]");
    }
}
