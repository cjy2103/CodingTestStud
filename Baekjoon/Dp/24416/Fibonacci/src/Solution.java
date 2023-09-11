import java.util.Scanner;

public class Solution {

    public int[] solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result1 = fibFun(n);
        int result2 = fibDp(n);

        return new int[]{result1, result2};
    }
    private int fibFun(int n) {
        if(n == 1 || n == 2){
            return 1;
        } else {
            return(fibFun(n-1) + fibFun(n-2));
        }
    }

    private int fibDp(int n) {
        int count = 0;
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            count++;
        }
        return count;
    }
}
