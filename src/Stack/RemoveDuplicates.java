package Stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "ecbacba";
        int n = s.length();

        Stack<Character> stack = new Stack<>();

        boolean[] seen = new boolean[26];
        int[] lastIndex = new int[26];

        for (int i = 0; i < n; i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (seen[c - 'a']) continue;

            while (!stack.isEmpty() && c < stack.peek() && lastIndex[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }


            seen[c - 'a'] = true;
            stack.push(c);


        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        System.out.println(sb);
        System.out.println('5'-'0');


    }
}
