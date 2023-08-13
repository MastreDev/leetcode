class Solution {

    fun addBinary(a: String, b: String): String {
        val larger = maxOf(a.length, b.length)
        val padA = a.padStart(larger, '0')
        val padB = b.padStart(larger, '0')
        var over = 0
        val builder = StringBuilder()
        
        for(i in larger - 1 downTo 0) {
            val result = Character.getNumericValue(padA[i]) + Character.getNumericValue(padB[i]) + over
            over = result / 2
            builder.append(result % 2)
        }

        if(over == 1) builder.append(1)
        return builder.toString().reversed()
    }
}