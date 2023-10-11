import java.io.*;
public class Main {
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        //Scanner 보다 BufferedReader 가 더 좋아서 개선
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        dp = new int[41][2]; // 제한조건 40보다 작거나 같다
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }
}