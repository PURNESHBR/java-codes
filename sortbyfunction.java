import java.util.*;
public class sortbyfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int s = sc.nextInt();
        int m[]=new int [s];
        System.out.println("enter the array element");
        for(int i =0 ;i<s;i++){
            m[i]=sc.nextInt();
        }
        Arrays.sort(m);
        System.out.println("the sorted elements are ");
        for(int i=0;i<s;i++){
            System.out.print(m[i]);
        }
        sc.close();
    }
    
}
