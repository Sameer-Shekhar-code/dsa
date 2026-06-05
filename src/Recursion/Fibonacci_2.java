package Recursion;

import java.util.Arrays;

public class Fibonacci_2 {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    public static int fibo(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        //base condition
        if(n<2){
            return n;
        }
        if(dp[n] != -1)
            return dp[n];

        return dp[n]= fibo(n-1) + fibo(n-2);
    }
}
