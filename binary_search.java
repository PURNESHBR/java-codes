import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the sorted array elements");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int key=sc.nextInt();
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("element found at index "+mid);
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(low>high){
            System.out.println("element not found");
        }
        sc.close();
    }
}
