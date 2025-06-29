package Stack;

import java.util.Arrays;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftmax[i], rightMax[i]) - height[i];
        }

        System.out.println(water);


        System.out.println(Arrays.toString(leftmax));
        System.out.println(Arrays.toString(rightMax));
    }

}
