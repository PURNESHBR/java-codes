import java.util.*;
public class copy_stack_in_new_stacj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        //reverse stack
        
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();//or only we cane write rt.push(st.pop())
        }
        Stack<Integer> gt=new Stack<>();
        while(rt.size()>0){
            int x=rt.peek();
            gt.push(x);
            rt.pop();//or only we cane write st.push(st.pop())
        }
        System.out.println(gt);
        System.out.println("enter the element to be pushed");
        int e=sc.nextInt();
        System.out.println("enter the index where the element is to be placed");
        int idx=sc.nextInt();
        while(gt.size()>idx-1){
            st.push(gt.pop());
        }
        st.push(e);
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        sc.close();
    }
    
}
