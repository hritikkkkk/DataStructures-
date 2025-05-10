package BinarySearch;

public class bs {

    /**
     * Standard Binary Search on an ascending sorted array.
     * Intuition: Divide the array in half repeatedly by comparing the target with mid element.
     * If target < mid, eliminate the right half, else eliminate the left half.
     * Time Complexity: O(log n)
     * Space Complexity: O(1) - iterative solution, constant space.
     */
    public static int search(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == target) {
                return mid; // found
            }
            if (arr[mid] < target) {
                i = mid + 1; // eliminate left half
            } else {
                j = mid - 1; // eliminate right half
            }
        }
        return -1; // not found
    }

    /**
     * Binary Search on a descending (reverse sorted) array.
     * Intuition: Same logic as standard binary search but the comparison direction is flipped.
     * If arr[mid] > target, eliminate left half (i.e., move right).
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int searchReversly(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                i = mid + 1; // move right
            } else {
                j = mid - 1; // move left
            }
        }
        return -1;
    }

    /**
     * Order-Agnostic Binary Search: works on both ascending and descending sorted arrays.
     * Intuition:
     *  - First determine the order of the array using the first and last elements.
     *  - Then apply binary search accordingly.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int OrderAgnosticSearch(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        boolean isAsc = nums[i] < nums[j]; // check if array is sorted ascending

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) return mid;

            if (isAsc) {
                if (nums[mid] < target) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            } else {
                if (nums[mid] > target) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 10, 12, 15};
        int[] nums = {5, 7, 7, 8, 8, 9, 9};
        System.out.println(search(nums, 9)); // Output: index of target if found, else -1
    }
}

