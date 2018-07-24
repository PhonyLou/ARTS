package com.gitbook.arts.addTwoNumber;

import org.springframework.stereotype.Service;

/**
 * Created by Phony on 2018/7/20.
 */
@Service
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, currentNode = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            // get current value
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            // get current sum
            int sum = x + y + carry;
            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }

        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}