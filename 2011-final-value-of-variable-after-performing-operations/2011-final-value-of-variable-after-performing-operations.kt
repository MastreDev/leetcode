class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        return operations.fold(0){acc, operation ->
            val target = operation[1]
            when(target){
                '+' -> acc + 1
                '-' -> acc - 1
                else -> acc
            }
        }
    }
}