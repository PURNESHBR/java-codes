import java.util.*;
public class prefixsum {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of array :");
        int s = sc.nextInt();
        int m [] = new int[s];
        System.out.println("enetr the array element :");
        for (int i=0;i<s;i++){
            m[i]=sc.nextInt();
        }
        int pre[]=new int[s];
        pre[0]=m[0];
        for (int i=1;i<s;i++){
            pre[i]=pre[i-1]+m[i];
        }
        System.out.println("the prefixsum array are");
        for (int i=0;i<s;i++){
            System.out.println(pre[i]);
        }  
        sc.close();  
    }
}
