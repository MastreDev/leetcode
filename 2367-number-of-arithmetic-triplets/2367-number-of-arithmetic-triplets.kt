class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        var start = 0
        var mid = 1
        var end = 2
        val n = nums.size

        var answerCount = 0
        while(end < n && mid < n && start < n) {
            val smGap = nums[mid] - nums[start]
            val meGap = nums[end] - nums[mid]

            if(smGap == diff){
                if(meGap == diff) {
                    answerCount++
                    start++
                } else if (meGap < diff) {
                    end++
                } else {
                    mid++
                }
            } else if (smGap < diff) {
                mid++
            } else {
                start++
            }
        }
        return answerCount
    }
}