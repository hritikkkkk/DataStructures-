package TwoPointers;

import java.util.List;
import java.util.Arrays;

public class NoOfBoats {

    public static int noOfBoats(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, res = 0;

        while (i <= j) {
            res++;

            if (nums[i] + nums[j] <= k) {
                i++;
            }
            j--;
        }
        return res;


    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};

        System.out.println(noOfBoats(people, 3));
        int limit = 3, sum = 0, count = 1;

        for (int n : people) {
            sum += n;
            if (sum > limit) {
                count++;
                sum = n;
            }
        }
        System.out.println(count);

    }
}
