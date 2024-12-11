import java.util.*;
public class max_num_occured_using_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array element");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0;i<n;i++){
            if(m.containsKey(a[i])){
                int f=m.get(a[i]);
                m.put(a[i], f+1);
            }
            else{
                m.put(a[i], 1);
            }
        }
        int max=0;
        int num=0;
        for (int i=0;i<n;i++){
            int g=m.get(a[i]);
            if(g>=max){
                max=g;
                num=a[i];
            }
        }
        System.out.println("maximum occured number is"+num);
        sc.close();

    }
    
}
