/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
 import java.util.LinkedList

class Solution {

    fun maxDepth(root: TreeNode?): Int {
        var depth = 0
        val queue = LinkedList<Pair<TreeNode?, Int>>()
        queue.addLast(root to 1)

        while (queue.isNotEmpty()) {
            val current = queue.poll()!!
            current.first?.let {
                depth = current.second
                queue.offer(it.left to  depth + 1)
                queue.offer(it.right to depth + 1)
            }
        }
        return depth
    }

}