import  java.util.*;
public class count0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s ,i=0,t;
        System.out.println("enter the array size ");
        s=sc.nextInt();
        int m[]= new int [s];
        int j = s-1;
        System.out.println("enter the array element only 1 or 0 : ");
        for(int k=0;k<s;k++){
            m[k]=sc.nextInt();
        }  
        while(i<j){
            if(m[i]==1&&m[j]==0){
                t=m[i];
                m[i]=m[j];
                m[j]=t;
                ++i;
                --j;
            }
            if(m[i]==0)
            ++i;
            if(m[j]==1)
            --j;

        }
        System.out.println("the array elements are ");
        for(int a=0;a<s;a++)
        {
            System.out.println(m[a]);
        }
        sc.close();
    }
    
}
