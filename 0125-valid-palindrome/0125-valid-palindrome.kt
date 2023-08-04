class Solution {
    fun isPalindrome(s: String): Boolean {
        val parsed = s.toLowerCase().filter{ 
            it.toInt() in 97..122 || it.toInt() in 48..57
        }
        var start = 0
        var end = parsed.lastIndex
        while(start - end <= 0) {
            if(parsed[start] != parsed[end]) return false
            start++
            end--
        }
        return true
    }
}