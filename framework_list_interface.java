import java.util.*;
public class framework_list_interface {
    static void LinkedList(){
        LinkedList <Integer> ll= new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        System.out.println(ll.get(1));
        ll.set(3, 4);
        System.out.println(ll);
        System.out.println(ll.contains(4));

    }
    static void Stack(){
        Stack<String> s=new Stack<>();
        s.push("p");
        s.push("u");
        s.push("r");
        s.push("n");
        s.push("e");
        s.push("s");
        s.push("h");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.empty());
        System.out.println(s.size());

    }
    public static void main(String[] args) {
        LinkedList();
        Stack();
        
    }
    
}
