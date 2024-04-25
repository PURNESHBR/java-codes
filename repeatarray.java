import java.util.*;
public class repeatarray {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of array :");
        int si = sc.nextInt();
        int m [] = new int[si];
        int p = 0;
        System.out.println("enetr the array element :");
        for (int i=0;i<si;i++){
            m[i]=sc.nextInt();
        }
        for ( int i=0;i<si;i++){
            for (int j=i+1;j<si;j++){
                if(m[i]==m[j]){
                    System.out.println("the 1st repeated value is : "+m[i]);
                    ++p;
                    break;
                }
                if (p==1){
                    break;
                }
            }
        }
        if ( p==0 ){
            System.out.println("-1");
        }
        sc.close();
    } 
    
}
