import java.util.*;
public class reverse_a_queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q1=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("enter the value of k less than 5");
        int k=sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<k;i++){
            st.push(q.remove());
        }
        while(q.size()!=0){
            q1.add(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        while(q1.size()!=0){
            q.add(q1.remove());
        }
        System.out.println(q);
        sc.close();
        

    }
    
}
