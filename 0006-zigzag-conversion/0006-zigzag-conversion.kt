class Solution {
    fun convert(s: String, numRows: Int): String {
        val n = 2 * numRows - 2
        val answer = mutableListOf<String>()

        if(numRows > s.length || numRows == 1) return s

        repeat(numRows) {
            val gaps = if(numRows -1 == it || it == 0) intArrayOf(n, n) else intArrayOf(n - it * 2, it * 2)
            val builder = StringBuilder()
            builder.append(s[it])

            var cursor = it
            var count = 0
            while(n > 0) {
                cursor += gaps[count % 2]
                if (cursor >= s.length) break
                builder.append(s[cursor])
                count++
            }
            answer.add(builder.toString())
        }

        return answer.joinToString("")
    }
}