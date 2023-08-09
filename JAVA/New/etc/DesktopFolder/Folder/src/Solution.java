public class Solution {
    public int[] solution(String[] wallpaper) {
        int rows = wallpaper.length;
        int cols = wallpaper[0].length();

        // 값 비교를 위해 min 초기값에는 가장 큰값을 max에는 가장작은 값으로 초기화한다.
        int minY = Integer.MAX_VALUE; // 최소 y 좌표
        int minX = Integer.MAX_VALUE; // 최소 x 좌표
        int maxY = Integer.MIN_VALUE; // 최대 y 좌표
        int maxX = Integer.MIN_VALUE; // 최대 x 좌표


        // 각 칸을 순회하면서 '#'인 부분을 찾아 최소, 최대 좌표를 업데이트
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minY = Math.min(minY, i);
                    minX = Math.min(minX, j);
                    maxY = Math.max(maxY, i);
                    maxX = Math.max(maxX, j);
                }
            }
        }

        // 결과 배열 생성 및 반환
        // max값들에 +1을 해주는이유는 실제 좌표 값 조정을 위해서.
        // 이거 안하면 가로 -1, 세로 -1 의 격자가 되버림
        return new int[]{minY, minX, maxY + 1, maxX + 1};
    }
}