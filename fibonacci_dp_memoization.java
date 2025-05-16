import java.util.*;

public class fibonacci_dp_memoization {
    public static int f(int n, int[] dp) {
        if (n <= 1) 
            return n;
        if (dp[n] != -1) 
            return dp[n];
        return dp[n] = f(n - 1, dp) + f(n - 2, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        
        System.out.println(f(n, dp));
    }
}
