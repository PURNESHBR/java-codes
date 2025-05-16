import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        // Add elements to the queue
        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);

        // Print the head of the queue
        System.out.println("Head of Queue : " + p.peek());
        System.out.println(p);
        p.poll();
        System.out.println("Head of Queue after removing the head: " + p.peek());
    }
    
}
