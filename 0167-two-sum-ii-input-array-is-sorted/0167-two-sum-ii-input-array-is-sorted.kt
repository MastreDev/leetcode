class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var start = 0
        var end = numbers.lastIndex

        while(true) {
            val sum = numbers[start] + numbers[end]
            if(sum == target) break
            else if(target < sum) end--
            else start++
        }

        return intArrayOf(start + 1, end + 1)
    }
}