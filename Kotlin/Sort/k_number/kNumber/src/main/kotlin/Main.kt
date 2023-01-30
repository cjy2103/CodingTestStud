import java.util.*

fun main(args: Array<String>) {
    val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val commands = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))

    val solution = Solution()
    val answer = solution.solution(array, commands)
    print(answer.contentToString())

}