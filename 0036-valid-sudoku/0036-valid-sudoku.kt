class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var rowValidates = true
        var colValidates = true
        var boxValidator = true

        for(i in 0 until board.size) {
            rowValidates = rowValidates && checkValid(board[i])
            if(rowValidates == false) return false
            colValidates = colValidates && board.map{ it[i] }.toCharArray().let{ checkValid(it) }
            if(rowValidates && colValidates == false) return false
        }
        
        boxWhole@ for(i in 0 until board.size step 3) {
            for(j in 0 until board[i].size step 3) {
                val boxValidate = hashSetOf<Char>()
                for(k in i until i + 3) {
                    for (l in j until j + 3) {
                        if(board[k][l] == '.') continue
                        if(boxValidate.add(board[k][l])) continue
                        return false
                        break@boxWhole
                    }
                }
            }
        }
        return rowValidates && colValidates && boxValidator
    }

    fun checkValid(array : CharArray) : Boolean {
        val validator = hashSetOf<Char>()
        for(i in array.indices) {
            if(array[i]!= '.' && validator.add(array[i]) == false) return false
        }
        return true
    }
}