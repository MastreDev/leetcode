class Solution {
    fun hIndex(citations: IntArray): Int {
        val n = citations.size
        var answer = 0
        citations.sort()
        citations.forEachIndexed { idx, v -> 
            val moreThanCounts = n - idx
            answer = maxOf(answer, minOf(moreThanCounts, v))
        }
        return answer
    }
}