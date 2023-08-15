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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val tracking = mutableListOf<Int>()
        traversal(root, tracking)
        return tracking
    }

    fun traversal(node : TreeNode?, tracking : MutableList<Int>) {
        if(node == null) return
        traversal(node.left, tracking)
        tracking.add(node.`val`)
        traversal(node.right, tracking)
    }

}