class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var start = 0
        var end = 1
        val size = nums.size

        while(end in 1 until size) {
            if(nums[start]!= nums[end]) {
                start++
                nums[start] = nums[end].apply{nums[start] = this}
            }
            end++
        }
        return start + 1
    }
}