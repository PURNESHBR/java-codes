import java.util.*;

public class deque_queue {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);
        System.out.println(dq);
        dq.addFirst(0);
        System.out.println(dq);
        dq.removeLast();
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.peekLast());
        dq.add(6);//add element at end
        dq.remove();//removes first element

    }
    
}
