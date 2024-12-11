import java.util.Stack;

public class stack_implementation_in_LL {
    public static class node{//user defined data type 
        int val;
        node next;
        node(int val){
            this.val=val;
        }
        public static class Stack{//user defined data structure 
            private node head=null;
            private  int size=0;
            void push(int x){
                node temp=new node (x);
                temp.next=head;
                head=temp;
                size++;
            }
            void Display(){
                node temp=head;
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
                System.out.println();
            }
            int size(){
                return size;
            }
            int pop (){
                if(head==null){
                    System.out.println("stack is empty");
                    return -1;
                }
                int x=head.val;
                head=head.next;
                return x;
            }
            int peek(){
                if(head==null){
                    System.out.println("stack is empty");
                    return -1;
                }
                return head.val;
            }
            boolean Isempty(){
                if(size==0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.size());
        st.pop();
        st.push(4);
        System.out.println(st.peek()); 
        System.out.println(st.isEmpty());
        st.push(5);
        System.out.println(st.capacity()); 
        
    }
    
}
