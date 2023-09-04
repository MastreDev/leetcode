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

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return makeNode(nums.toList())
    }

    fun makeNode(values : List<Int>) : TreeNode?{
        if(values.isEmpty()) return null
        val centerIndex = values.size / 2
        val root = TreeNode(values[centerIndex])
        if(values.size == 1) return root
        root.left = makeNode(values.subList(0, centerIndex))
        root.right = makeNode(values.subList(centerIndex + 1 , values.size))
        return root
    }

}