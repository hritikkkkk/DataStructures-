package StringMatching;

import java.util.ArrayList;
import java.util.Arrays;

public class KMP {

    /*
     KMP (Knuth-Morris-Pratt) Algorithm for Pattern Matching

     ➤ Motivation:
        - Brute Force resets everything on mismatch → inefficient!
        - KMP avoids rechecking characters by precomputing the longest prefix-suffix (LPS) array.

     ➤ Idea:
        - Use info from previous matches to skip unnecessary comparisons.
        - LPS array tells us how many characters we can skip upon mismatch.

     ➤ Time Complexity:
        - Preprocess LPS: O(m) where m = length of pattern
        - Search in text: O(n) where n = length of text
        - Total: O(n + m)

     ➤ Space Complexity:
        - O(m) for LPS array

     ➤ Example:
        Text:    "ababcabcabababd"
        Pattern: "ababd"
        Result: true (pattern found at index 10)
    */

    public static ArrayList<Integer> KMPsearch(String text, String pattern) {
        int[] lps = computeLPS(pattern);
        int i = 0; // pointer for text
        int j = 0; // pointer for pattern
        ArrayList<Integer> res = new ArrayList<>();

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                res.add(i - j);
                j = lps[j - 1];

            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // shift pattern based on LPS
                } else {
                    i++; // move to next char in text
                }
            }
        }

        return res; // pattern not found
    }

    // Preprocess the pattern to generate the LPS array

    //naive approach to generate longest prefix suffix
    // for e.g "ababab" has the longest prefix suffix is "abab" which is of length 4
    private static int computeLPSNaive(String s) {
        int res = 0;
        int n = s.length();

        // Iterating over all possible lengths
        for (int len = 1; len < n; len++) {

            // Starting index of suffix
            int j = s.length() - len;

            boolean flag = true;

            // Comparing proper prefix with suffix of length 'len'
            for (int k = 0; k < len; k++) {
                if (s.charAt(k) != s.charAt(j + k)) {
                    flag = false;
                    break;
                }
            }

            // If they match, update the result
            if (flag)
                res = len;
        }

        return res;

    }

    public static int[] longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = new int[n];

        // len stores the length of longest prefix which
        // is also a suffix for the previous index
        int len = 0;

        // lps[0] is always 0
        lps[0] = 0;

        int i = 1;
        while (i < n) {

            // If characters match, increment the size of lps
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }

            // If there is a mismatch
            else {
                if (len != 0) {

                    // Update len to the previous lps value
                    // to avoid redundant comparisons
                    len = lps[len - 1];
                } else {

                    // If no matching prefix found, set lps[i] to 0
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // Last element of lps array will store the length of
        // longest prefix that is also suffix of entire string
        return lps;
    }

    private static int[] computeLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0; // length of previous longest prefix suffix
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // fallback
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        String text = "aabaacaadaabaaba";
        String pattern = "aaba";
        System.out.println(computeLPSNaive("bbadabc"));
//        System.out.println(KMPsearch(text, pattern));


    }
}
