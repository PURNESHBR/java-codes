public class linkedlist2 {
    private static class node{
        private int data;
        private node next;
        public node (int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        node head=null;
        node tail=null;
        void insertatend(int val){//inserting elements at the end
            node temp=new node(val);
            if(head==null){//for empty list 
                head=temp;
            }
            else{//for non empty tail
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            node temp=head;
            int c=0;
            while(temp!=null){
                c++;
                temp=temp.next;
            }
            return c;
        }
        void insertathead(int val){
            node temp = new node(val);
            if(head==null){//for empty list
                head=tail=temp;//or insertatend(val)
            }
            else{//for non empty list
                temp.next=head;
                head=temp;
            }
        }
        void insertat(int idx , int val){
            node t=new node(val);
            node temp=head;
            if(idx==size()){
                insertatend(val);
                return;
            }
            else if(idx==0){
                insertathead(val);
                return;
            }
            else if(idx<0){
                System.out.println("wrong index");
                return;
            }
            else if(idx>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int getat(int idx){
            node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteat(int idx){
            node temp=head;
            if(idx==0){
                head=head.next;
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size()-1){
                tail=temp;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatend(4);
        ll.insertatend(5);
        ll.display();
        System.out.println(ll.size());
        ll.insertathead(3);
        ll.display();
        ll.insertat(0, 2);
        ll.display();
        System.out.println(ll.getat(1));
        ll.deleteat(1);
        ll.display(); 
    }
    
}
