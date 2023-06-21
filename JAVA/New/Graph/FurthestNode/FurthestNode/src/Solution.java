import java.util.*;
public class Solution {
    public int solution(int n, int[][] edges) {
        // 그래프 생성 및 간선 추가
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // BFS를 위한 큐와 방문 여부 배열 선언
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        int answer = 0; // 가장 멀리 떨어진 노드의 개수
        int maxDistance = 0; // 최대 거리

        // 1번 노드부터 BFS 시작
        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // 현재 레벨의 노드 개수만큼 반복
            for (int i = 0; i < size; i++) {
                int node = queue.remove();
                System.out.println(node);
                // 현재 노드와 연결된 노드들을 큐에 추가
                for (int nextNode : graph.get(node)) {
                    if (!visited[nextNode]) {
                        queue.add(nextNode);
                        visited[nextNode] = true;
                        System.out.println(queue);
                    }
                }
            }

//            System.out.println(queue);

            // 현재 레벨의 모든 노드를 탐색한 후, 레벨 증가
            if (!queue.isEmpty()) {
                maxDistance++;
            }
        }

//        // 최대 거리에 있는 노드 개수 카운트
//        for (boolean visit : visited) {
//            if (visit && maxDistance == 1) {
//                answer++;
//            }
//        }
//        return answer;
        return maxDistance;
    }

}
