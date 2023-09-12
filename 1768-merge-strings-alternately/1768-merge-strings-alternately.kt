class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val maxSize = Math.max(word1.length, word2.length)
        val range1 = 0 until word1.length
        val range2 = 0 until word2.length
        val result = StringBuilder()
        for(i in 0 until maxSize) {
            if(i in range1) result.append(word1[i])
            if(i in range2) result.append(word2[i])
        }
        return result.toString()
    }
}