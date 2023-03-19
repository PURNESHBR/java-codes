import java.util.*;
public class add_of_2_matrisis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int m[][]=new int [r][c];
        int n[][]=new int [r][c];
        int p[][]=new int [r][c];
        System.out.println("enter the array1 elements : ");
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter the array2 elements : ");
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                n[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                p[i][j]=m[i][j]+n[i][j];
            }
        }
        System.out.println("the summ of 2D array are :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(" "+p[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
