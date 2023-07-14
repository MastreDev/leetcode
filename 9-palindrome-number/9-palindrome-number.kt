class Solution {
    fun isPalindrome(x: Int): Boolean = x.toString().toList().run {
        val toString = x.toString().toList()
        val origin = toString.joinToString("")
        val reversed = toString.reversed().joinToString("")
        return origin == reversed
    }
}