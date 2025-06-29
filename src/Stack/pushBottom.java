package Stack;

import java.util.Stack;

public class pushBottom {

    // so the question raise here that why we need recursion
    // if we can use add method which adds the element wherever we want


    // time complexity via recursion --> O(n)
    // time complexity via add method --> ?


    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStringStack(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        stack.add(0, 4); // can be done via recursion

        pushAtBottom(stack, 4);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        reverseStringStack("aman");

    }
}
