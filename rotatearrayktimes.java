import java.util.*;
public class rotatearrayktimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
