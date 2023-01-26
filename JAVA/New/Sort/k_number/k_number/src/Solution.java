import java.util.Arrays;

public class Solution {

    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for(int pos= 0;pos<commands.length;pos++){
            int i = commands[pos][0];
            int j = commands[pos][1];
            int k = commands[pos][2];
            int[] copyArr = new int[j-i+1];
            System.arraycopy(array, i-1, copyArr, 0 , copyArr.length);
            Arrays.sort(copyArr);
            answer[pos] = copyArr[k-1];
        }

        return answer;
    }
}
