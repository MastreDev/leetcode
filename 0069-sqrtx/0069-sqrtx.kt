class Solution {
    fun mySqrt(x: Int): Int {
        var maxI = 0
        for(i in 0 .. x) {
            val sq = i.toLong() * i.toLong()
            if(sq == x.toLong()) return i
            if(sq > x) {
                maxI = i - 1
                break
            }
        }
        return maxI
    }
}