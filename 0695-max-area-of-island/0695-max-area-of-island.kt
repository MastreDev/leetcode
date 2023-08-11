class Solution {

    lateinit var grid : Array<IntArray>

    private val rowCount get() = grid.size
    private val colCount get() = grid.firstOrNull()?.size ?: 0

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        this.grid = grid
        val visited = Array(rowCount){BooleanArray(colCount)}

        var maxArea = 0

        for(i in 0 until rowCount) {
            for(j in 0 until colCount) {
                if(visited[i][j] || grid[i][j] == 0) continue
                maxArea = maxOf(maxArea, bfs(i, j, visited))
            }
        }
        return maxArea
    }

    private val dx = intArrayOf(-1, 0, 1, 0)
    private val dy = intArrayOf(0, -1, 0, 1)

    fun bfs(row: Int, col : Int, visited : Array<BooleanArray>): Int{
        val queue = LinkedList<Pair<Int,Int>>()
        queue.offer(row to col)
        visited[row][col] = true
        var areaSize = 1

        while(queue.isNotEmpty()) {
            val current = queue.poll()!!
            val cRow = current.first
            val cCol = current.second

            for(k in 0 until 4) {
                val dr = cRow + dx[k]
                val dc = cCol + dy[k]

                if(dr !in 0 until rowCount) continue
                if(dc !in 0 until colCount) continue
                
                val newItem = grid[dr][dc]
                if (newItem == 0) continue
                if(visited[dr][dc] == true) continue

                visited[dr][dc] = true
                queue.offer(dr to dc)
                areaSize++
            }
        }
        return areaSize
    }

}