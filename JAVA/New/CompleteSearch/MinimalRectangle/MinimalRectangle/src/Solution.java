public class Solution {
    public int solution(int[][] sizes){
        int x = 0;
        int y = 0;
        for(int[] size : sizes){
            long width = Math.max(size[0], size[1]);
            long height = Math.min(size[0], size[1]);

            x = (int) Math.max(x, width);
            y = (int) Math.max(y, height);
        }
        return x*y;
    }
}
