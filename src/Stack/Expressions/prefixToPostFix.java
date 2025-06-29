package Stack.Expressions;

import java.util.Stack;

public class prefixToPostFix {

    public static String conversion(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (isOperator(sb.charAt(i))) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + op2 + sb.charAt(i);
                stack.push(temp);

            } else {
                stack.push(Character.toString(sb.charAt(i)));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String s = "*+AB-CD";
        System.out.println(conversion(s));
    }

    public static boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        }
        return false;

    }
}
