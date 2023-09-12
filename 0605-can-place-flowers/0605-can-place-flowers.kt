import java.util.*

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        val newBed = ArrayDeque<Int>()
        val oldBed = flowerbed.toCollection(ArrayDeque())
        
        if(n == 0) return true
        if(flowerbed.size == 1 && flowerbed[0] == 0) return true

        var remainFlower = n

        while(oldBed.isNotEmpty()) {
            val last = newBed.lastOrNull()
            val current = oldBed.removeFirst()
            val next = oldBed.firstOrNull()

            if(last == 0 && current == 0 && next == 0) {
                newBed.addLast(1)
                remainFlower--
            } else if (last == null && current == 0 && next == 0){
                newBed.addLast(1)
                remainFlower--
            } else if (last == 0 && current == 0 && next == null){
                remainFlower--
            } else {
                newBed.addLast(current)
            }
            if(remainFlower == 0) break
        }
        return remainFlower == 0
    }
}