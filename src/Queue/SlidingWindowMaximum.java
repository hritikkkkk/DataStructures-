package Queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        int idx = 0;


        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && nums[i] > nums[queue.getLast()]) {
                queue.poll();

            }

            queue.addLast(i);

            if (queue.getFirst() + k == i) {
                queue.removeFirst();
            }

            if (i >= k - 1) {
                arr[idx++] = nums[queue.getFirst()];
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        System.out.println(maxSlidingWindow(arr, k));


    }
}
