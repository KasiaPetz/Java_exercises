package collections.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyQueque {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Kasia");
        stack.push("Basia");
        stack.push("Asia");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("--------------------");

        Queue<String> queue = new LinkedList<>();

        queue.offer("Kasia");
        queue.offer("Basia");
        queue.offer("Asia");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


        //Za pomocą ArrayDeque można używać struktury jak listy, stosu badz kolejki.
        //Jeżeli używamy ArrayDeque TYLKO jako stostu badz TYLKO jako kolejki to ArrayDeque bedzie szybsze niz Stack badz LinkedList.
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("Basia");
        arrayDeque.offer("Kasia");
        arrayDeque.poll();
        arrayDeque.push("Kasia");
        arrayDeque.pop();
    }

}
