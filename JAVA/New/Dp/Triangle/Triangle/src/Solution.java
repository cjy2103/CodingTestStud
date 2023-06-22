import java.util.*;

public class Solution {
    public int solution(int[][] triangle) {
        int height = triangle.length;

        // 다이나믹 프로그래밍을 위한 배열 생성 및 초기화
        int[][] dp = new int[height][triangle[triangle.length-1].length]; // 각 위치까지의 최댓값을 저장하는 역할
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = triangle[i][j];
            }
        }

        // 아래층부터 올라가면서 최댓값 갱신
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] += Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        System.out.println(Arrays.deepToString(dp));

        return dp[0][0]; // 꼭대기까지 올라가면서 누적된 최댓값 반환
    }
}
