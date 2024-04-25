import java.util.*;
public class even {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter the value of n ");
        int n = sc.nextInt();
        for(int i = 2; i<=n ; i=i+2){
        System.out.println (i);
        }
        sc.close();
    }
    
}
