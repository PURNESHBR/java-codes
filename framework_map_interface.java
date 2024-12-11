import java.util.*;
public class framework_map_interface {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<>();//unordered
        LinkedHashMap<Integer,String> ls=new LinkedHashMap<>();//ordered
        TreeMap<Integer,String> tm=new TreeMap<>();//sorted in order of keys
        m.put(1, "purn");
        m.put(2, "ayu");
        m.put(3, "sai");
        for(var i:m.keySet()){
            System.out.println(i);
        }
        for(var e:m.entrySet()){
            System.out.println(e);
        }
        System.out.println(m);
        System.out.println(m.get(2));
        System.out.println(m.containsKey(4));
    }
    
}
    
