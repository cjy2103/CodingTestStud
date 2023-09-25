public class Solution {
    public int solution(int N){
        int [] dp = new int[N + 1];
        dp[1] = 0; // 1은 이미 1이기 때문에 연산 X

        for(int i = 2; i<=N; i++){
            dp[i] = dp[i-1] + 1;

            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }

        }

        return dp[N];
    }
}
