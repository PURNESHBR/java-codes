import java.util.*;
public class prefixsumwithoutusinganotherarray {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of array :");
        int s = sc.nextInt();
        int m [] = new int[s];
        System.out.println("enetr the array element :");
        for (int i=0;i<s;i++){
            m[i]=sc.nextInt();
        }
        for(int i=1;i<s;i++){
            m[i]+=m[i-1];
        }
        System.out.println("the prefixsum of array is ");
        for(int i=0;i<s;i++){
            System.out.println(m[i]);
        }
        sc.close();
    }

}
