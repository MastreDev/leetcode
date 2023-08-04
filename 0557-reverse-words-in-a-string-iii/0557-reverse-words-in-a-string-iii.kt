import java.util.*

class Solution {
    fun reverseWords(s: String): String {
        val builder = StringBuilder()
        val n = s.length
        val stack = Stack<Char>()

        for(i in 0 until n) {
            val cur = s[i]
            if(i == n-1 ){
                stack.push(cur)
                while(stack.isNotEmpty()){
                    builder.append(stack.pop())
                }
                
            } else if (cur == ' ') {
                while(stack.isNotEmpty()){
                    builder.append(stack.pop())
                }
                builder.append(cur)

            } else {
                stack.push(cur)
            }
        }
        return builder.toString()
    }
}