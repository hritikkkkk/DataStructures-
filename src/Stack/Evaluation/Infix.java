package Stack.Evaluation;

import java.util.Stack;

public class Infix {
    public static int evaluation(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (Character.isDigit(c)) {
                operand.push(c - '0');
            } else if (c == '(') {
                operator.push(c);
            } else if (c == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    int op2 = operand.pop();
                    int op1 = operand.pop();
                    char ch = operator.pop();

                    int num = performOperation(op1, op2, ch);
                    operand.push(num);

                }
                operator.pop();
            } else {
                //operator

                while (!operator.isEmpty() && precedence(c) <= precedence(operator.peek())) {
                    int op2 = operand.pop();
                    int op1 = operand.pop();
                    char ch = operator.pop();

                    int num = performOperation(op1, op2, ch);
                    operand.push(num);
                }
                operator.push(c);

            }
        }
        while (!operator.isEmpty()) {
            int op2 = operand.pop();
            int op1 = operand.pop();
            char ch = operator.pop();
            int num = performOperation(op1, op2, ch);
            operand.push(num);

        }

        return operand.pop();


    }

    public static void main(String[] args) {
        String s = "2437 2 +";
        System.out.println(evaluation(s));
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


    public static int performOperation(int op1, int op2, char ch) {
        switch (ch) {
            case '+':
                return op1 + op2;

            case '-':
                return op1 - op2;

            case '*':
                return op1 * op2;

            case '/':
                return op1 / op2;


        }
        return 0;
    }
}
