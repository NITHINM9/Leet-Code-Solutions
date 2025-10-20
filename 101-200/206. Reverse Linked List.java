// 206. Reverse Linked List

// Given the head of a singly linked list, reverse the list, and return the reversed list.


// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// Example 2:


// Input: head = [1,2]
// Output: [2,1]
// Example 3:

// Input: head = []
// Output: []
 

// Constraints:

// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000


// Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

//solution 1 -> Iterative
// Time Complexity: O(n)    
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}

//solution 2 -> Recursive
// Time Complexity: O(n)    
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }
    
    private ListNode reverse(ListNode prev, ListNode curr){
        if(curr == null) return prev;
        ListNode nextTemp = curr.next;
        curr.next = prev;
        return reverse(curr, nextTemp);
    }
}