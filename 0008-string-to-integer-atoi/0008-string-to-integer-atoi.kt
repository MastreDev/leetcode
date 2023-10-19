class Solution {
    fun myAtoi(s: String): Int {
        try {
            val taken = s.trim().takeWhile{ it == '+' || it == '-' || it.isDigit() }
            if(taken.isEmpty()) return 0
            val multiplier = 1.takeIf{ taken.first().isDigit() || taken.first() == '+'} ?: -1
            val onlyNum = taken.drop(1.takeIf{ taken.first() == '+' || taken.first() == '-' } ?: 0).takeWhile{ it.isDigit() }.toDouble()
            return when{
                multiplier * onlyNum >= Int.MAX_VALUE.toDouble() -> Int.MAX_VALUE
                multiplier * onlyNum <= Int.MIN_VALUE.toDouble() -> Int.MIN_VALUE
                else -> onlyNum.toInt() * multiplier
            }
        } catch(e: NumberFormatException) {
            return 0
        }
        
    }
}