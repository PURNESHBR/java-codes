import java.util.Scanner;
public class inputmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows and columns for 1st matrix");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[][] arr1=new int[n1][m1];
        System.out.println("enter the array elements");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the no of rows and columns for 2nd matrix");
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int[][] arr2=new int[n2][m2];
        System.out.println("enter the array elements");
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int mul[][]=new int[n1][m2];
        if(n1==m2){
            for(int i=0;i<n1;i++){
                for(int j=0;j<m2;j++){
                    for(int k=0;k<n1;k++){
                        mul[i][j]+=(arr1[i][k]*arr2[k][j]);
                    }
                }
            }
        }else{
            System.out.println(" ERROR ");
        }
        int add [][]=new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                add[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("the sum of 2D array are :");        
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the multiplication of 2D array are :");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
