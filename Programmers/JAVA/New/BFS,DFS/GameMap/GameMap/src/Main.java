public class Main {
    public static void main(String[] args) {
        int [][] map = {{1,0,1,1,1}
                       ,{1,0,1,0,1},
                        {1,0,1,1,1},
                        {1,1,1,0,1},
                        {0,0,0,0,1}};
//        int [][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};


        Solution solution = new Solution();

        int result = solution.solution(map);
        System.out.print(result);
    }
}