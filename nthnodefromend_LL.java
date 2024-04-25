public class nthnodefromend_LL {
    public static class node{
        int data;
        node next;
        node (int data){
            this.data=data;
        }
    }
    public static node nthnode(node head,int idx){
        int size=0;
        node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-idx+1;
        temp=head;
        for(int i=0;i<m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static node nthnodefastslow(node head,int idx){
        node slow=head;
        node fast=head;
        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static node removenthnode(node head,int idx){
        node slow=head;
        node fast=head;
        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node a=new node(5);
        node b=new node(3);
        node c=new node(9);
        node d=new node(10);
        node e=new node(15);
        //5 3 9 10 15
        a.next=b;//5->3 10 15
        //System.out.println(a.next);//address of b
        b.next=c;//5->3->9 10 15
        c.next=d;//5->3->9->10 15
        d.next=e;//5->3->9->10->15
        node q=nthnode(a, 3);
        node v=nthnodefastslow(a, 3);
        System.out.println(q.data);
        System.out.println(v.data);
        node w=removenthnode(a, 5);
        display(w);
        
    }
    
}
