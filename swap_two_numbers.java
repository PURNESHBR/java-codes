public class swap_two_numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a ^ b;//XOR operation
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
