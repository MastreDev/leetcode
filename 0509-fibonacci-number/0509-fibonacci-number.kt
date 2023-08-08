class Solution {
    fun fib(n: Int): Int {
        val dp = IntArray(n + 2)
        dp[0] = 0
        dp[1] = 1
        for(i in 2 until n + 1) {
            dp[i] = dp[i - 1] + dp[i -2]
        }
        return dp[n]
    }
}