fun main(args: Array<String>) {
//    val participant = arrayOf("leo", "kiki", "eden")
//    val participant = arrayOf("marina", "josipa", "nikola", "vinko", "filipa")
//    val participant = arrayOf("mislav", "stanko", "mislav", "ana")
    val participant = arrayOf("mislav", "mislav", "mislav", "mislav")
//    val completion = arrayOf("eden", "kiki")
//    val completion = arrayOf("mislav", "stanko", "ana")
//    val completion = arrayOf("josipa", "filipa", "marina", "nikola")
    val completion = arrayOf("mislav", "mislav", "mislav")
    val solution = Solution()
    val answer = solution.solution(participant, completion)
    println(answer)

}