import java . util.*;
public class bubble2 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int r=1;
        int m[] = {1,2,3,4};
        int  p = m.length;
        for(int i=0;i<p-1;i++){
            for ( int j=0;j<p-i-1;j++){
               System.out.print(r);
                if(m[j]>m[j+1]){
                   int t=m[j+1];
                    m[j+1]=m[j];
                    m[j]=t;
              }
            }
        }
        System.out.println("the sorted element are ");
        for(int e =0;e<p;e++){
            System.out.println(m[e]);
        }
        sc.close();

    }

    }
    

