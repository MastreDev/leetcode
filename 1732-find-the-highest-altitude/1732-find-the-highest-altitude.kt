class Solution {
    fun largestAltitude(gain: IntArray): Int {
        return gain.scan(0){ acc, c -> (acc + c) }.maxOf{it}
    }
}