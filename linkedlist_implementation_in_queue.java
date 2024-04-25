import java.util.*;
public class linkedlist_implementation_in_queue {
    public static class node{//user defined data type
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class queueLL{//user defined data structure
        node head=null;
        node tail=null;
        int size=0;
        public void add(int x){
            node temp=new node(x);
            if(size==0) head=tail=temp;
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public int peek(){
            if(size==0) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.val;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return ;
            }
            node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
    
}
