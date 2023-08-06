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
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p == null || q == null) return false
        val leftC = isSameTree(p.left, q.left)
        val rootC = p.`val` == q.`val`
        val rightC = isSameTree(p.right, q.right)
        return leftC && rootC && rightC
    }
}