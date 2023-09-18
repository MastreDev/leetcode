class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = nums.sum() - nums[0]

        if(leftSum == rightSum) return 0

        for(i in 1 until nums.size) {
            leftSum += nums[i - 1]
            rightSum -= nums[i]
            if(leftSum == rightSum) return i
        }
        return -1
    }
}