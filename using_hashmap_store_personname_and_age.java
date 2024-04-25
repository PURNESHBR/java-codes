import java.util.*;
public class using_hashmap_store_personname_and_age {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("aakash", 21);
        m.put("purn",19);
        m.put("sai",18);
        m.put("ayush", 17);
        System.out.println(m.get("purn"));
        m.put("purn", 21);//to change the value or update
        System.out.println(m.remove("aakash"));//takes the key and removes the key from map
        System.out.println(m.remove("hamshi"));//null
        System.out.println(m.containsKey("purn"));//true for key
        m.putIfAbsent("yash", 19);
        System.out.println(m.keySet());//to print all the keys
        System.out.println(m.values());//to print all the values
        System.out.println(m.entrySet());//to print all key and values
        for (var key : m.keySet()) {//foreach syntax 
            System.out.printf("Age of %s is %d",key,m.get(key));
           // or  System.out.println("age of "+key+"is"+m.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : m.entrySet()){ 
            System.out.printf("age of %s i %d",e.getKey(),e.getValue());

        }

        

    }
    
}
