class Solution {

    fun countAndSay(n: Int): String {
        var doCount = 0
        var result = "1"
        while(doCount < n - 1) {
            result = say(result)
            doCount++
        }
        return result
    }

    private fun say(numString : String) : String {
        var lastChar = numString.first()
        var lastCharCount = 0
        val result = mutableListOf<String>()

        for(i in numString.indices) {
            val char = numString[i]
            if(lastChar == char) {
                lastCharCount++
                continue

            } else {
                result.add("$lastCharCount$lastChar")
                lastChar = char
                lastCharCount = 1
            }
        }

        if(result.isEmpty() || result.last() != "$lastCharCount${lastChar}") {
            result.add("$lastCharCount$lastChar")
        }

        return result.joinToString("")
    }
}