import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();//hashset is not in order 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        if(set.contains(1)){
            System.out.println("element exist");
        }else{
            System.out.println("element not exist");
        }
        set.remove(1);
        System.out.println("set size ="+set.size());
        System.out.println(set);//print all elements 
        //iterator to iterate in hashmap
        Iterator it = set.iterator();
        while(it.hasNext()){//it.hasnext return true if there is next element in hashset false if there is not element
            System.out.println(it.next());//it.next traverse in hashset to print 
        }

    }
    
}
