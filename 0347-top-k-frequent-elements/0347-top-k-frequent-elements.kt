class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val hashMap = nums.toList().groupingBy{it}.eachCount()
        val reversed = hashMap.entries.groupBy({it.value}, {it.key})
        val output = reversed.keys
            .sortedDescending()
            .flatMap{ reversed.getOrDefault(it, listOf()) }
            .take(k)
        return output.toIntArray()
    }
}