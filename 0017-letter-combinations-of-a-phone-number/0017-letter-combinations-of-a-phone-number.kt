class Solution {
    val map = hashMapOf(
        '2' to arrayOf('a', 'b', 'c'),
        '3' to arrayOf('d', 'e', 'f'),
        '4' to arrayOf('g', 'h', 'i'),
        '5' to arrayOf('j', 'k', 'l'),
        '6' to arrayOf('m', 'n', 'o'),
        '7' to arrayOf('p', 'q', 'r', 's'),
        '8' to arrayOf('t', 'u', 'v'),
        '9' to arrayOf('w', 'x', 'y', 'z'),
    )

    fun letterCombinations(digits: String): List<String> {
        if(digits.isEmpty()) return listOf()
        val result = mutableListOf<String>()

        fun backTracking(depth : Int, chars : CharArray){
            if(depth == digits.length){
                result.add(chars.joinToString(""))
                return
            }

            val mapArray = map[digits[depth]]!!
            for(i in 0 until mapArray.size) {
                chars[depth] = mapArray[i]
                backTracking(depth + 1, chars)
            }
        }

        backTracking(0, CharArray(digits.length))
        return result
    }
}