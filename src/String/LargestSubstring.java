package String;

public class LargestSubstring {

    public static int largestSubstringBwEqualChar(String s) {
        int ans = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    ans = Math.max(ans, s.substring(i, j).length() - 1);
            }
        }
        return ans;
    }

    public static int largestSubstringOptimized(String s) {
        int[] indices = new int[26];
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (indices[idx] !=0) {
                //idx is already stored

                ans = Math.max(ans, i - indices[idx]);
            } else {
                indices[idx] = i + 1;
            }


        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcaefcb";

        System.out.println(largestSubstringBwEqualChar(s));
        System.out.println(largestSubstringOptimized(s));
    }
}
