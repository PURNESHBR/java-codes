import java.util.*;
public class menudriven {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int input ;
        do{
            System.out.println("enter the marks");
            int marks=sc.nextInt();
            if(marks>=90&&marks<=100){
                System.out.println("good");
            }
            else if(marks>=60&&marks<=89){
                System.out.println("good as well");
            }
            else if (marks>=0&&marks<=59){
                System.out.println("pass");
            }
            else{
                System.out.println("invalid");
            }
            System.out.println("to continue press 1 for yes press 0 for no");
            input=sc.nextInt();
        } while(input==1);
        sc.close();
    }
    
}
