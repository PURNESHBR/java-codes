import java.util.*;
public class print_parmutation {
    public static void printp(String str,String s ,List<String> l ){
        if(str.equals("")){
            l.add(s);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left =str.substring(0,i);
            String right = str.substring(i+1);
            String rem= left+right;
            printp(rem,s+ch,l);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> l = new ArrayList<>();
        printp(str,"",l);//call by reference in java
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    /*     for (String s  : l) { foreach
            System.out.println(s);
        }*/
    }
    
}
