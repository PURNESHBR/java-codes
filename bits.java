import java.util.*;
public class bits {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in );
        System.out.println("enter the value of n ");
        int n = sc.nextInt();
        System.out.println("enter the position");
        int pos = sc.nextInt();
        int bitMask=1<<pos;
        if((bitMask&n)==0){
            System.out.println("bit is 0");
        }else{
            System.out.println("bit is 1");
        }
        sc.close();

    }
    
}
