class Solution {

    fun solution(nums : IntArray) : Int{
        val limit = nums.size/2
        return nums.toSet().size.coerceAtMost(limit)
    }
}