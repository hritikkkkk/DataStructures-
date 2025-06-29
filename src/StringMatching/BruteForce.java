package StringMatching;

public class BruteForce {

    /*
     * ❓ PROBLEM:
     * Given a text and a pattern, check if the pattern exists in the text.
     *
     * 💡 APPROACH: Brute-force String Matching
     * - Compare each character of the pattern with the substring of text starting at every position.
     * - If characters match, continue; if not, shift by 1 and repeat.
     *
     * ⏱️ Time Complexity: O(n * m)
     *   - n = length of the text (str)
     *   - m = length of the pattern
     *
     *  ⚠️ LIMITATIONS of Brute Force (Why KMP or Rabin-Karp are Needed):
     * - Inefficient on repetition:
     *     e.g., text = "aaaaaaaab", pattern = "aaab" ➝ redundant checks.
     * - Redundant backtracking:
     *     On mismatch, resets everything even if partial match was found.
     * - Doesn't utilize previous matching information.
     * - Poor performance on large inputs (e.g., DNA sequences, log analysis).

     */

    // Brute-force string matching function
    public static boolean stringMatching(String str, String pattern) {
        int k = 0;  // Pointer for pattern

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == pattern.charAt(k)) {
                k++;  // Match next character in pattern
            } else {
                k = 0;  // Reset pattern pointer

                // Re-check current character if it matches the start of pattern
                if (str.charAt(i) == pattern.charAt(k)) {
                    k++;
                }
            }

            // Pattern matched completely
            if (k == pattern.length()) {
                System.out.println("Matched substring: " + str.substring(i + 1 - k, i + 1));
                return true;
            }
        }

        return false;  // Pattern not found
    }

    // now print all occcures if pattern in text brute force way
    public static void search(String str, String pattern) {
        int N = str.length();
        int M = pattern.length();
        // A loop to slide pat[] one by one
        for (int i = 0; i <= N - M; i++) {

            int j;
            // For current index i, check for pattern match
            for (j = 0; j < M; j++) {
                if (str.charAt(i + j) != pattern.charAt(j)) {

                    break;
                }
            }

            // If pattern matches at index i
            if (j == M) {
                System.out.println("Pattern found at index " + i);
            }
        }

    }

    // fnd the longest prefix suffix length of pattern string
    public static int lps(String pattern) {
        int i = 0, j = 1, ans = 0;
        while (j < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                i++;
            } else {
                i = 0;
                j++;
            }


        }
        return i;
    }


    public static void main(String[] args) {
        String str = "abcabcfghdegabcfgh";
        String pattern = "abcfgh";
        System.out.println(str.indexOf(pattern, 4));

//        boolean found = stringMatching(str, pattern);
//        System.out.println("Pattern found? " + found);
//        search(str, pattern);

        System.out.println(lps("ababab"));
    }
}

