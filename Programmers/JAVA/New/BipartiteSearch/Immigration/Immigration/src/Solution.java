import java.util.*;
public class Solution {

    public long solution(int n, int[] times) {
        Arrays.sort(times); // 심사 시간을 오름차순으로 정렬

        // 탐색범위의 시작과 끝을 정함
        long left = 1; // 최소 시간
        long right = (long) times[times.length - 1] * n; // 최대 시간 (가장 오래 걸리는 심사대에서 모두 심사하는 경우)

        long answer = right;

        while (left <= right) {
            long mid = (left + right) / 2; // 중간 시간
            long total = 0; // 심사를 받은 사람 수

            // 각 심사대에서 중간 시간 동안 처리할 수 있는 사람 수 계산
            for (int i = 0; i < times.length; i++) {
                total += mid / times[i];
            }

            if (total >= n) {
                // 중간 시간 동안 처리한 사람 수가 기다리는 사람 수보다 많으면 시간을 줄여서 다시 탐색
                if (mid < answer) {
                    answer = mid;
                }
                right = mid - 1;
            } else {
                // 중간 시간 동안 처리한 사람 수가 기다리는 사람 수보다 적으면 시간을 늘려서 다시 탐색
                left = mid + 1;
            }
        }

        return answer;
    }


}
