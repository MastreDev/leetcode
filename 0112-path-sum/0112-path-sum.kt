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

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

        var isFound = false

        fun dfs(node : TreeNode?, sum : MutableList<Int>, depth : Int) {
            if(node == null) return
            sum.add(node.`val`)
            if(node.left == null && node.right == null && sum.sum() == targetSum) {
                isFound = true
                return
            }
            dfs(node.left, sum, depth + 1)
            dfs(node.right, sum, depth + 1)
            sum.remove(node.`val`)
        }

        dfs(root, mutableListOf(), 0)
        return isFound
    }
}