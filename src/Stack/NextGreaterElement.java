package Stack;


import java.util.Arrays;
import java.util.*;


public class NextGreaterElement {
    // nums is a subset of arr meaning we got every element of nums ,exists in arr

    // both are distinct array means there is no duplicate element in the both array


    public static int[] nextSmallerElementIndex(int[] nums) {
        int n = nums.length;
        int[] list = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            int nextGreater = nums.length;
            for (int j = i; j < n; j++) {
                if (nums[j] < curr) {
                    nextGreater = j;
                    break;
                }
            }
            list[idx] = nextGreater;
            idx++;
        }
        return list;
    }

    public static int[] nextSmallerElementIndexRev(int[] nums) {
        int n = nums.length;
        int[] list = new int[n];
        int idx = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int curr = nums[i];
            int nextGreater = -1;
            for (int j = i; j >= 0; j--) {
                if (nums[j] < curr) {
                    nextGreater = j;
                    break;
                }
            }
            list[idx] = nextGreater;
            idx--;
        }
        return list;
    }

    public static int[] nextgreater(int[] nums) {


        Stack<Integer> stack = new Stack<>();
        int[]ans=new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];

            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            int nextG = stack.isEmpty() ? -1 : stack.peek();


            ans[i]=nextG;
            stack.push(num);
        }
       return ans;
    }


    public static int[] nextgreaterReverse(int[] nums) {


        Stack<Integer> stack = new Stack<>();
        int[]ans=new int[nums.length];

        for (int i = 0;i<nums.length;i++) {
            int num = nums[i];

            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            int nextG = stack.isEmpty() ? -1 : stack.peek();


            ans[i]=nextG;
            stack.push(num);
        }
        return ans;
    }




    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 6, 2, 3};
        System.out.println(Arrays.toString(nextgreater(nums)));
        System.out.println(Arrays.toString(nextgreaterReverse(nums)));

        System.out.println(nextSmallerElementIndex(nums));
        System.out.println(nextSmallerElementIndexRev(nums));
        int n = nums.length;
        int[] list = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            int nextGreater = -1;
            for (int j = i; j < n; j++) {
                if (nums[j] > curr) {
                    nextGreater = nums[j];
                    break;
                }
            }
            list[idx] = nextGreater;
            idx++;
        }

        System.out.println(Arrays.toString(list));
    }
}
