import java.util.*;
public class functions3 {
    static void solve(int a,int b){
        int sum;
        sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        a=sc.nextInt();
        b=sc.nextInt();
        solve(a,b);
        sc.close();
    }
    
}
