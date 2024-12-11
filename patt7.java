import java.util.*;
public class patt7 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the no of rows ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){  //upper half
            for(int j=1;j<=n-i;j++){ //space
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){  //star
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){  //lower half
            for(int j=1;j<=n-i;j++){ //space
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){  //star
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
