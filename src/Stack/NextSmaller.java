package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmaller {

    public static int[] nextSmaller(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[6];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }

            int nextSmaller = stack.isEmpty() ? -1 : stack.peek();

            ans[i] = nextSmaller;
            stack.push(nums[i]);
        }
        return ans;
    }

    public static int[] nextSmallerRev(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[6];
        for (int i = 0;i<nums.length;i++) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }

            int nextSmaller = stack.isEmpty() ? -1 : stack.peek();

            ans[i] = nextSmaller;
            stack.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 6, 2, 3};  //[1,-1,2,2,-1,-1];  [1,0,2,2,0,0]
        System.out.println(Arrays.toString(nextSmallerRev(nums)));




    }
}
