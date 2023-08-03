class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        return strs.fold(strs[0]){ acc, c ->
            var cur = 0
            while(cur < acc.length && cur < c.length) {
                if(acc[cur] != c[cur]) break
                cur++
            }
            acc.substring(0, cur)
        }
    }
}