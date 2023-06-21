public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,1,1,1,1};
        int target = 3;
//        int [] numbers = {4,1,2,1};
//        int target = 4;

        Solution solution = new Solution();

//        int result = solution.bfsSolution(numbers, target);
        int result = solution.dfsSolution(numbers, target);

        System.out.print(result);
    }
}