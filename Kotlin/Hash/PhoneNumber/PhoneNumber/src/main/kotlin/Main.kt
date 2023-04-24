fun main(args: Array<String>) {
    val phoneBook = arrayOf("119", "97674223", "1195524421")
//    val phoneBook = arrayOf("119", "456", "789")
//    val phoneBook = arrayOf("12", "123", "1235", "567", "88")
    val solution = Solution()
    val answer: Boolean = solution.solution(phoneBook)
    println(answer)
}