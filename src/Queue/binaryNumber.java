package Queue;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binaryNumber {

    public static List<String> generate(int n) {
        Queue<String> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        queue.add("1");

        while (n-- > 0) {
            String s = queue.poll();
            list.add(s);

            queue.offer(s + "0");
            queue.offer(s + "1");
        }
        return list;


    }

    public static void main(String[] args) {
        System.out.println(generate(50000));


    }
}
