import java.util.*;
public class framework_set_interface {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();//set is to keep unique elements in it a number can't be repeted ,hashset is unordered
        LinkedHashSet<Integer> st=new LinkedHashSet<>();//this set is ordered
        TreeSet<Integer> t =new TreeSet<>();//if we enter elements in any order it will be stored in sorted order in increasing order
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s);
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(2);
        System.out.println(s);
        s.remove(2);
        System.out.println(s.contains(2));
        System.out.println(s.size());
    }
    
}
