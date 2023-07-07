import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 논문 인용 횟수를 오름차순으로 정렬

        int n = citations.length;
        int h = 0; // H-Index 후보값

        for (int i = 0; i < n; i++) {
            int minCitations = Math.min(citations[i], n - i); // 현재 논문의 인용 횟수와 남은 논문 개수 중 작은 값을 구함
            h = Math.max(h, minCitations); // H-Index 후보값 갱신
        }

        return h;
    }
}