import java .util.*;
public class transpose_of_2_matrix{
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the no of row and column in which no of row and no of column should be equal : ");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int m [][] = new int [r][c];
    System.out.println("enter the array element");
    for ( int i = 0 ; i < r; i ++ ){
        for ( int j =0 ; j < c ; j++){
            m[i][j]= sc.nextInt();
        }
    }
    for(int i=0;i<c;i++){
        for(int j=i;j<r;j++){
            int temp = m[i][j];
            m[i][j]=m[j][i];
            m[j][i]=temp;
        }
    }
    System.out.println("the transpose of 2 matrix are :");
    for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            System.out.print(" "+m[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
}


}
