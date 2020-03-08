package structures.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {

    /*
        This class is likely to be faster than
        {@link Stack} when used as a stack, and faster than {@link LinkedList}
        when used as a queue.
     */
    public static void main(String[] args) {
        //utworzenie kolejki
        Queue<String> queue = new ArrayDeque<>();

        //zakolejkowanie elementu
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        //podejrzenie pierwszego elementu w kolejce
        System.out.println(queue.peek());
        //zdjecie elementu elementu z kolejki
        System.out.println(queue.poll());

        //utrzoenie stosu
        Deque<String> stack = new ArrayDeque<>();

        //wrzucenie elementu na stos
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        //zdjecie elementu ze stosu
        System.out.println(stack.pop());
    }

}
