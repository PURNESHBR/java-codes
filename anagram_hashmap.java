import java.util.*;
public class anagram_hashmap {
    static HashMap<Character,Integer> makefreq(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }
            else{
                int currval=mp.get(ch);
                mp.put(ch, currval+1);
            }
        }
        return mp;

    }
    public boolean isAnagram(String s,String t){
        if (s.length()!= t.length()) return false;
        else{
            HashMap<Character,Integer> h1=makefreq(s);
            HashMap<Character,Integer> h2=makefreq(t);
            return h1.equals(h2);
        }
    }
    
}
