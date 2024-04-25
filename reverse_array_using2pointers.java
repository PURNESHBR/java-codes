import java.util.*;
public class reverse_array_using2pointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int n=sc.nextInt();
        int m[]= new int[n];
        System.out.println("enter the array elements :");
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        int l=0;int h=n-1;int temp;
        while(l<h){
            temp=m[l];
            m[l]=m[h];
            m[h]=temp;
            l++;
            h--;
        }
        System.out.println("the array is :");
        for(int i=0;i<n;i++)
        System.out.print(m[i]+" ");
         sc.close();
        
    }
    
}
