class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val sorted = nums.sorted()
        val result : MutableSet<List<Int>> = mutableSetOf()
        
        for(k in 0 until sorted.size - 2) {
            if (k > 0 && sorted[k] == sorted[k - 1]) continue
            var i = k + 1
            var j = sorted.lastIndex

            val dock = sorted[k]

            while(i < j) {
                val sum = dock + sorted[i] + sorted[j]
                if(sum == 0) {
                    result.add(listOf(dock, sorted[i], sorted[j]).sorted())
                    i++
                    j--
                    while (i < j && sorted[i] == sorted[i - 1]) i++
                    while (i < j && sorted[j] == sorted[j + 1]) j--
                } else if (sum < 0) {
                    i++
                } else {
                    j--
                }
            }
        }
        return result.toList()
    }
}