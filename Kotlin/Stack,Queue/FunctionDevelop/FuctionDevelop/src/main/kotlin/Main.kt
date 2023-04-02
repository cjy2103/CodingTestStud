import java.util.*

fun main(args: Array<String>) {
    val progresses = intArrayOf(93, 30, 55)
//        int [] progresses = {95,90,99,99,80,99};
    //        int [] progresses = {95,90,99,99,80,99};
    val speeds = intArrayOf(1, 30, 5)
//        int [] speeds = {1,1,1,1,1,1};

    //        int [] speeds = {1,1,1,1,1,1};
    val solution = Solution()

    val answer = solution.solution(progresses, speeds)
    println(answer.contentToString())
}