import java.util.*;

public class sum{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = sc.nextInt();
        switch(i){
            case 1 : 
            System.out.println(a+b);
            break;
            case 2 :
            System.out.println(a-b);
            break;
            default :
            System.out.println("invalid");

        }
        sc.close();
    }
}
