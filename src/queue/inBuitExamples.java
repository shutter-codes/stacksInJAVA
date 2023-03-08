package queue;

import java.util.LinkedList;
import java.util.Queue;

public class inBuitExamples {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.add(20);
        queue.add(25);
        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}



// queue is an interface in java while stack is a class in java .
