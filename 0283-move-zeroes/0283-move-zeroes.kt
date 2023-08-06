class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var start = 0
        var end = 1
        val n = nums.size

        while (start < n && end < n) {
            if (nums[start] == 0) {
                if (nums[end] == 0) {
                    end++
                } else {
                    nums[start] = nums[end].apply { nums[end] = nums[start] }
                    start++
                }

            } else {
                start++
                end++
            }
        }
    }
}