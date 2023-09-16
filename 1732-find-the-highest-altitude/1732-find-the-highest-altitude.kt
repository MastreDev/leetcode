class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var maxValue = 0
        gain.scan(0){ acc, c -> (acc + c).also{maxValue = maxOf(it, maxValue)}}
        return maxValue
    }
}