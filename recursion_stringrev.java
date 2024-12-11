import java.util.*;
public class recursion_stringrev {
    public static String stringrev(String str,int idx){
        if(idx==str.length()){
            return "";
        }
        return stringrev(str,idx+1)+str.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        System.out.println(stringrev(str,0));
        sc.close();

    }
    
}
