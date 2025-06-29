package Stack;
import java.util.Stack;

public class validateStackSequence {

    public static boolean validate(int[]pushed,int[]popped){
        Stack<Integer> stack = new Stack<>();
        int idx = 0;

        for (int n : pushed) {
            stack.push(n);
            while (!stack.isEmpty() && stack.peek() == popped[idx]) {
                stack.pop();
                idx++;
            }
        }
        return stack.size() == 0;
    }
    public static void main(String[] args) {
        int[]pushed={1,2,2,3,4,5};
        int[]popped={4,5,3,2,2,1};
        System.out.println(validate(pushed,popped));

    }
}
