class Solution {
    fun maxProfit(prices: IntArray): Int {
        val n = prices.size
        var start = 0
        var end = 0
        var maxSwingProfit = 0
        var maxDayProfit = 0

        while(end < n) {
            val sum = prices[end] - prices[start]
            if(sum < 0) {
                start++ 
            } else {
                end++
                if(end in 0 until n) {
                    val dayProfit = prices[end] - prices[end-1]
                    if(dayProfit > 0) maxDayProfit += dayProfit
                }
            }
            maxSwingProfit = maxOf(maxSwingProfit, sum)
        }
        return maxOf(maxSwingProfit, maxDayProfit)
    }
}