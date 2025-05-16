import java.util.Scanner;
public class celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temp in celcius");
        double c = sc.nextDouble();
        double f = (c*9/5)+32;
        System.out.println("the temp in fahrenheit is "+f);
        sc.close();
    }
}
