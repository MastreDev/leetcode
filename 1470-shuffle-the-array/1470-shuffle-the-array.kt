class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val ans = IntArray(nums.size)
        repeat(n){
            val index = it * 2
            ans[index] = nums[it]
            ans[index + 1] = nums[it + n]
        }
        return ans
    }
}