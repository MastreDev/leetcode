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
    fun hasCycle(head: ListNode?): Boolean {
        val maxRange = 10000 + 1
        var next = head?.next
        var count = 0

        while(count < maxRange && next?.next != null) {
            next = next?.next
            count++
        }
        return count == maxRange
    }
}