import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        Collections.addAll(set1, cards1);

        Collections.addAll(set2, cards2);

        int idx1 = 0;
        int idx2 = 0;
        for (String word : goal) {
            if (set1.contains(word)) {
                if (idx1 < cards1.length && cards1[idx1].equals(word)) {
                    idx1++;
                } else {
                    return "No";
                }
            } else if (set2.contains(word)) {
                if (idx2 < cards2.length && cards2[idx2].equals(word)) {
                    idx2++;
                } else {
                    return "No";
                }
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}