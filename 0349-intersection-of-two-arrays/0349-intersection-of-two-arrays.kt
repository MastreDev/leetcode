class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val map1 = nums1.groupBy { it }
        val map2 = nums2.groupBy { it }
        val result = mutableListOf<Int>()

        map1.keys.forEach {
            if (!map2[it].isNullOrEmpty()) result.add(it)
        }
        return result.toIntArray().also { println(it.contentToString()) }
    }
}