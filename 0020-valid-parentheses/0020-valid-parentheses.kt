import java.util.Stack

class Solution {
    private val opener = hashMapOf('(' to 0, '[' to 1, '{' to 2)
    private val closer = hashMapOf(0 to ')', 1 to ']', 2 to '}')

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (i in s.indices) {
            if (stack.isNotEmpty() && closer[opener[stack.peek()]] == s[i]) stack.pop()
            else stack.push(s[i])
        }
        return stack.isEmpty()
    }
}