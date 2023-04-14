import java.util.*

class Solution {
    fun solution(scoville: IntArray, K: Int): Int {
        tailrec fun mixScoville(heap: PriorityQueue<Int>, count: Int): Int {
            if (heap.size < 2 && heap.peek() < K) {
                return -1
            }
            if (heap.peek() >= K) {
                return count
            }
            val first = heap.poll()
            val second = heap.poll()
            val mixed = first + second * 2
            heap.offer(mixed)
            return mixScoville(heap, count + 1)
        }

        val heap = PriorityQueue<Int>()
        scoville.forEach { heap.offer(it) }
        return mixScoville(heap, 0)

    }
}