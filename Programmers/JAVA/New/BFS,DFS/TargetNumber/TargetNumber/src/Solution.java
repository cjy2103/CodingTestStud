import java.util.*;

public class Solution {

    public int bfsSolution(int[] numbers, int target){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0,0)); // 초기합계와 인덱스를 위해 큐에 삽입
        int count = 0; // 방법의 수 카운트

        while (!queue.isEmpty()){
            Node node = queue.remove();
            int sum = node.sum;
            int index = node.index;

            if(index == numbers.length){
                if(sum == target){
                    count++; // 타겟 넘버와 일치하는 경우 방법의 수 증가
                }
            } else {
                // 다음 숫자를 더한 경우와 뺀 경우 모두 큐에 삽입
                queue.add(new Node(sum + numbers[index], index +1));
                queue.add(new Node(sum - numbers[index], index +1));
            }
        }

        return count;
    }

    static class Node {
        int sum; // 현재까지 합계
        int index; // 다음에 계산할 숫자의 인덱스

        public Node(int sum, int index) {
            this.sum = sum;
            this.index = index;
        }
    }

    public int dfsSolution(int[] numbers, int target){
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int sum, int index) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        int count = 0;

        count += dfs(numbers, target, sum + numbers[index], index + 1);
        count += dfs(numbers, target, sum - numbers[index], index + 1);

        return count;
    }

}

