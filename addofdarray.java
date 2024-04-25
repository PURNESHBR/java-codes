import java.util.*;
public class addofdarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int add = 0 ;
        System.out.println("enter the no of row and column ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int m [][] = new int [row][col];
        System.out.println("enter the array element");
        for ( int i = 0 ; i < row ; i ++ ){
            for ( int j =0 ; j < col ; j++){
                m[i][j]= sc.nextInt();
            }
        }
        System.out.println("the array element are :");
        for ( int i = 0 ; i < row ; i ++){
            for ( int j = 0 ; j < col ; j ++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        for ( int i = 0 ; i < row ; i ++ ){
            for ( int j = 0 ; j < col ; j ++ ){
                add += m[i][j];
            }
        }
        System.out.println("the add of array is : "+add);
        sc.close();
    }

    
}
