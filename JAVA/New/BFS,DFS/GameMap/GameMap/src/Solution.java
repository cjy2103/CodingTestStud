import java.util.*;
public class Solution {
    public int solution(int[][] maps) {
        int n = maps.length; // 맵의 행 크기
        int m = maps[0].length; // 맵의 열 크기

        // 상, 하, 좌, 우 방향을 정의합니다.
        int[] upDown = {1, -1, 0, 0};
        int[] leftRight = {0, 0, -1, 1};

        // 방문 여부를 저장하는 2차원 배열을 생성하고, 시작 지점을 방문 처리합니다.
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        // 큐를 생성하고 시작 지점을 큐에 넣습니다.
        Queue<int[]> queue = new LinkedList<>(); // int 배열의 형태로 큐에 저장 (x, y, distance)
        queue.add(new int[]{0, 0, 1});

        // BFS를 수행합니다.
        while (!queue.isEmpty()) {
            int[] cur = queue.remove();
            int x = cur[0];
            int y = cur[1];
            int distance = cur[2];

            // 상대 팀 진영에 도착한 경우, 최단 거리를 반환합니다.
            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            // 상, 하, 좌, 우로 이동할 수 있는 위치를 탐색합니다.
            for (int i = 0; i < 4; i++) {
                int nx = x + upDown[i];
                int ny = y + leftRight[i];

                // 이동할 수 있는 위치이고, 아직 방문하지 않은 위치라면 큐에 넣고 방문 처리합니다.
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny, distance + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        // 상대 팀 진영에 도착할 수 없는 경우 -1을 반환합니다.
        return -1;
    }
}
