package todo.Dynamic;

public class Q509 {
    public int fib(int n) {
        if (n<=1){
            return n;
        }
        int []dp = new int[n+1];
        dp[1] = 1;
        dp[0] = 0;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
