class Solution {
    fun solution(s: String): Boolean {
        val list = s.fold(emptyList<Char>()) { acc, c ->
            when (c) {
                '(' -> acc + c
                ')' -> if (acc.lastOrNull() == '(') acc.dropLast(1) else acc + c
                else -> acc
            }
        }
        return list.isEmpty()
    }
}