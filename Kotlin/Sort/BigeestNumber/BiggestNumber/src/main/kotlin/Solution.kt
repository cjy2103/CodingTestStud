import java.util.*

class Solution {
    fun solution(numbers: IntArray?): String {
        return Arrays.stream(numbers)
            .mapToObj { i: Int -> java.lang.String.valueOf(i) }
            .sorted { s1: String, s2: String -> (s2 + s1).compareTo(s1 + s2) }
            .reduce { s1: String, s2: String -> if (s1 == "0") s2 else s1 + s2 }
            .orElse("0")
    }
}