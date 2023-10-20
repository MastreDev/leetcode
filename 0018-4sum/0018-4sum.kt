class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        nums.sort()
        val results = mutableSetOf<List<Int>>()

        for(i in 0 until nums.size - 3) {
            if(i > 0 && nums[i] == nums[i - 1]) continue

            for(j in i + 1 until nums.size - 2) {
                var x = j + 1
                var y = nums.lastIndex

                while(x < y) {
                    val sum = nums[i].toLong() + nums[j].toLong() + nums[x].toLong() + nums[y].toLong()
                    if(sum == target.toLong()) {
                        results.add(listOf(nums[i], nums[j], nums[x], nums[y]).sorted())
                        x++
                        y--
                    } else if(sum < target.toLong()) {
                        x++
                        while(x < y && nums[x] == nums[x - 1]) x++
                    } else {
                        y--
                        while(x < y && nums[y] == nums[y + 1]) y--
                    }
                }

            }
        }
        return results.toList()
    }
}