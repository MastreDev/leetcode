class Solution {
    fun reverseVowels(s: String): String {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        val vStack = Stack<Char>()
        val zQueue = ArrayDeque<Char>()
        s.forEach {
            if(it.lowercaseChar() in vowels) {
                vStack.push(it)
                zQueue.addLast('$')
            } else {
                zQueue.addLast(it)
            }
        }
        val builder = StringBuilder()
        while(zQueue.isNotEmpty()) {
            val current = zQueue.removeFirst()!!
            if(current == '$') {
                builder.append(vStack.pop()!!)
            } else {
                builder.append(current)
            }
        }
        return builder.toString()
    }
}