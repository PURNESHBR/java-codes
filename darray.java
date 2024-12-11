import java.util.*;
public class darray {
    public static void main (String args[]){
    Scanner sc= new Scanner (System.in);
    System.out.println("enter the no of rows and column:");
    int row = sc.nextInt();
    int col = sc.nextInt();
    int num[][]=new int [row][col];
    System.out.println("enter the matrix element :");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
         num[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter the number to be searched:");
    int x = sc.nextInt();
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(num[i][j]==x){
                System.out.println("num found at the location :"+i+","+j);//if the number is present more than once then it will be printed , if u dont need then put break  
            }
        }
    }
    sc.close();
    }
    
}
