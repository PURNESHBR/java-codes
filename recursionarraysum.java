import java.util.*;
public class recursionarraysum {
    static int arraysum(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        return arraysum(arr,idx+1)+arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arraysum(arr,0));
        sc.close();
    }
    
}
