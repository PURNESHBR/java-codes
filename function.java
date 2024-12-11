import java.util.*;
public class function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a name");
        String name = sc.nextLine();
        printMyName(name);
        sc.close();
    }
    
}
