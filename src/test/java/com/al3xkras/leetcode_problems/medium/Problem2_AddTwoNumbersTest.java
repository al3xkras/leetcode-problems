package com.al3xkras.leetcode_problems.medium;

import org.junit.jupiter.api.Test;

import static com.al3xkras.leetcode_problems.medium.Problem2_AddTwoNumbers.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem2_AddTwoNumbersTest {
    static ListNode createNode(int val){
        ListNode l = new ListNode();
        l.val=val;
        return l;
    }
    static ListNode createChildNode(ListNode parent, int val){
        ListNode l = new ListNode();
        parent.next=l;
        l.val=val;
        return l;
    }

    static ListNode forNumber(String numString){
        ListNode iter = createNode(Integer.parseInt(numString.substring(0,1)));
        ListNode head = iter;
        for (int i = 1; i < numString.length(); i++) {
            iter = createChildNode(iter,Integer.parseInt(numString.substring(i,i+1)));
        }
        return head;
    }

    @Test
    void test1(){
        ListNode l1 = forNumber("9999999");
        ListNode l2 = forNumber("9999");

        ListNode sum = new Solution().addTwoNumbers(l1,l2);
        StringBuilder sb = new StringBuilder();
        while (sum!=null){
            sb.append(sum.val);
            sum=sum.next;
        }
        assertEquals("89990001",sb.toString());
    }

    @Test
    void test2(){
        ListNode l1 = forNumber("0");
        ListNode l2 = forNumber("0");

        ListNode sum = new Solution().addTwoNumbers(l1,l2);
        StringBuilder sb = new StringBuilder();
        while (sum!=null){
            sb.append(sum.val);
            sum=sum.next;
        }
        assertEquals("0",sb.toString());
    }

    @Test
    void test3(){
        ListNode l1 = forNumber("243");
        ListNode l2 = forNumber("564");

        ListNode sum = new Solution().addTwoNumbers(l1,l2);
        StringBuilder sb = new StringBuilder();
        while (sum!=null){
            sb.append(sum.val);
            sum=sum.next;
        }
        assertEquals("708",sb.toString());
    }

}