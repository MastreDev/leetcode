class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9){ hashSetOf<Char>() }
        val cols = Array(9){ hashSetOf<Char>() }
        val boxes = Array(9){ hashSetOf<Char>() }

        for(row in 0 until 9) {
            for(col in 0 until 9) {
                val n = board[row][col]
                if(n == '.') continue

                val box = row / 3 * 3 + col / 3
                if(rows[row].contains(n) || cols[col].contains(n) || boxes[box].contains(n)) {
                    return false
                }
                rows[row].add(n)
                cols[col].add(n)
                boxes[box].add(n)
            }
        }

        return true
    }

}