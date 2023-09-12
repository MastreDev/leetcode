class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        val newBed = mutableListOf<Int>()
        val oldBed = mutableListOf<Int>().apply{this.addAll(flowerbed.toList())}
        
        if(n == 0) return true

        var newPlant = 0

        while(oldBed.isNotEmpty()) {
            val last = newBed.lastOrNull()
            val current = oldBed.removeFirst()
            val next = oldBed.firstOrNull()

            if(last == 0 && current == 0 && next == 0) {
                newBed.add(1)
                newPlant++
            } else if (last == null && current == 0 && next == 0){
                newBed.add(1)
                newPlant++
            } else if (last == 0 && current == 0 && next == null){
                newPlant++
            } else if (last == null && current == 0 && next == null){
                newPlant++
            } else {
                newBed.add(current)
            }
            if(newPlant >= n) break
        }
        return newPlant >= n
    }
}