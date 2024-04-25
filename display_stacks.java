import java.util.*;
public class display_stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
       /*  int m[]=new int [n];//printing using array 
        for(int i=n-1;i>=0;i--){
            int x=st.pop();
            m[i]=x;
        }
        for(int i=0;i<n;i++){
            System.out.print(m[i]+" ");
            st.push(m[i]);
        }
        System.out.println();*/
        display(st);
        sc.close();

    }

    public static void display(Stack<Integer> st) {
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
}

    
