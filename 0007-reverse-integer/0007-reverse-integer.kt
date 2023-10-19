class Solution {
    fun reverse(x: Int): Int {
        val range = Int.MIN_VALUE.toLong() .. Int.MAX_VALUE.toLong()
        val reversed = if(x < 0) x.toString().drop(1).reversed().toLong().times(-1L) else x.toString().reversed().toLong()
        return 0.takeIf{ reversed !in range } ?: reversed.toInt()
    }
}