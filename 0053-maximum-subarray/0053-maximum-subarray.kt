class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        var localMax = nums[0]
        for (i in 1 until nums.size) {
            localMax = maxOf(nums[i], localMax + nums[i])
            max = maxOf(max, localMax)
        }
        return max
    }
}