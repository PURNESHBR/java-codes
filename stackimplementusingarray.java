import java.util.*;
public class stackimplementusingarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of stack");
        int n=sc.nextInt();
        int[] st=new int[n];
        int top=-1;
        while(true){
            System.out.println("enter 1 for push");
            System.out.println("enter 2 for pop");
            System.out.println("enter 3 for peek");
            System.out.println("enter 4 for display");
            System.out.println("enter 5 for size");
            System.out.println("enter 6 for exit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("enter the element to be pushed");
                int x=sc.nextInt();
                if(top==n-1){
                    System.out.println("stack overflow");
                }
                else{
                    top++;
                    st[top]=x;
                }
            }
            else if(choice==2){
                if(top==-1){
                    System.out.println("stack underflow");
                }
                else{
                    int x=st[top];
                    top--;
                    System.out.println("the element popped is "+x);
                }
            }
            else if(choice==3){
                if(top==-1){
                    System.out.println("stack underflow");
                }
                else{
                    System.out.println("the top element is "+st[top]);
                }
            }
            else if(choice==4){
                if(top==-1){
                    System.out.println("stack underflow");
                }
                else{
                    for(int i=top;i>=0;i--){
                        System.out.print(st[i]+" ");
                    }
                    System.out.println();
                }
            }
            else if(choice==5){
                System.out.println("the size of stack is "+(top+1));
            }
            else if(choice==6){
                System.exit(0);
            }
        }
    }
}
