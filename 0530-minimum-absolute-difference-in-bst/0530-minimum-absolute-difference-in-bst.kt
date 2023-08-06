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
class Solution {

    private var lastValue = -1
    private var minDiff = Int.MAX_VALUE

    fun getMinimumDifference(root: TreeNode?): Int {
        traverse(root)
        return minDiff
    }

    private fun traverse(node: TreeNode?) {
        if (node == null) return
        traverse(node.left)
        if (lastValue != -1) minDiff = minOf(minDiff, Math.abs(lastValue - node.`val`))
        lastValue = node.`val`
        traverse(node.right)
    }

}