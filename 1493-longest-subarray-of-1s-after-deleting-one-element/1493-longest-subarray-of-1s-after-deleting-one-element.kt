class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var range = 0 until nums.size
        var windowSize = 0
        var zeroCount = 0
        for(i in range) {
            if(zeroCount == 1 && nums[i] == 0) break
            if(zeroCount < 1 && nums[i] == 0) zeroCount++
            windowSize++
        }

        for(i in 1 until nums.size) {
            if(nums[i - 1] == 0) zeroCount--
            val next = i + windowSize - 1
            if(next in range && nums[next] == 0) zeroCount++
            if(zeroCount > 1) continue

            while(zeroCount <= 1) {
                val nextToNext = i + windowSize
                if(nextToNext !in range) break
                if(nums[nextToNext] == 1) {
                    windowSize++
                    continue
                }
                if(nums[nextToNext] == 0 && zeroCount == 1) break
                if(nums[nextToNext] == 0 && zeroCount < 1) {
                    zeroCount++
                    windowSize++
                    continue
                }
            }
        }

        return windowSize - 1
    }
}