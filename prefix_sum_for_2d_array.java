import java.util.*;
public class prefix_sum_for_2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1,r1,l2,r2,sum;
        System.out.println("enter the no of rows and columns for 2d array : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m[][]=new int [r][c];
        System.out.println("enter the array elements : ");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                m[i][j]=m[i][j]+m[i][j-1];
            }
        }
        System.out.println("the sum of row is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                m[i][j]=m[i][j]+m[i-1][j];
            }
        }
        System.out.println("the sum of column is ");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the no of quares :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter the l1 and r1 value :");
            l1=sc.nextInt();
            r1=sc.nextInt();
            System.out.println("enter the l2 and r2 value :");
            l2=sc.nextInt();
            r2=sc.nextInt();
            if(l1>=1&&r1>=1)
            sum=m[l2][r2]-m[l1-1][r2]-m[l2][r1-1]+m[l1-1][r1-1];
            else
            sum=m[l2][r2];
            System.out.println("the sum of elements inside the given coordinates = "+sum);

        }
        sc.close();

    }
    
}
