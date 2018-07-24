package com.gitbook.arts.addTwoNumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * Created by Phony on 2018/7/20.
 */
public class SolutionTest {
    private Solution solution;

    @Before
    public void preparation() {
        this.solution = new Solution();
    }

    @Test
    public void test_normalCase() {
        ListNode l1 = prepareNodes("0,1");
        ListNode l2 = prepareNodes("0,1,2");

        ListNode expectList = prepareNodes("0,2,2");

        ListNode result = solution.addTwoNumbers(l1, l2);
        Assert.assertTrue(compareNodes(expectList, result));
    }

    @Test
    public void test_emptyCase() {
        ListNode l1 = prepareNodes("");
        ListNode l2 = prepareNodes("0,1");

        ListNode expectList = prepareNodes("0,1");

        ListNode result = solution.addTwoNumbers(l1, l2);
        Assert.assertTrue(compareNodes(expectList, result));
    }

    @Test
    public void test_carryAtLastCase() {
        ListNode l1 = prepareNodes("9,9");
        ListNode l2 = prepareNodes("1");

        ListNode expectList = prepareNodes("0,0,1");

        ListNode result = solution.addTwoNumbers(l1, l2);
        Assert.assertTrue(compareNodes(expectList, result));
    }

    private boolean compareNodes(ListNode expect, ListNode actual) {
        if (expect == null && actual == null) {
            return true;
        }
        ListNode eNode = expect;
        ListNode aNode = actual;
        StringBuffer actualSb = new StringBuffer();
        StringBuffer expectSb = new StringBuffer();
        while (eNode != null || aNode != null) {
            if (eNode == null) {
                return false;
            } else {
                expectSb.append(eNode.val);
            }

            if (aNode == null) {
                return false;
            } else {
                actualSb.append(aNode.val);
            }

            if (eNode != null) {
                eNode = eNode.next;
            }
            if (aNode != null) {
                aNode = aNode.next;
            }
        }
        return actualSb.toString().contentEquals(expectSb);
    }

    private ListNode prepareNodes(String values) {
        String[] strArr = values.split(",", -1);
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;
        for (String str : strArr) {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            head.next = new ListNode(Integer.parseInt(str));
            head = head.next;
        }

        return dummyHead.next;
    }
}
