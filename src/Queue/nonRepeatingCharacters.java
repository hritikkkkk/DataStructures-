package Queue;

import java.util.*;

public class nonRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abab"; // a a b -1
        String s1 = "abcabcab"; // a a a b c -1 -1 -1

        Queue<Character> queue = new LinkedList<>();
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (!queue.isEmpty() && map.containsKey(queue.peek()) && map.get(queue.peek()) > 1) {
                queue.poll();
            }
            queue.offer(c);

            if (!queue.isEmpty() && map.get(queue.peek())==1) {
                list.add(queue.peek());
            } else {

                list.add('*');
            }

        }
        System.out.println(list);


    }
}
