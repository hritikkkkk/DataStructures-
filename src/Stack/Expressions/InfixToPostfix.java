package Stack.Expressions;

import java.util.Stack;

public class InfixToPostfix {
    public static String conversion(String exp) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (isOperand(c)) {
                int num = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }
                sb.append(num);
                i--;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            } else {


                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {

                    sb.append(stack.pop());
                }


                stack.push(c);


            }
        }
        while (!stack.isEmpty()) {

            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "2437+2";
        System.out.println(conversion(s));

    }

    public static int precedence(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '/' || ch == '*') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean isOperand(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
            return true;
        }
        return false;

    }
}
