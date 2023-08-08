class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val dp = Array(numRows + 2) { listOf<Int>() }
        dp[1] = listOf(1)
        dp[2] = listOf(1, 1)
        for (i in 3 until numRows + 2) {
            val dpBefore = dp[i - 1].zipWithNext { a, b -> a + b }
            dp[i] = mutableListOf(1, 1).apply { addAll(1, dpBefore) }
        }
        return dp.slice(1..numRows)
    }
}