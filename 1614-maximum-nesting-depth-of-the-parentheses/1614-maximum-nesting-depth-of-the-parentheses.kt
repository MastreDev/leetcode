import java.util.Stack

class Solution {

    fun maxDepth(s: String): Int {
        //stack -> ( () (()) )
        val stack = Stack<Char>()

        var answer = 0
        s.forEach {
            if(it == '(') stack.push(it)
            if(it == ')') {
                val depth = stack.size
                stack.pop()
                answer = maxOf(answer, depth)
            }
        }
        return answer
    }

}