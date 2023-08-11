class Solution {

    var answer = mutableListOf<List<Int>>()

    fun permute(nums: IntArray): List<List<Int>> {
        dfs(nums, mutableListOf(), BooleanArray(nums.size))
        return answer
    }

    fun dfs(nums: IntArray, new: MutableList<Int>, visited: BooleanArray) {
        if (nums.size == new.size) {
            answer.add(new.toList())
            return
        }

        for (i in nums.indices) {
            if (visited[i]) continue
            new.add(nums[i])
            visited[i] = true
            dfs(nums, new, visited)
            new.removeAt(new.lastIndex)
            visited[i] = false
        }
    }

}