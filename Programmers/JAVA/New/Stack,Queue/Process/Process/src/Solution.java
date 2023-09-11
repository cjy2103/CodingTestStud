import java.util.*;
public class Solution {
    public int solution(int[] priorities, int location) {

        Queue<Integer> queue = new LinkedList<>();

        for(int priority : priorities){
            queue.add(priority);
        }

        int answer = 0;
        while (!queue.isEmpty()){
            int current = queue.poll();
            boolean hasHigherPriority = false;

            for(int priority : queue){
                if(priority > current){
                    hasHigherPriority = true;
                    break;
                }
            }

            if(hasHigherPriority){
                queue.add(current);
            }else {
                answer++;
                if(location == 0){
                    return answer;
                }
            }
            location = (location - 1 + queue.size()) % queue.size();
        }

        return -1; // 예외 처리: 대기 큐가 비어있을 경우
    }

}
