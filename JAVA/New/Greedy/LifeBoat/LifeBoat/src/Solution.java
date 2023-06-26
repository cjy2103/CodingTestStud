import java.util.*;
public class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 사람들을 몸무게 순으로 오름차순 정렬
        int answer = 0;
        int left = 0; // 가장 가벼운 사람의 인덱스
        int right = people.length - 1; // 가장 무거운 사람의 인덱스

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있는 경우
                left++; // 가장 가벼운 사람을 태웠으므로 인덱스 증가
            }
            right--; // 가장 무거운 사람은 항상 태우므로 인덱스 감소
            answer++; // 구명보트를 사용한 횟수 증가
        }

        return answer;
    }
}
