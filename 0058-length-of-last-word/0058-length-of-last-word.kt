class Solution {
    fun lengthOfLastWord(s: String): Int {
        val trimmed = s.trim()
        val end = trimmed.length - 1
        var start = end
        while(0 <= start) {
            if(trimmed[start] == ' ') break
            start--
        }
        return end - start
    }
}