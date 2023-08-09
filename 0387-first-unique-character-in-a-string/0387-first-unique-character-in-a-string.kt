class Solution {
    fun firstUniqChar(s: String): Int {
        return s.withIndex()
            .groupBy({it.value}, {it.index})
            .filter { it.value.size == 1 }
            .values
            .flatten()
            .sorted()
            .firstOrNull() ?: -1
    }
}