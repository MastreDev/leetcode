class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val n = haystack.length
        val m = needle.length
        var start = 0
        var end = start + m
        while(end <= n) {
            val subs = haystack.substring(start, end)
            if(subs == needle) break
            start++
            end++
        }
        return start.takeIf{ end <= n} ?: -1
    }
}