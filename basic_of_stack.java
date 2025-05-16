import java.util.*;
public class basic_of_stack {
    public static void main(String[] args) {
        //ArrayList<Integer> arr=new ArrayList<>(null);
        //int arr[]=new int [5];
        Stack <Integer> st = new Stack<>();
        System.out.println(st);//empty stack
        System.out.println("size of stack is  "+st.size());//0 size stack
        //push function
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.add(5);//same as push
        st.add(2,6);//add element at particular idx
        st.addFirst(0);//add to bottom of stack 
        System.out.println(st.capacity());//return the current capacity of stack
        System.out.println(st.size());//return no of elements 
        @SuppressWarnings("unused")
        int ans=st.elementAt(2);
        st.reversed();
        for (int i : st) {
            System.out.println(i); 
        }
        //peek
        System.out.println(st.peek());//top most element get printed
        System.out.println(st);//to print stack in order 
        st.pop();//to remove the last element of stack
        System.out.println(st);
        System.out.println("size of stack is  "+st.size());//to print stack
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        
    }
    
}
