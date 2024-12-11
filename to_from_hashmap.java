import java.util.*;

public class to_from_hashmap {
    public static String getstart(HashMap<String,String> tick){
        HashMap<String,String> revmap=new HashMap<>();
        for(String key:tick.keySet()){
            revmap.put(tick.get(key), key);
        }
        for(String key:tick.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null; 
    
    }
    public static void main(String[] args) {
        HashMap<String,String> ticket=new HashMap<>();
        ticket.put("chennai", "bengaluru");
        ticket.put("mumbai", "delhi");
        ticket.put("goa", "chennai");
        ticket.put("delhi", "goa");
        String start=getstart(ticket);
        while(ticket.containsKey(start)){
            System.out.print(start+"->");
            start=ticket.get(start);
        }
        System.out.println(start);

    }
    
}
