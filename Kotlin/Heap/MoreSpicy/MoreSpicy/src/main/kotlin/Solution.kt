import java.util.*

class Solution {
    fun solution(scoville: IntArray, K: Int): Int {
        val heap = PriorityQueue<Int>()
        var answer = 0
        for (value in scoville) {
            heap.offer(value)
        }
        while (heap.peek() < K) {
            if (heap.size < 2) {
                return -1
            }
            val first = heap.poll()
            val second = heap.poll()
            val mixed = first + second * 2
            heap.offer(mixed)
            answer++
        }
        return answer
    }
}