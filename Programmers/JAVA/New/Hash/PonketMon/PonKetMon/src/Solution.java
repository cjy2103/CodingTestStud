import java.util.*;

public class Solution {
    public int solution(int[] nums){
        int limit = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int pokemon : nums){
            set.add(pokemon);
        }

        return Math.min(set.size(), limit);
    }
}
