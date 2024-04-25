import java.util.*;
public class swaparray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the no of array ");
        int n = sc.nextInt();
        int m[]=new int [n];
        System.out.println("enetr the array element");
        for (int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        int j = n-1;
        int temp=0;
        for(int i=0;i<j;i++){
            temp=m[i];
            m[i]=m[j];
            m[j]=temp;
            j--;
        }
        System.out.print("tne reverse of arrays are  :");
        for(int i=0;i<n;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
    
}
