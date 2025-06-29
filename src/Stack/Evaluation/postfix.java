package Stack.Evaluation;

import java.util.Stack;

public class postfix {

    public static int evaluation(String s) {
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c==' '){
                continue;
            }
            if (isOperand(c)) {
                stack.push(c - '0');
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                }

            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String s = "2437 2 +";
        System.out.println(evaluation(s));
    }

    public static boolean isOperand(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
}
