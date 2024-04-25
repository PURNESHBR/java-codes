import java.util.*;
public class patt5 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the no of rows ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
