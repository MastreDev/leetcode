/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var endDepthIndex = 0
        fun deepDive(depth : Int, node : ListNode?) {
            if(node?.next == null){
                endDepthIndex = depth
                return
            }
            deepDive(depth + 1, node?.next)

            if(endDepthIndex - n == depth) {
                node?.next = node?.next?.next
                
            } else if (endDepthIndex - n < 0 && depth == 0) {
                node?.`val` = node?.next?.`val`
                node?.next = node?.next?.next
            }
        }

        deepDive(0, head)
        if(endDepthIndex == 0) return null
        return head
    }

}