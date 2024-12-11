import java.util.*;
public class sumofarray_from_to {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int sum = 0 ;
        System.out.println("enter the size of array :");
        int s = sc.nextInt();
        int m [] = new int[s+1];
        System.out.println("enetr the array element :");
        for (int i=1;i<=s;i++){
            m[i]=sc.nextInt();
        }
        for(int i=1;i<=s;i++){
            m[i]+=m[i-1];
        }
        System.out.println("enter the no of quares to be asked");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
        System.out.println("enter the (from and to) to print sum:");
        int f = sc.nextInt();
        int l = sc.nextInt();
        sum = m[l]-m[f-1];
        System.out.println("the sum of array ="+sum);
        }
        sc.close();
    }        


    
}
