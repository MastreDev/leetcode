class Solution {

    fun rob(nums: IntArray): Int {
        val n = nums.size
        if (n < 2) return nums.first()
        val dp = IntArray(n)
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])
        for (i in 2 until n) {
            dp[i] = maxOf(dp[i - 1], dp[i - 2] + nums[i])
        }
        return dp[nums.lastIndex]
    }
   
}