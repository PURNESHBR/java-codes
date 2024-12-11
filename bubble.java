import java.util.*;
public class bubble {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of elements in array:");
        int a = sc.nextInt();
        int m[] = new int[a];
        System.out.println("enter the elements of array : ");
        for (int e=0;e<a;e++){
            m[e]=sc.nextInt();
        }
        int p = m.length;
        System.out.println("the length of array is :"+p);
        for (int i=0;i<p-1;i++){
            for (int j=0;j<p-i-1;j++){
                if (m[j]>m[j+1]){
                    int f = m[j];
                    m[j]=m[j+1];
                    m[j+1]=f;
                }

            }
        }
        System.out.println("the array arranged in ascending order are :");
        for (int q=0;q<a;q++){
            System.out.print(m[q]+" ");
        }
        sc.close();
    }
    
}
