package Stack;

import java.util.Stack;

public class duplicateParanthesis {

    public static boolean duplicate(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                if (count < 1) {
                    return true;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }

        }
        return false;

    }

    public static void main(String[] args) {


        String s = "((a+b))+(c+d)"; //true
        String s1 = "((a+b)+c+d)";  //false

        System.out.println(duplicate(s1));
    }
}
