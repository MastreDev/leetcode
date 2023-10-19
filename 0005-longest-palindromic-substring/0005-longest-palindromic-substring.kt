class Solution {

    fun longestPalindrome(s: String): String {
        var result = ""
        next@for(i in s.indices) {
            for(j in s.lastIndex downTo result.length) {
                val candi = s.take(j + 1).drop(i).toString()
                if(candi.isPalindromic()) {
                    result = candi.takeIf{it.length > result.length} ?: continue@next
                }
            }
        }
        return result
    }

    private fun String.isPalindromic() : Boolean {
        if(this.first() != this.last()) return false
        return this == this.reversed()
    }
}