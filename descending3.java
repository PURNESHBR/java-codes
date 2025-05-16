import java.util.*;
public class descending3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the 3 numbers ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1);
            if(n2>n3){
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n2);
            }
        }else if(n2>n1 && n2>n3){
            System.out.println(n2);
            if(n1>n3){
                System.out.println(n1);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n1);
            }
        }else{
            System.out.println(n3);
            if(n1>n2){
                System.out.println(n1); 
                System.out.println(n2);
            }else{
                System.out.println(n2);
                System.out.println(n1);
            }
        }
        sc.close();
   }
}
