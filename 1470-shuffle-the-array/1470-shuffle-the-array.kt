class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val ans = IntArray(nums.size)
        repeat(n){
            ans[it * 2] = nums[it]
            ans[it * 2 + 1] = nums[it + n]
        }
        return ans
    }
}