class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var accumulator = 0
        val ans = IntArray(nums.size)
        for(i in nums.indices) {
            accumulator += nums[i]
            ans[i] = accumulator
        }
        return ans
    }
}