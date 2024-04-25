import java.util.*;
public class largearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enetr the array size :");
        int s = sc.nextInt();
        int m [] = new int [s];
        int p = 0 ;
        System.out.println("enter the value of array :");
        for ( int i = 0 ; i < s ; i ++){
            m[i] = sc.nextInt();
        }
        for ( int i = 0 ; i < s ; i ++ ){
            if ( m[i]>p ){
                p = m[i];
            }
        }
        System.out.println("tne largest array is :"+p);
        sc.close();

    }
    
}
