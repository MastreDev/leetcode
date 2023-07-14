class Solution {
    private val matcher = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        val strings = s.toList()
        return strings.foldIndexed(0) { index, acc, c ->
            val current = matcher[c]!!
            if (index == 0) return@foldIndexed current
            val before = strings[index - 1]
            acc + current + before.run {
                when {
                    this == 'I' && (c == 'V' || c == 'X') -> -2
                    this == 'X' && (c == 'L' || c == 'C') -> -20
                    this == 'C' && (c == 'D' || c == 'M') -> -200
                    else -> 0
                }
            }
        }
    }
}