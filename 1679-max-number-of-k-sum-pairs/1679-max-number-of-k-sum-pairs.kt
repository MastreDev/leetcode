class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()
        var start = 0
        var end = nums.lastIndex
        var counts = 0

        while(start < end) {
            val sum = nums[start] + nums[end]
            when {
                sum == k -> {
                    counts++
                    start++
                    end--
                }
                sum > k -> end--
                sum < k -> start++
            }
        }
        return counts
    }
}