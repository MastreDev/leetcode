class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        return nums.groupBy{ it }
            .map { it.value.size }
            .map { it * (it - 1) / 2 }
            .sum()
    }
}