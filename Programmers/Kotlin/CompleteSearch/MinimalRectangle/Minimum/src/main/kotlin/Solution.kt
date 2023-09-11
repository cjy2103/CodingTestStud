class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        return sizes.fold(0L to 0L) { (maxWidth, maxHeight), size ->
            val width = size.maxOrNull()!!.toLong()
            val height = size.minOrNull()!!.toLong()
            maxWidth.coerceAtLeast(width) to maxHeight.coerceAtLeast(height)
        }.let { (maxWidth, maxHeight) -> (maxWidth * maxHeight).toInt() }
    }
}