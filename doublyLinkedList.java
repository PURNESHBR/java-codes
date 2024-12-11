public class doublyLinkedList {
    static class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val=val; 
        }
    }
    public static void displayhead(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displaytail(node tail){
        node temp=tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayrandom(node random){
        node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertatidx(node head,int idx,int val){
        node t=new node(val);
        node s=head;
        for(int i=1;i<idx;i++){
            s=s.next;
        }
        node r=s.next;
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
    public static void main(String[] args) {
        //4 10 2 99 13
        node a=new node(4);
        node b=new node(10);
        node c=new node(2);
        node d=new node(99);
        node e=new node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        //displayhead(a);
        //displaytail(e);
        //displayrandom(c);
        insertatidx(a, 3, 1);
        displayhead(a);

        
    }
    
}
