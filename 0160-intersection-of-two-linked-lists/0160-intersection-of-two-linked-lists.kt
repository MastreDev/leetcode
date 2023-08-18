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
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        val setter = LinkedHashSet<ListNode>()
        return findInter(setter, headA, headB)
    }

    fun findInter(set : LinkedHashSet<ListNode>, headA:ListNode?, headB:ListNode?) : ListNode? {
        if(headA == null && headB == null) return null
        val aUnique = if(headA == null) true else set.add(headA)
        if(!aUnique) return headA

        val bUnique = if(headB == null) true else set.add(headB)
        if(!bUnique) return headB
        return findInter(set, headA?.next, headB?.next)
    }

}