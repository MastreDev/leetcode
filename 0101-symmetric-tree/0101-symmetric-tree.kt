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

    fun isSymmetric(root: TreeNode?): Boolean {
        val lefts = mutableListOf<Int?>()
        if(root?.left?.`val` != root?.right?.`val`) return false
        addLeftFirst(root?.left, lefts)
        compare(root?.right, lefts)
        return lefts.isEmpty()
    }

    fun addLeftFirst(node : TreeNode?, acc : MutableList<Int?>){
        if(node == null) return
        acc.add(node.left?.`val`)
        acc.add(node.right?.`val`)
        addLeftFirst(node.left, acc)
        addLeftFirst(node.right, acc)
    }

    fun compare(node: TreeNode?, acc : MutableList<Int?>){
        if(node == null) return
        if(acc.removeFirst() != node.right?.`val`) return
        if(acc.removeFirst() != node.left?.`val`) return
        
        compare(node.right, acc)
        compare(node.left, acc)
    }

}