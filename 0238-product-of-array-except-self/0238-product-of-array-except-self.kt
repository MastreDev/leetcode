class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var allProducts = 1
        var nonZeroProducts = 1
        var zeroCount = 0
        nums.forEach {
            if(it == 0) zeroCount++ else nonZeroProducts *= it
            allProducts *= it
        }
        return IntArray(nums.size) {
            if(nums[it] == 0 && zeroCount == 1) {
                nonZeroProducts 
            } else if (nums[it] == 0 && zeroCount > 1) {
                0
            } else {
                allProducts / nums[it]
            }
        }
    }
}