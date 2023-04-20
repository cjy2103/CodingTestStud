fun main(args: Array<String>) {

    val sizes = arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))
//    val sizes = arrayOf(intArrayOf(10, 7), intArrayOf(12, 3), intArrayOf(8, 15), intArrayOf(14, 7), intArrayOf(5, 15))
    val solution = Solution()
    val answer = solution.solution(sizes)
    println(answer)
}