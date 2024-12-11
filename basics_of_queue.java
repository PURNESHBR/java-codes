
import java.util.*;

public class basics_of_queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        @SuppressWarnings("unused")
        Deque <Integer> deque=new ArrayDeque<>();//double ended queue
        q.poll();//retrieves and remove the head of queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);//1 2 3 4 5 
        q.remove();
        System.out.println(q);//2 3 4 5
        System.out.println(q.peek());
        System.out.println(q.element());
        q.add(6);
        System.out.println(q);

        
    }
    
}
