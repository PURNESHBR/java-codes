import java.util.*;
public class recursion_string {
    static String stringremove(String str, int idx,char c){ 
        if(idx==str.length()){
            return "";
        }
        String smallans=stringremove(str,idx+1,c);
        char curr=str.charAt(idx);
        if(curr!=c){
            return curr+smallans;
        }else{
            return smallans;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string");
        String str =sc.nextLine();
        System.out.println("enter the character");
        char c=sc.next().charAt(0);
        System.out.println(stringremove(str,0,c)); 
        sc.close();

    }
    
}
