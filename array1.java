import java.util.*;
public class array1 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of the array ");
        int sum=0;
        int size = sc.nextInt();
        int num[]=new int [size];
        //Arrays class can do many inbuilt functions like sort,search ect ex:Arrays.sort(num);
        System.out.println("enter the array :");
        for (int i = 0 ; i<size ; i++){
            num[i]=sc.nextInt();
        }
        for (int i = 0 ; i<size ; i++){
            sum = sum + num[i];
        }
        System.out.println("the sum of array = "+sum);
        sc.close();
        


    }
    
}
