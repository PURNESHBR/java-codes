import java.util.*;
public class recursionfibunaci {
    static int fibunaci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibunaci(n-1)+fibunaci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        System.out.println(fibunaci(i));
        sc.close();
    }
    
}
