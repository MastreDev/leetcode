class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = 0
        nums.forEach { num ->
            if(count == 0) candidate = num
            count += 1.takeIf{num == candidate} ?: -1
        }
        return candidate
    }
}