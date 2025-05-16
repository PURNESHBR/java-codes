import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=n-1;i>=n-2;i--){
            if(i==n-2){
                System.out.println("second largest element is "+arr[i]);
                break;
            }
        }
        sc.close();
    }
}
