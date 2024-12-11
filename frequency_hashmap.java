import java.util.*;
public class frequency_hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("enter the no of elements"); 
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i], 1);
            }
        }
        System.out.println("elements occured more than "+n/3+" times are");
        Set<Integer> f=map.keySet();
        for(int key:f){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
        sc.close();

    }
    
}
