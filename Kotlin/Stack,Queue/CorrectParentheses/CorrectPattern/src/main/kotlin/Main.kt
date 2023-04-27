fun main(args: Array<String>) {
    val s = "()()"
//    val s = "(())()"
//    val s = ")(()"
//    val s = "(()(";
    val solution = Solution()
    val answer: Boolean = solution.solution(s)
    println(answer)
}