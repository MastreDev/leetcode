class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var lastSum = nums.take(k).sum()
        var maximum = lastSum
        
        for(i in 1 .. nums.size - k) {
            lastSum = lastSum - nums[i - 1] + nums[i + k -1]
            maximum = maxOf(maximum, lastSum)
        }
        return maximum / k.toDouble()
    }
}