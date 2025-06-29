package Stack;

import Stack.NextGreaterElement;

public class MaxAreaInHistogram {

    public static int largestArea(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;


            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    break;

                }

                count++;
            }

            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    break;
                }
                count++;
            }


            ans = Math.max(nums[i] * count, ans);


        }
        return ans;
    }

    public static int optimizedLargestArea(int[] nums) {
        int[] nums1 = NextGreaterElement.nextSmallerElementIndex(nums);
        int[] nums2 = NextGreaterElement.nextSmallerElementIndexRev(nums);
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i] * (nums1[i] - nums2[i] - 1);
            System.out.println(curr);
            ans = Math.max(ans, curr);

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 6, 2, 3};
        System.out.println(largestArea(nums));
        System.out.println(optimizedLargestArea(nums));


    }
}
