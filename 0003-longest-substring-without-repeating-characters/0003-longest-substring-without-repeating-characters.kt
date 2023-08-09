class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var start = 0 
        var end = 0

        var chars = LinkedHashSet<Char>()
        var answer = 0

        while(start + answer < s.length) {
            val isUnique = chars.add(s[end])
            if(isUnique){
                answer = maxOf(answer, chars.size)
                end++
            } else {
                chars.remove(s[start])
                start++
            }
        }
        return answer
    }
}