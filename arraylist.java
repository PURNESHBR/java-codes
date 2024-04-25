import java.util.*;
public class arraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> l1 = new ArrayList<>();
        //Collections class can do many taks like search , sort ect in array list ex:Collections.sort(l1);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1.get(1));
        System.out.println(l1);
        for(int i=0;i<l1.size();i++)
        System.out.println(l1.get(i));
        l1.add(0,0);
        l1.set(5,6);
        l1.remove(5);
        l1.remove(Integer.valueOf(4));
        System.out.println(l1);
        sc.close();
        
    }
}