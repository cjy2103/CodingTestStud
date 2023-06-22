class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n]; // 방문 여부를 체크하는 배열
        int count = 0; // 네트워크 개수를 카운트하는 변수

        for (int i = 0; i < n; i++) {
            if (!visited[i]) { // 아직 방문하지 않은 컴퓨터일 경우
                dfs(i, n, computers, visited); // DFS 탐색 실행
                count++; // 네트워크 개수 증가
            }
        }

        return count;
    }

    private void dfs(int node, int n, int[][] computers, boolean[] visited) {
        visited[node] = true; // 현재 노드를 방문 처리

        for (int i = 0; i < n; i++) {
            if (computers[node][i] == 1 && !visited[i]) {
                dfs(i, n, computers, visited); // 연결된 컴퓨터들을 재귀적으로 탐색
            }
        }
    }
}