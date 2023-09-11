class Solution {
    fun solution(participant: Array<String>, completion: Array<String>): String {
        val player = participant.groupingBy { it }.eachCount().toMutableMap()
        completion.forEach { player[it] = player.getOrDefault(it, 0) - 1 }
        return player.filterValues { it != 0 }.keys.joinToString()
    }

}