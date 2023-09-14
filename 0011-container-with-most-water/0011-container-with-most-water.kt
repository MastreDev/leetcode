class Solution {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var start = 0
        var end = height.lastIndex

        while(start < end) {
            val area = Math.min(height[start], height[end]) * (end - start)
            maxArea = Math.max(maxArea, area)
            if(height[start] < height[end]) start++ else end--
        }
        return maxArea
    }
}