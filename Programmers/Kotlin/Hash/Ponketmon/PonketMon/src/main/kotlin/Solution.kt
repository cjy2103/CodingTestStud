class Solution {

    fun solution(nums : IntArray) : Int{
        return nums.toSet().size.coerceAtMost(nums.size/2)
    }
}