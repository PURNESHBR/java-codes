import java.util.*;
public class twopointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n=sc.nextInt();
        int m[]=new int[n];
        System.out.println("enter the array elements :");
        for (int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        int l=0;
        int temp=0;
        int h=n-1;
        while(l<h){
            if(m[l]%2==1&&m[h]%2==0){
                temp=m[l];
                m[l]=m[h];
                m[h]=temp;
                l++;
                h--;
            }
            if(m[l]%2==0)
            l++;
            if(m[h]%2==1)
            h--;
        }
        System.out.println("the new string is :");
        for(int i=0;i<n;i++){
            System.out.print(m[i]);
        }
        sc.close();

    }
    
}
