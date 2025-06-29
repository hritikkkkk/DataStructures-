package BinarySearch;

import java.util.Scanner;

public class veryEasyTask {

    public static int minTime(int n, int x, int y) {
        int start = 0, end = Math.max(x, y) * n, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (isValid(n, x, y, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans + Math.min(x, y);
    }

    public static boolean isValid(int n, int x, int y, int mid) {
        //objective
        // if in mid-amount of time , we're able to make n-1 copies
        //then  mid-value is valid ,we can just return true;

        //check how many copies can be made in mid-amount of time


        //c1 which is x can make mid/x copies in x time
        //c2 copier which is y can make mid/y copies in y time

        // both time >= n-1 hence we return true otherwise false;

        return (mid / x) + (mid / y) >= n - 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();


        System.out.println(minTime(n, x, y));


        // we're applying binary search on answer range
        // that's why this concept called as binary search over/on answer!


    }
}
