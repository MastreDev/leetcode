class Solution {
    fun reverseWords(s: String): String {
        val stack = Stack<String>()
        s.trim().split(" ").filter{it.isNotEmpty()}.forEach {
            stack.push(it)
        }
        val builder = StringBuilder()
        while(stack.isNotEmpty()) {
            val current = stack.pop()
            builder.append(current).append(if(stack.isEmpty()) "" else " ")
        }
        return builder.toString()
    }
}