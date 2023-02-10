fun main(args: Array<String>) {

    val array = intArrayOf(1, 1, 3, 3, 0, 1, 1)
//    val array = intArrayOf(4, 4, 4, 3, 3)
//    val array = intArrayOf(0, 1, 2, 3, 4, 5)

    val solution = Solution()
    val answer = solution.solution(array)
    println(answer.contentToString())
}