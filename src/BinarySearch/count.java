package BinarySearch;

public class count {

    /*
    * Given a sorted array arr[] and a number x,
    * write a function that counts the occurrences of x in arr[].
    * Expected time complexity is O(LogN)
Examples:

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 */

    //nothing just first and last occurences of given x target.



    private static int firstOccurence(int[]arr,int target){
        int low=0,high=arr.length-1;
        int res=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                res=mid;
                high=mid-1;

            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }

    private static int lastOccurence(int[]arr,int target){
        int res = arr.length;

        // Search space for binary search
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                res = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
    int[]nums={1,2,2,2,2,4,5,6};
        System.out.println(firstOccurence(nums,2));
        System.out.println(lastOccurence(nums,2));
    }
}
