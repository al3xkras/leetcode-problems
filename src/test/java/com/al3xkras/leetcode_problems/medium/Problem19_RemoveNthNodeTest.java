package com.al3xkras.leetcode_problems.medium;

import org.junit.jupiter.api.Test;

import static com.al3xkras.leetcode_problems.medium.Problem2_AddTwoNumbers.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem19_RemoveNthNodeTest {
    public static void printList(ListNode node){
        StringBuilder sb = new StringBuilder();
        while (node!=null){
            sb.append(" ").append(node.val);
            node = node.next;
        }
        System.out.println(sb);
    }
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
        ListNode node = forNumber("12345");
        ListNode out = new Problem19_RemoveNthNode.Solution()
                .removeNthFromEnd(node,4);
        printList(out);
    }

    @Test
    void test2(){
        ListNode node = forNumber("1");
        ListNode out = new Problem19_RemoveNthNode.Solution()
                .removeNthFromEnd(node,1);
        printList(out);
    }

    @Test
    void test3(){
        ListNode node = forNumber("12");
        ListNode out = new Problem19_RemoveNthNode.Solution()
                .removeNthFromEnd(node,1);
        printList(out);
    }

    @Test
    void test4(){
        ListNode node = forNumber("1234");
        ListNode out = new Problem19_RemoveNthNode.Solution()
                .removeNthFromEnd(node,3);
        printList(out);
    }
}