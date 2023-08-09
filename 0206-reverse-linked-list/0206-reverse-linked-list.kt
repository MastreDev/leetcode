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
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return head
        var current = head
        val stack = Stack<ListNode>()

        while(current != null) {
            stack.push(current)
            current = current.next
        }

        current = stack.pop()
        val newHead = current

        while(stack.isNotEmpty()) {
            current?.next = stack.pop().also{ current = it }
        }
        current?.next = null
        return newHead
    }
}