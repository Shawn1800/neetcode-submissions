/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
 fun reverseList(head:ListNode?):ListNode? {
    if (head == null) return null
    val arr = mutableListOf<ListNode>()
    var currentNode = head
    while (currentNode != null) {
        arr.add(currentNode)
        currentNode = currentNode.next
    }
    val newHead = arr[arr.size-1]
    var tail = newHead
    for(i in arr.size - 2 downTo 0) {
        tail.next = arr[i]
        tail = arr[i]
    }
    tail.next = null
    return newHead

}
}
