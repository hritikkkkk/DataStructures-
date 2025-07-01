package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueClient {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        queue.add(2);

        int size = queue.size();
        queue.add(3);

        for (int i = 0; i < size; i++) {
         queue.add(queue.poll());
        }
        System.out.println(queue.peek());
        System.out.println(queue.poll());


    }
}
