public class stack_implimentation_in_array {
    public static class Stack{
       int arr[]= new int [5]; 
       int idx=0;
       void push(int x){
        if(Isfull()){
            System.out.println("stack is full");
            return;
        }
        arr[idx]=x;
        idx++;
       }
       int  pop(){
        if(idx==0){
            //System.out.println("stack is empty" );
            System.out.println("stack is empty");
            return -1;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
       }
       int peek(){
        if(idx==0){
            System.out.println("stack is empty");
            return -1;
        }
        int val=arr[idx-1];
        return val;
       }
       void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
       int size(){
        return idx;
       }
       boolean Isempty(){
        if(idx==0) return true;
        else  return false;
       }
       boolean Isfull(){
        if(idx==arr.length) return true;
        else return false;
       }
       int capacity(){
        return arr.length;
       }
    }
    public static void main(String[] args) {
        Stack st= new Stack ();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(4);
        System.out.println(st.peek()); 
        System.out.println(st.Isempty());
        st.push(5);
        System.out.println(st.Isfull());
        System.out.println(st.capacity());


    }
    
}
