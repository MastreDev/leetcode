class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val hashMap = HashMap<Char, Char>()
        val mapHash = HashMap<Char, Char>()
        for (i in s.indices) {
            hashMap[s[i]] = t[i]
            mapHash[t[i]] = s[i]
        }
        val x = s.map { hashMap[it] }.joinToString("") == t
        val y = t.map { mapHash[it] }.joinToString("") == s
        return x && y
    }

}