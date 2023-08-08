class Solution {
    
    fun countBits(n: Int): IntArray {
        val dp = IntArray(n + 1)
        dp[0] = 0
        for (i in 1 until n + 1) {
            dp[i] = dp[i / 2] + i % 2
        }
        return dp
    }
    
}