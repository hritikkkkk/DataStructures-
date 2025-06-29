package BinarySearch;

public class RotatedSorted {

    public static int rotatedSearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // check if mid-lies in upper curve or lower curve
            if (nums[mid] >= nums[low]) {  //upper curve

                //left part(upper curve) is always sorted so let's compare there

                if (target >= nums[low] && target < nums[mid]) {
                    //target is in left part of upper curve

                    high = mid - 1;  // discard right
                } else {
                    //target is in right
                    low = mid + 1;    // discard left
                }

            } else {                      // lower curve
                // right part is always sorted as well so let's compare there


                if (target > nums[mid] && target <= nums[high]) {
                    // target is in right part
                    low = mid + 1; //discard left
                } else {
                    high = mid - 1; // discard right
                }
            }
        }
        return -1;
    }

    // now let's find the minimum element in this rotated array


    public static int findMinElement(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        if (n == 1) return nums[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[low] < nums[high]) return nums[low];

            if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]) return nums[mid];

            if (mid + 1 < n && nums[mid + 1] < nums[mid]) return nums[mid + 1];


            if (nums[low] < nums[mid]) {   // upper curve
                low = mid + 1;
            } else {
                high = mid - 1;
            }


        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 2, 3, 4};
        System.out.println(rotatedSearch(nums, 3));
        System.out.println(findMinElement(nums));


    }
}
