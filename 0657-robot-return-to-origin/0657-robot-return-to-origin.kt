class Solution {
    fun judgeCircle(moves: String): Boolean {
        if (moves.length < 2) return false
        
        val origin = 0 to 0
        var current = 0 to 0

        moves.forEach {
            current = when (it) {
                'L' -> current.copy(first = current.first - 1)
                'U' -> current.copy(second = current.second - 1)
                'R' -> current.copy(first = current.first + 1)
                'D' -> current.copy(second = current.second + 1)
                else -> throw IllegalArgumentException("$it is not valid argument.")
            }
        }

        return origin == current  
    }
}