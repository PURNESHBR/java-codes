import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    
}
