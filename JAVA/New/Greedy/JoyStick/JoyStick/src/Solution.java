class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        int minMove = length - 1;  // 맨 첫번째 이름은 이미 선택중이기 때문에 -1

        for (int i = 0; i < length; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);  // 상하 조작 횟수 계산

            int next = i + 1; // 다음 이름
            // 이름이 초기 설정된 A와 같다면 다음 이름으로 이동
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }
            // i + length - next : 현재 위치에서 다음 완성된 알파벳 사이까지의 이동횟수
            // Math.min(i, length - next) : 현재 위치에서 왼쪽 또는 오른쪽으로 이동하는 횟수중 더 작은값
            minMove = Math.min(minMove, i + length - next + Math.min(i, length - next));
        }

        answer += minMove;
        return answer;
    }
}