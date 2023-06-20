import java.util.*;
public class Solution {
    public int solution(int N, int number) {
        // N 사용 횟수에 대한 Set 배열 초기화
        Set<Integer>[] dp = new Set[9];
        for (int i = 1; i < 9; i++) {
            dp[i] = new HashSet<>();
        }

        //N과 number이 같으면 1리턴
        if(N == number){
            return 1;
        }
        // N 사용 횟수가 1인 경우 N을 반복해서 만들 수 있는 수 추가
        dp[1].add(N);

        // 2번부터 8번까지 N 사용 횟수를 증가시키며 가능한 경우 체크
        for (int i = 2; i < 9; i++) {
            // N 사용 횟수가 i인 경우
            int num = Integer.parseInt(Integer.toString(N).repeat(i));
            dp[i].add(num);

            // 사칙연산을 활용하여 number를 만들 수 있는 경우 체크
            for (int j = 1; j < i; j++) {
                for (int operand1 : dp[j]) {
                    for (int operand2 : dp[i - j]) {
                        dp[i].add(operand1 + operand2);
                        dp[i].add(operand1 - operand2);
                        dp[i].add(operand1 * operand2);
                        if (operand2 != 0) {
                            dp[i].add(operand1 / operand2);
                        }
                    }
                }
            }

            // number가 생성될 수 있는 최소 사용 횟수인지 확인
            if (dp[i].contains(number)) {
                return i;
            }
        }

        // number를 만들 수 없는 경우 -1 반환
        return -1;
    }
}