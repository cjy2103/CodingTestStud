class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int tLength = t.length();
        int pLength = p.length();

        for (int i = 0; i <= tLength - pLength; i++) {
            String substring = t.substring(i, i + pLength);
            int substringNum = Integer.parseInt(substring);
            int pNum = Integer.parseInt(p);

            if (substringNum <= pNum) {
                count++;
            }
        }

        return count;
    }
}