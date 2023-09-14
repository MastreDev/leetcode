class Solution {
    fun maxVowels(s: String, k: Int): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var lastCount = s.take(k).count{it in vowels}
        var maxCount = lastCount

        for(i in 1 .. s.length - k) {
            val minusCount = if(s[i - 1] in vowels) 1 else 0
            val plusCount = if(s[i + k - 1] in vowels) 1 else 0
            lastCount = lastCount - minusCount + plusCount
            maxCount = maxOf(maxCount, lastCount)
        }
        return maxCount
    }
}