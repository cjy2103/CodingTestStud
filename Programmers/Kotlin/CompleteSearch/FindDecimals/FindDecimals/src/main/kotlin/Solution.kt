import kotlin.math.sqrt

class Solution {
    fun solution(numbers: String): Int {
        val digits = numbers.map { it.toString().toInt() }

        val combinations = (1..numbers.length).flatMap { r ->
            generateCombinations(digits, BooleanArray(digits.size), StringBuilder(), r)
        }.toSet()

        return combinations.count { isPrime(it) }
    }

    private fun generateCombinations(digits: List<Int>, visited: BooleanArray, sb: StringBuilder, r: Int): List<Int> {
        if (sb.length == r) {
            return listOf(sb.toString().toInt())
        }

        val combinations = mutableListOf<Int>()

        for (i in digits.indices) {
            if (!visited[i]) {
                visited[i] = true
                sb.append(digits[i])
                combinations.addAll(generateCombinations(digits, visited, sb, r))
                sb.deleteCharAt(sb.length - 1)
                visited[i] = false
            }
        }

        return combinations
    }

    private fun isPrime(num: Int): Boolean {
        if (num < 2) {
            return false
        }

        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                return false
            }
        }

        return true
    }
}