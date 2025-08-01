// 83. Remove Duplicates from Sorted List

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

// Example 1:
// Input: head = [1,1,2]
// Output: [1,2]


// Example 2:
// Input: head = [1,1,2,3,3]
// Output: [1,2,3]
 

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.



//solution ->
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr1 = head;
        while(ptr1 != null && ptr1.next != null){
            ListNode ptr2 = ptr1;
            while(ptr2.next!= null){
                if(ptr1.val == ptr2.next.val){
                    ptr2.next = ptr2.next.next;
                }
                else{
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
        return head;
    }
}