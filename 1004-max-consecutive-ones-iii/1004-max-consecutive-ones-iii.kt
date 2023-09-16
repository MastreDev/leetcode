class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var zeroCount = 0
        var windowSize : Int = 0
        for(i in nums.indices) {
            when{
                nums[i] == 0 && zeroCount < k -> {
                    zeroCount++
                    windowSize++
                }
                nums[i] == 0 && zeroCount >= k -> break
                else -> windowSize++
            }
        }
        
        val last = nums.size - windowSize
        for(i in 1 .. last){
            val startIndex = i -1
            val endIndex = i + windowSize - 1
            
            if(nums[startIndex] == 0) zeroCount--
            if(endIndex > nums.lastIndex) break
            if(nums[endIndex] == 0) zeroCount++

            val range = i .. nums.lastIndex
            while(zeroCount <= k && i + windowSize in range) {
                if(nums[i + windowSize] == 0){
                    if(zeroCount == k) break
                    zeroCount++
                }
                windowSize++
            }
        }
        return windowSize
    }
}