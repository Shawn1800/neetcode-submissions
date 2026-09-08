/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head

    while (current != null) {
        val nextTemp = current.next  // save the next node before we overwrite it
        current.next = prev          // reverse the pointer
        prev = current                // move prev forward
        current = nextTemp            // move current forward
    }

    return prev // prev ends up pointing at the new head (old tail)
}
}
