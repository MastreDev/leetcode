import java.util.LinkedList

class Solution {
    private val dy = intArrayOf(0, -1, 0, 1)
    private val dx = intArrayOf(-1, 0, 1, 0)

    fun numIslands(grid: Array<CharArray>): Int {
        val rows = grid.size
        val cols = grid.firstOrNull()?.size ?: 0
        val visited = Array(rows) { IntArray(cols) { -1 } }
        var islandCnt = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                islandCnt += bfs(i, j, grid, visited)
            }
        }
        return islandCnt
    }

    private fun bfs(row: Int, col: Int, grid: Array<CharArray>, visited: Array<IntArray>): Int {
        if (grid[row][col] == '0' || visited[row][col] != -1) return 0
        val queue = LinkedList<Pair<Int, Int>>()
        queue.offer(row to col)

        while (queue.isNotEmpty()) {
            val current = queue.poll()!!
            if (grid[current.first][current.second] == '0') continue

            for (k in 0 until 4) {
                val dr = current.first + dy[k]
                val dc = current.second + dx[k]

                if (dr !in grid.indices) continue
                if (dc !in grid[dr].indices) continue
                if (grid[dr][dc] == '0') continue

                if (visited[dr][dc] == -1) {
                    visited[dr][dc] = visited[current.first][current.second] + 1
                    queue.offer(dr to dc)
                }
            }
        }
        return 1
    }
}