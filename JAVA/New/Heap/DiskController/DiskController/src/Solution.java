import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        // 작업 리스트를 요청 시점의 오름차순으로 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); // 작업을 처리하기 위한 우선순위 큐

        int currentTime = 0; // 현재 시간
        int totalWaitTime = 0; // 작업의 요청부터 종료까지 걸린 시간의 총합
        int completedJobs = 0; // 처리된 작업의 수

        int index = 0;
        while (completedJobs < jobs.length) {
            // 현재 시간 이전에 요청된 작업들을 큐에 추가
            while (index < jobs.length && jobs[index][0] <= currentTime) {
                pq.offer(jobs[index]);
                index++;
            }

            if (pq.isEmpty()) {
                // 현재 시간에 작업이 없는 경우, 다음 작업의 요청 시간으로 이동
                currentTime = jobs[index][0];
            } else {
                // 현재 시간에 가장 짧은 작업을 선택하여 처리
                int[] job = pq.poll();
                int requestTime = job[0];
                int processingTime = job[1];

                totalWaitTime += currentTime - requestTime + processingTime;
                currentTime += processingTime;
                completedJobs++;
            }
        }

        return totalWaitTime / jobs.length;
    }
}