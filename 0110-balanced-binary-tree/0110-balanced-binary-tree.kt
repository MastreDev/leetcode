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
    
    fun isBalanced(root: TreeNode?): Boolean {
        val depthLeft = travalsal(0, root?.left)
        val depthRight = travalsal(0, root?.right)
        if(depthLeft == -1 || depthRight == -1) return false
        return Math.abs(depthLeft - depthRight) <= 1
    }

    fun travalsal(depth : Int, node : TreeNode?) : Int {
        if(node == null) return depth
        val left = travalsal(depth + 1, node?.left)
        val right = travalsal(depth + 1, node?.right)
        val isBB = Math.abs(left - right) <= 1
        return if(isBB) Math.max(left, right) else -1
    }

}