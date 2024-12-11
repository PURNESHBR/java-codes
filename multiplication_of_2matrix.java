import java.util.*;
public class multiplication_of_2matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of row and column for matrix 1 :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int m[][]=new int[r1][c1];
        System.out.println("enter the elements of matrix 1 : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the no of row and column for matrix 2 :");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int n[][]=new int[r2][c2];
        int mul[][]=new int[r1][c2];
        System.out.println("enetr the elements of matrix 2 :");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                n[i][j]=sc.nextInt();
            }
        }
        if(c1==r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        mul[i][j]+=(m[i][k]*n[k][j]);
                    }
                }
            }
        }else{
            System.out.println(" ERROR : ENTERED ROWS AND COLUMNS ARE NOT MATCHING TRY SOME ANOTHER VALUE . TIP:FOR MULTIPLICATIONN COLUMN 1 = ROW 2 ");
        }
        System.out.println("the multiplication of 2 matrix are : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(" "+mul[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    } 
}
