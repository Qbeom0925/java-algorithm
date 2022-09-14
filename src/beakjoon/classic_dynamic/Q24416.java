package beakjoon.classic_dynamic;

import java.util.Scanner;

public class Q24416 {
    static int cnt;
    static int dpCnt = 0;


    static int fib(int n) {
        if(n==1 || n==2) {
            cnt++;
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }

    static int fibonacci(int n) {
        int[] dp = new int[n];
        dp[1] = dp[2] =1;

        for(int i=2; i<n; i++) {
            dpCnt++;
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int i = sc.nextInt();
        fib(i);
        fibonacci(i);


        System.out.println(cnt+" "+dpCnt);
    }
}
