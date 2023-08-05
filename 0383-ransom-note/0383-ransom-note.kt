class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (ransomNote.length > magazine.length) return false
        val hashMap = HashMap<Char, Int>()
        magazine.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        for (i in ransomNote.indices) {
            val char = ransomNote[i]
            val count = hashMap[char]
            if (count == null || count == 0) return false
            hashMap[char] = count - 1
        }
        return true
    }
}