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

    ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxtNode;

        while(curr != null)
        {
            nxtNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxtNode;
        }
        return prev;
    } 

    ListNode mid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null) return true;

        ListNode findMid = mid(head);
        ListNode secHalf = reverse(findMid);

        ListNode ptr1 = head;
        ListNode ptr2 = secHalf;

        while(ptr2 != null)
        {
            if(ptr1.val != ptr2.val)
            {
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return true;
    }
}