class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val newArray = IntArray(m + n)
        var insertIndex = 0
        var leftIndex = 0
        var rightIndex = 0

        while(insertIndex < m + n) {
            when {
                leftIndex >= m -> newArray[insertIndex++] = nums2[rightIndex++]
                rightIndex >= n -> newArray[insertIndex++] = nums1[leftIndex++]
                nums1[leftIndex] < nums2[rightIndex] ->  newArray[insertIndex++] = nums1[leftIndex++]
                else -> newArray[insertIndex++] = nums2[rightIndex++]
            }
        }
        newArray.copyInto(nums1)
    }
}