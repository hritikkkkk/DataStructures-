package Sorting;

import java.util.Arrays;

public class bubbleSort {

    /* Idea  -> Large Elements come to the end of the array by swapping
                with adjacent Elements

Bubble Sort is a way to sort numbers (or elements) from smallest to biggest (or biggest to smallest)
by **repeatedly swapping** the wrong ones.

It works like this:
- Go through the list again and again.
- If two numbers are in the wrong order, swap them.
- Keep doing this until everything is sorted.

---
Input: `5 2 8 1`
Steps:
- Compare 5 and 2 → Swap → `2 5 8 1`
- Compare 5 and 8 → OK
- Compare 8 and 1 → Swap → `2 5 1 8`
Repeat until sorted: `1 2 5 8`

---
 */

    public static void BubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {


                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 3, 2, 8};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
