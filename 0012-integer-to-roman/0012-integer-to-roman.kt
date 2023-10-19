class Solution {
    fun intToRoman(num: Int): String {
        val romanMap = hashMapOf(
            1 to "I",
            4 to "IV",
            5 to "V",
            9 to "IX",
            10 to "X",
            40 to "XL",
            50 to "L",
            90 to "XC",
            100 to "C",
            400 to "CD",
            500 to "D",
            900 to "CM",
            1000 to "M"
        )
        var temp = num
        var position = 0
        var result = StringBuilder()

        while(temp != 0) {
            val pop = temp % 10
            temp /= 10

            val myValue = Math.pow(10.0, position.toDouble()).toInt()
            val realValue =  myValue * pop
            val resultValue = romanMap[realValue] ?: Math.pow(10.0, position + 1.0).toInt().let { nextPosition -> 
                val half = nextPosition / 2
                val repeatCount = (if(realValue > half) realValue - half else realValue) / myValue
                val repeatResult = StringBuilder(if(realValue > half)romanMap[half]!! else "")
                repeat(repeatCount) {
                    repeatResult.append(romanMap[realValue / pop]!!)
                }
                repeatResult.toString()
            }

            result.insert(0, resultValue)

            position++
        }
        return result.toString()
    }
}