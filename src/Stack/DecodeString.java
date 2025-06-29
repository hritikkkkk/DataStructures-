package Stack;

import java.util.Stack;

public class DecodeString {

    public  String decode(String s) {


        Stack<Pair> stack = new Stack<>();
        int num = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                stack.push(new Pair(new StringBuilder(), num));
                num = 0;
            } else if (c == ']') {

                Pair p = stack.pop();


                String repeated = p.sb.toString().repeat(p.count);

                if (!stack.isEmpty()) {
                    stack.peek().sb.append(repeated);
                } else {
                    stack.push(new Pair(new StringBuilder(repeated), 0));
                }


            } else {

                if (stack.isEmpty()) {
                    stack.push(new Pair(new StringBuilder(), 0));
                }

                stack.peek().sb.append(c);


            }
        }

        return stack.pop().sb.toString();
    }


    public static void main(String[] args) {
        String s = "10[cd]12[ef]"; // bcbcdbcdbcbcdbcdbcbcdbcd

        DecodeString ds=new DecodeString();
        System.out.println(ds.decode(s));


    }

     class Pair {
        StringBuilder sb;
        int count;


        Pair(StringBuilder sb, int count) {
            this.sb = sb;
            this.count = count;
        }
    }


}
