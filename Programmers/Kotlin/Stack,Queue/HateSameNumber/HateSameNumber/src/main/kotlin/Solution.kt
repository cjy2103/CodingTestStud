import java.util.*

class Solution {
    fun solution(array: IntArray): IntArray {
        val queue = LinkedList<Int>()
        var temp = -1

        array.forEach { number ->
            if (temp != number) {
                queue.add(number)
                temp = number
            }
        }

        return queue.toIntArray()
    }
}