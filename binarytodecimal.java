import java.util.*;
public class binarytodecimal {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the binary number ");
        int bin =sc.nextInt();
        int ans = 0;
        int pw = 1;
        while (bin>0){
            int unit_digit = bin%10;
            ans+=(unit_digit*pw);
            bin/=10;
            pw*=2;
        }
        System.out.println("the decimal number is "+ans);
        sc.close();
    }
    
}
