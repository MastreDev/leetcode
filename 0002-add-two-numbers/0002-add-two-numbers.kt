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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return recursive(l1, l2, false)
    }

    private fun recursive(l1: ListNode?, l2: ListNode?, over10: Boolean = false): ListNode? {
        if (l1 == null) return null
        if (l2 == null) return null

        val sum = l1.`val` + l2.`val` + (1.takeIf { over10 } ?: 0)

        val next1 = if (l1.next == null && l2.next != null) ListNode(0) else l1.next
        val next2 = if (l1.next != null && l2.next == null) ListNode(0) else l2.next

        val nextSum = recursive(next1, next2, sum >= 10).run {
            if (this == null && sum >= 10) ListNode(1) else this
        }
        return ListNode(sum % 10).apply { this.next = nextSum }
    }
}