import java.util.*;
public class recursion2 {
    static void sum(int num,int n){
        if(n==1){//base case 
            System.out.println(num);
            return;
        }
        sum(num,n-1);//recursive work
        System.out.println(n*num);//self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value :");
        int num=sc.nextInt();
        int n=sc.nextInt();
        sum(num,n);
        sc.close();
    }
    
}
