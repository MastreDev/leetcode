import java.util.LinkedList

class ParkingSystem(
    private val bigSlotCount: Int,
    private val mediumSlotCount: Int,
    private val smallSlotCount: Int
) {

    init {
        if (bigSlotCount < 0 || mediumSlotCount < 0 || smallSlotCount < 0) throw IllegalArgumentException("big, medium, small must over 0")
    }

    private val bigQueue = LinkedList<Int>().apply { repeat(bigSlotCount) { this.offer(-1) } }
    private val mediumQueue = LinkedList<Int>().apply { repeat(mediumSlotCount) { this.offer(-1) } }
    private val smallQueue = LinkedList<Int>().apply { repeat(smallSlotCount) { this.offer(-1) } }

    fun addCar(carType: Int): Boolean {
        val queue = when (carType) {
            1 -> bigQueue
            2 -> mediumQueue
            3 -> smallQueue
            else -> throw IllegalArgumentException("cartype : $carType is not valid type.")
        }
        return queue.poll() != null
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */