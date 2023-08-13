class Solution {
    fun singleNumber(nums: IntArray): Int {
        nums.sort()
        for(i in 1 until nums.size) {
            if(i == nums.lastIndex && nums[i - 1] != nums[i]) return nums[i]
            if(nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) return nums[i]
        }
        return nums[0]
    }
}