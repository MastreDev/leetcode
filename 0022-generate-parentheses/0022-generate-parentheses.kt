class Solution {

    private var maxDepth = 0
    private val results = mutableListOf<CharArray>()
    private val validator = Stack<Char>()

    fun generateParenthesis(n: Int): List<String> {
        maxDepth = n * 2
        val bucket = CharArray(n * 2)
        backTracking(0, bucket)
        return results.map { it.joinToString("") }
    }

    private fun backTracking(depth: Int, bucket : CharArray) {
        if (depth == maxDepth) {
            validator.clear()
            val myBucket = bucket.copyOf()
            for (i in myBucket.indices) {
                if (validator.isNotEmpty() && validator.peek() == '(' && myBucket[i] == ')') {
                    validator.pop()
                } else {
                    validator.push(myBucket[i])
                }
            }
            if (validator.isNotEmpty()) return
            results.add(myBucket)
            return
        }
        bucket[depth] = '('
        backTracking(depth + 1, bucket)

        bucket[depth] = ')'
        backTracking(depth + 1, bucket)
    }

}