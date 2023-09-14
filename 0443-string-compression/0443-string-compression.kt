class Solution {
    fun compress(chars: CharArray): Int {
        val stack = Stack<Pair<Char,Int>>()
        chars.forEach {
            if(stack.isEmpty()) {
                stack.push(it to 1)
            } else {
                val peek = stack.peek()
                if(peek.first == it) {
                    val last = stack.pop()
                    stack.push(last.copy(second = last.second + 1))
                } else {
                    stack.push(it to 1)
                }
            }
        }
        val result = stack.flatMap{ "${it.first}${if(it.second==1) "" else it.second}".toList() }
        result.forEachIndexed{index, c -> chars[index] = c}
        return result.size
    }
}