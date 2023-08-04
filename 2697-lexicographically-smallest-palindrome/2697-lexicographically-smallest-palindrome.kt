class Solution {
    fun makeSmallestPalindrome(s: String): String {
        val result = s.toCharArray()
        var start = 0
        var end = result.lastIndex

        while(start - end < 0) {
            if(result[start] != result[end]) {
                val minChar = minOf(result[start], result[end])
                result[start] = minChar
                result[end] = minChar
            }
            start++
            end--
        }
        return result.joinToString("")
    }
}