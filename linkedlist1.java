public class linkedlist1 {
    private static class node{
        private int data ;//value 
        private node next ;//address of next element
        public node (int data){//constructor
            this.data=data;//accepts values 
        }
    }
    public static void printll(node head){//printing ll in recursion 
    if(head==null) return;
        System.out.println(head.data);
        printll(head.next);
    }
    public static int length(node a){//finding the length
        int count =0;
        while(a!=null){
            count++;
            a=a.next;
        }
        return count;
    }
    public static node reverse (node head){
        if(head.next==null) return head;
        node nh = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return nh;
    }
    public static void main(String[] args) {
        node a=new node(5);
        //System.out.println(a.next);//null
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
        //now it is linkedlist
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);//for printing ll
        //or
        node temp=a;
        for(int i=1;i<=5;i++){//if we know the size 
            System.out.println(temp.data+" ");
            temp=temp.next;
        } 
        while(temp!=null){//printing the list without knowing length 
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        printll(a);
        int len=length(a);
        System.out.println("length of linked list is "+len);
        node t=reverse(a);
        printll(t);


    }
    
}
