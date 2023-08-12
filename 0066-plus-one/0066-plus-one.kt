class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var over = 1
        for(i in digits.lastIndex downTo 0) {
            val newVal = digits[i] + over
            if(newVal == 10) {
                over = 1      
                digits[i] = 0
            } else {
                over = 0
                digits[i] = newVal
            }
        }
        return if(over == 1) {
            IntArray(digits.size + 1){ if(it == 0) 1 else digits[it - 1] }
        } else {
            digits
        }
    }
}