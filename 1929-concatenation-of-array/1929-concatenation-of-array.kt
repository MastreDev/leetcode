class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val ans = IntArray(size * 2)
        for (i in nums.indices){
            ans[i] = nums[i]
            ans[i + size] = nums[i];
        }
        return ans
    }
}