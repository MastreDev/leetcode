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
 import java.util.*

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        if(root != null) stack.push(root)
        
        while(stack.isNotEmpty()){
            val current = stack.pop()
            result.add(current.`val`)
            if(current.right != null) {
                stack.push(current.right)
            }
            if(current.left != null) {
                stack.push(current.left)
            }
        }

        return result.toList()
    }
}