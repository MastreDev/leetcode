class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        if (k == 0) return false
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, v ->
            map[v]?.let {
                if(Math.abs(index - it) <= k) return true
            }
            map[v] = index
        }
        return false
    }
}