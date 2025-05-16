import java.util.*;
public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value :");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
        sc.close();
    }
}
