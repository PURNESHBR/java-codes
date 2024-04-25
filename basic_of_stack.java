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
