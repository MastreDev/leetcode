class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val dp = Array(rowIndex + 1) { listOf<Int>() }
        dp[0] = listOf(1)
        for (i in 1 until rowIndex + 1) {
            val dpBefore = dp[i - 1].zipWithNext { a, b -> a + b }
            dp[i] = mutableListOf(1, 1).apply {
                if(i != 1) this.addAll(1, dpBefore)
            }
        }
        return dp[rowIndex]
    }
}