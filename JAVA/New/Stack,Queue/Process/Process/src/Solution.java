import java.util.*;
public class Solution {
    public int solution(int[] priorities, int location) {

        Queue<Integer> queue = new LinkedList<>();

        for(int priority : priorities){
            queue.add(priority);
        }

        int order = 0;
        while (!queue.isEmpty()){
            int current = queue.poll();

        }

        int answer = 0;
        return answer;
    }

}
