class Solution {
    fun maxProfit(prices: IntArray): Int {
        val n = prices.size
        var start = 0
        var end = 0
        var maxProfit = 0

        while(end < n) {
            val sum = prices[end] - prices[start]
            if(sum < 0) start++ else end++
            maxProfit = maxOf(maxProfit, sum)
        }
        return maxProfit
    }
}