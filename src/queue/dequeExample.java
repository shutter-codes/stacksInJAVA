package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeExample {
    public static void main(String[] args) {
        Deque <Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(51);
        deque.add(511);
        deque.add(5111);
        deque.add(51111);
        deque.add(511111);

        deque.addFirst(21);
        deque.addLast(41);
//        deque.removeFirst(),deque.removeLast()
    }
}
