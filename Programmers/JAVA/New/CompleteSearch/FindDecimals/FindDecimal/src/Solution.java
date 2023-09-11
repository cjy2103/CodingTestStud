import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int solution(String numbers) {
        int answer = 0;
        List<Integer> digits = new ArrayList<>();

        // 숫자 조합 생성을 위해 종이 조각의 숫자들을 List에 저장
        for(int i=0;i<numbers.length();i++){
            digits.add(Integer.parseInt(String.valueOf(numbers.charAt(i))));
        }
        // [1,7] 저장

        // 숫자 조합 생성 (중복 숫자 제외를 위해 Set 사용)
        Set<Integer> combinations = new HashSet<>();
        for(int i=1;i<=numbers.length();i++){
            generateCombinations(digits, new boolean[digits.size()], new StringBuilder(), i, combinations);
        }

        // 소수 판별
        for (int num : combinations) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;

    }

    // 숫자 조합 생성 (재귀 함수)
    private void generateCombinations(List<Integer> digits, boolean[] visited, StringBuilder sb, int r, Set<Integer> combinations) {
        if (sb.length() == r) {
            combinations.add(Integer.parseInt(sb.toString()));
            return;
        }

        for (int i = 0; i < digits.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                sb.append(digits.get(i));
                generateCombinations(digits, visited, sb, r, combinations);
                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }
        // 반복이 끝나면 combinations 에는 [1,7,17,71] 이 저장됨
    }

    // 소수 판별
    private boolean isPrime(int num) {
        if (num < 2) { // 2미만의 수는 소수가 아니다.
            return false;
        }

        // 약수의 대칭성을 이용하여 반복횟수를 줄임
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
