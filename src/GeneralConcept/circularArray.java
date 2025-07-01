package GeneralConcept;

import java.util.Arrays;
import java.util.Stack;

/**
 * Circular Array Traversal - General Pattern
 *
 * Core Idea:
 * Sometimes in problems like "Next Greater Element", "Sliding Window in Circle",
 * or even game simulations, we need to treat an array as circular — i.e., after the last element,
 * we go back to the first.
 *
 * To simulate circular behavior without copying the array:
 * Use index: nums[i % n] where i ∈ [0, 2n)
 * This simulates two passes over the array, allowing wrap-around traversal
 * <p>
 * Pattern Template:
 * for (int i = 0; i < 2 * n; i++) {
 * int realIndex = i % n;
 * // Use nums[realIndex] safely
 * }
 * <p>
 * Only push indices during the first pass (i < n) to avoid duplicates
 * Useful when wrap-around logic is needed to find next elements or simulate cycles
 * <p>
 * Related LeetCode Problems:
 * - 503. Next Greater Element II  https://leetcode.com/problems/next-greater-element-ii/
 * - 918. Maximum Sum Circular Subarray  https://leetcode.com/problems/maximum-sum-circular-subarray/
 * - 622. Design Circular Queue  https://leetcode.com/problems/design-circular-queue/
 * - 457. Circular Array Loop  https://leetcode.com/problems/circular-array-loop/
 * - 189. Rotate Array  https://leetcode.com/problems/rotate-array/
 */

public class circularArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};

        // Apply circular traversal logic: Find next greater element circularly
        int[] result = nextGreaterCircular(nums);

        System.out.println("Next Greater Elements (Circular): " + Arrays.toString(result));
    }

    /**
     * Example Function:
     * Finds the next greater element for each position in a circular array.
     * If no such element exists, place -1.
     */
    static int[] nextGreaterCircular(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1); // Default values
        Stack<Integer> stack = new Stack<>();

        // Simulate circular traversal: 0 to 2n - 1
        for (int i = 0; i < 2 * n; i++) {
            int curr = nums[i % n];

            // Resolve any elements in the stack for which current element is greater
            while (!stack.isEmpty() && nums[stack.peek()] < curr) {
                int index = stack.pop();
                res[index] = curr;
            }

            // Only push indices during first pass
            if (i < n) {
                stack.push(i);
            }
        }

        return res;
    }
}
