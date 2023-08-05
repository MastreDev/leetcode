class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if(nums.isEmpty()) return listOf()
        val results = mutableListOf<Pair<Int, Int>>()
        var from = nums.first()

        nums.toList().zipWithNext { before, next ->
            if (next - before != 1) {
                results.add(from to before)
                from = next
            }
        }

        results.add(from to nums.last())
        return results.map { if(it.first == it.second) it.first.toString() else "${it.first}->${it.second}" }
    }
}