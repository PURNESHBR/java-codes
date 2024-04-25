import java .util.*;
public class chechnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int s = sc.nextInt();
        int m[] = new int [s];
        System.out.println("enter the array element :");
        for (int i = 0;i <s ;i++){
            m[i]=sc.nextInt();
        }
        int frq[] = new int [100005];
        for ( int i = 0;i < s; i++){
            frq[m[i]]++;
        }
        System.out.println("enter the no of times to be scarched :");
        int c = sc.nextInt();
        for(int i=0;i<c;i++){
            System.out.println("enetr the no to be searched :");
            int n = sc.nextInt();
            if (frq[n]>0){
                System.out.println("no of times the num is present :"+frq[n]);
            }
            else{
                    System.out.println("the num is not present");
                }
            }
            sc.close();
        }
    }
                
            
        

    
    

