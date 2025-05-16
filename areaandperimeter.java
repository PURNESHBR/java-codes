import java.util.*;
public class areaandperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius-1 of circle");
        double r1 = sc.nextDouble();
        System.out.println("enter radius-2 of circle");
        double r2 = sc.nextDouble();
        System.out.println("area of circle-1 before swapping is "+(3.14*r1*r1));
        System.out.println("area of circle-2 before swapping is "+(3.14*r2*r2));
        System.out.println("perimeter of circle-1 before swapping is  "+(2*3.14*r1));
        System.out.println("perimeter of circle-2 before swapping is "+(2*3.14*r2));
        r1=r1+r2;
        r2=r1-r2;
        r1=r1-r2;
        System.out.println("area of circle-1 after swapping is "+(3.14*r1*r1));
        System.out.println("area of circle-2 after swapping is "+(3.14*r2*r2));
        System.out.println("perimeter of circle-1 after swapping is "+(2*3.14*r1));
        System.out.println("perimeter of circle-2 after swapping is "+(2*3.14*r2));
        sc.close();
    }
}
