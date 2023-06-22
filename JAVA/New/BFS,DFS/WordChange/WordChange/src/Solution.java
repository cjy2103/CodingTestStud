import java.util.*;

class Solution {
    int minStep = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, visited, 0);

        if (minStep == Integer.MAX_VALUE) {
            return 0;
        }

        return minStep;
    }

    public void dfs(String currentWord, String target, String[] words, boolean[] visited, int step) {
        if (currentWord.equals(target)) {
            minStep = Math.min(minStep, step);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isConvertible(currentWord, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, visited, step + 1);
                visited[i] = false;
            }
        }
    }

    public boolean isConvertible(String word1, String word2) {
        int diffCount = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
        }

        return diffCount == 1;
    }
}