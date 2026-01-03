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
    public ListNode rotateRight(ListNode head, int k) {
        //edge
        if(head==null ||head.next==null||k==0)
        return head;
        //len of list
        ListNode dummy=head;
        int l=1;
        while(dummy.next!=null)
        {l++;
        dummy=dummy.next;

        }
//travers till the node before it
          dummy.next=head;
          k=k%l;
          k=l-k;
          while(k-- >0)
          dummy=dummy.next;
  //the node head connection
     head=dummy.next;
     dummy.next=null;


     
      return head;
    }
}