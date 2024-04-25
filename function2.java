import java.util.*;
public class function2 {
    public static int CalculateMultiply (int a,int b ){
    int mul=a*b;
    return mul;
    }
    public static int CalculateAdd (int c,int d ){
        int sum = c+d;
        return sum;
    }
    public static int CalculateSub (int e , int f ){
        int sub = e-f;
        return sub;
    }
    public static double CalculateDiv (double g , double h ){
        double div = g/h;
        return div;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter two number for multiply :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = CalculateMultiply(a,b);
        System.out.println(mul); 
        System.out.println("enter two number for sum : ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = CalculateAdd(c, d);
        System.out.println(sum);
        System.out.println("enter 2 number for subtract : ");
        int e = sc.nextInt();
        int f = sc.nextInt();
        int sub = CalculateSub(e, f);
        System.out.println(sub);
        System.out.println("enter 2 number for divide :");
        double g = sc.nextInt();
        double h = sc.nextInt();
        double div = CalculateDiv(g, h);
        System.out.println(div);
        sc.close();
    }
    
}
