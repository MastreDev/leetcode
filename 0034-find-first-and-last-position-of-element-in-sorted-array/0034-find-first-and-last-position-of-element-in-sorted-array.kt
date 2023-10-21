class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var start = 0
        var end = nums.lastIndex

        while(start <= end) {
            if(nums[start] == target && nums[end] == target) {
                return intArrayOf(start, end)
            }
            if(nums[start] < target) start++
            if(target < nums[end]) end--
        }

        return intArrayOf(-1, -1)
    }
}