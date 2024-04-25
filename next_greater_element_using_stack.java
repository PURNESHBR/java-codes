import java.util.*;
public class next_greater_element_using_stack {
    public static void nextgreater(int arr[]){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int res[]=new int[n];
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0&&st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek(); 
            }
            st.push(arr[i]);
        }
        System.out.println("next greater element is ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        System.out.println("enter a array ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nextgreater(arr);
        sc.close();

    }
    
}
