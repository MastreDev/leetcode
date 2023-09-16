class Solution {
    fun largestAltitude(gain: IntArray): Int = gain.scan(0){ acc, c -> acc + c}.maxOf{it}
}