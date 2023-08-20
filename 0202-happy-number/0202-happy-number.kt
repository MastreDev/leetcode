class Solution {
    
    fun isHappy(n: Int): Boolean {
        var target : Int = n
        val setLoop = mutableSetOf<Int>()
        while(true) {
            val nArray = target.toString().map(Character::getNumericValue).toIntArray()
            val sqrSum = nArray.map{it * it}.sum()
            if(sqrSum == 1) return true

            val isUnique = setLoop.add(sqrSum)
            if(!isUnique) return false
            
            target = sqrSum
        }
        return false
    }
}