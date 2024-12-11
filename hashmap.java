import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();//unorder map
        map.put("India", 120);
        map.put("china", 150);
        map.put("usa", 85);
        System.out.println(map);
        map.put("china", 180);//modify or update values
        System.out.println(map);
        if(map.containsKey("India")){
            System.out.println("present");
        }
        if(map.containsValue(120)){
            System.out.println("present");
        }
        System.out.println(map.get("India"));
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.print(" "+key+" "+map.get(key));
        }
        map.remove("china");


    }
    
}
