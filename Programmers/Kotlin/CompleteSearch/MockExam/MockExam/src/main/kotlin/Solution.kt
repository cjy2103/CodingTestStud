class Solution {
    fun solution(answers: IntArray): IntArray {
        val personList = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )
        val score = IntArray(3)

        answers.forEachIndexed{ i, answer ->
            run {
                personList.forEachIndexed { j, person ->
                    run {
                        if (answer == person[i % person.size]) {
                            score[j]++
                        }
                    }
                }
            }
        }

        val maxScore = score.maxOrNull()
        return score.indices.filter { score[it] == maxScore }
            .map { it + 1 }
            .toIntArray()
    }
}