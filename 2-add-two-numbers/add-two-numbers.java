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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode l3_fin = new ListNode();

        l3_fin = l3;
        
        int carry = 0;
        int num = 0;

        if (l1 != null && l2 != null) {
            num = l1.val + l2.val;
            if (num > 9) { 
                l3.val = (num-10);
                carry = 1; 
            } else {
                l3.val = num;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null && l2 != null) {
            ListNode l3_temp = new ListNode();

            int num1 = l1.val + l2.val;

            l3_temp.val = num1 + carry;
            carry = 0;

            if (l3_temp.val > 9) {
                l3_temp.val = (l3_temp.val-10);
                carry = 1;
            }
            
            l3.next = l3_temp;
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null){
            ListNode l3_temp = new ListNode();
            
            l3_temp.val = l1.val + carry;
            carry = 0;

            if (l3_temp.val > 9) {
                l3_temp.val = (l3_temp.val-10);
                carry = 1;
            }
            
            l3.next = l3_temp;
            l3 = l3.next;
            l1 = l1.next;
        }

        while (l2 != null){
            ListNode l3_temp = new ListNode();
            
            l3_temp.val = l2.val + carry;
            carry = 0;

            if (l3_temp.val > 9) {
                l3_temp.val = l3_temp.val-10;
                carry = 1;
            }
            
            l3.next = l3_temp;
            l3 = l3.next;
            l2 = l2.next;
        }

        if (carry == 1) {
            ListNode l3_temp = new ListNode(1);
            l3.next = l3_temp;
        }

        return l3_fin;
    }
}
