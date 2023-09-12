class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        val min = Math.min(str1.length , str2.length)
        val mutable = mutableListOf<String>()

        val minStr = if(min == str1.length) str1 else str2
        val target = if(min == str1.length) str2 else str1

        for(i in 0 until min) {
            val div = minStr.take(i + 1)
            val result1 = target.replace(div, "")
            val result2 = minStr.replace(div, "")
            if(result1.isEmpty() && result2.isEmpty()) mutable.add(div)
        }
        return mutable.maxByOrNull{ it.length } ?: ""
    }
}