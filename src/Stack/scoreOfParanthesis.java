package Stack;

import java.util.Stack;

public class scoreOfParanthesis {

    public static int score(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String s = "(()(()))";
        System.out.println(score(s));


    }
}
