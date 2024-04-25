import java.util.*;
public class allbits {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println("enter the position ");
        int pos = sc.nextInt();
        int BitMask = 1<<pos;
        System.out.println("enter the bit manipulation to be done : 1 get bit , 2 set bit , 3 clear bit , 4 update bit ");
        int i = sc.nextInt();
        switch(i){
            case 1:
            if((BitMask&n)==0){
                System.out.println("bit is 0 ");
            }else {
                System.out.println("bit is 1 ");
            }
            break;
            case 2:
            int newnumber = BitMask|n;
            System.out.println(newnumber);
            break;
            case 3:
            int notbitmask = ~(BitMask);
            int nenumber = notbitmask&n;
            System.out.println(nenumber);
            break;
            case 4:
            System.out.println("enter the operation to be done 1 or 0");
            int oper = sc.nextInt();
            if (oper == 1){
                int nnumber = BitMask|n;
                System.out.println(nnumber);
            }else{
                int nobitmask = ~(BitMask);
                int number = nobitmask&n;
                System.out.println(number);
            }
            break;
            default:
            System.out.println("invalid ");
            break;
        }
        sc.close();
        
    }
    
}
