import java.util.*
import kotlin.collections.ArrayList

class Solution {
    fun solution(progress: IntArray, speeds: IntArray): IntArray {
        val queue = LinkedList<Int>()

        for(i in progress.indices){
            var day = (100 - progress[i]) / speeds[i]

            if((100 - progress[i]) % speeds[i] !=0){
                day++
            }
            queue.add(day)
        }

        var releaseList = ArrayList<Int>()

        var first = queue.poll()
        var count = 1

        while (!queue.isEmpty()){
            val next = queue.poll()

            if(first >= next){
                count++
            } else {
                releaseList.add(count)
                first = next
                count = 1
            }
        }

        releaseList.add(count)

        val answer = IntArray(releaseList.size)

        for(i in 0 until releaseList.size){
            answer[i] = releaseList[i]
        }

        return answer;
    }
}