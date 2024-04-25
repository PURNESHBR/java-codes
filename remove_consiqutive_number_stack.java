import java.util.Stack;

public class remove_consiqutive_number_stack {
    public static int[] remove(int[]arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0) st.push(arr[i]);
            else if(st.peek()==arr[i]){
                if(i==arr.length-1){
                    st.pop();
                    break;
                }
                if(st.peek()==arr[i+1]){
                    st.pop();
                    st.push(arr[i]);
                }
                else{
                    st.pop();
                }
            }
            else st.push(arr[i]);
        }
        int arr1[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr1[i]=st.pop();
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,10,10,10,4,4,4,5,7,7,7,2};
        int res[]=remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
     
}
