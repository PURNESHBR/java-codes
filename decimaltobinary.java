import java.util.*; 
public class decimaltobinary {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the decimal number ");
    int dec = sc.nextInt();
    int ans = 0;
    int pw = 1;
    while(dec>0){
        int parsy = dec%2;
        ans += (parsy*pw);
        pw*=10;
        dec/=2;
    }
    System.out.println("the binary number is "+ans);
    sc.close();

}    
}
