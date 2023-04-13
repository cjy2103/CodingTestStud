import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int answer = 0;
        for(int value : scoville){
            heap.offer(value);
        }

        while (heap.peek() < K){
            if(heap.size() < 2){
                return -1;
            }

            int first = heap.poll();
            int second = heap.poll();

            int mixed = first + (second * 2);
            heap.offer(mixed);
            answer++;
        }

        return answer;
    }
}
