class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow;

        for (int y = 1; y <= total; y++) {
            if (total % y == 0) {
                int x = total / y;

                // 갈색 격자 수 계산 및 조건 확인
                int brownCount = 2 * x + 2 * y - 4;
                if (brownCount == brown) {
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
        }
        return answer;
    }
}