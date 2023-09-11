class Solution {
    private int answer;

    public int solution(int k, int[][] dungeons) {
        answer = 0;
        boolean[] visited = new boolean[dungeons.length];

        dfs(k, dungeons, visited, 0);

        return answer;
    }

    private void dfs(int fatigue, int[][] dungeons, boolean[] visited, int count) {
        answer = Math.max(answer, count); // 최대 탐험 던전 수 업데이트

        // 불필요한 재귀 삭제
        if (answer == dungeons.length){
            return;
        }

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                visited[i] = true;
                dfs(fatigue - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
    }
}