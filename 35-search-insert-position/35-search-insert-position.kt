class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.lastIndex
        var mid = 0

        while(low <= high) {
            mid = (low + high) / 2
            val midValue = nums[mid]
            when {
                target < midValue  -> high = mid -1
                midValue < target -> low = mid + 1
                midValue == target -> return mid
            }
        }
        return low
    }
}