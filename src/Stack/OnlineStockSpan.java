package Stack;

import java.util.Arrays;

public class OnlineStockSpan {


    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int n = prices.length;
        int[] list = new int[n];


        for (int i = 0; i < n; i++) {
            int curr = prices[i];
            int nextGreater = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (prices[j] > curr) {
                    break;
                }
                nextGreater++;
            }
            list[i] = nextGreater;

        }
        System.out.println(Arrays.toString(list));

    }
}
