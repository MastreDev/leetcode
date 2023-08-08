class Solution {
    
    fun countBits(n: Int): IntArray {
        val dp = Array(n + 1) { mutableListOf<Int>() }
        dp[0] = mutableListOf(0)
        for (i in 1 until n + 1) {
            dp[i] = dp[i - 1].apply { add(getOneCountInBinary(i)) }
        }
        return dp[n].toIntArray()
    }

    fun getOneCountInBinary(i: Int): Int {
        return i.toString(2).count { it == '1' }
    }
}