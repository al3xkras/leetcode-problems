package com.al3xkras.leetcode_problems.medium;

public class Problem2_AddTwoNumbers {
     public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode iterNode = new ListNode();
            ListNode head = iterNode;
            ListNode l1Iter = l1;
            ListNode l2Iter = l2;
            long nextRegister = 0;

            while (l1Iter!=null || l2Iter!=null || nextRegister!=0) {
                long sum = 0;
                if (l1Iter!=null) {
                    sum+=l1Iter.val;
                    l1Iter=l1Iter.next;
                }
                if (l2Iter!=null) {
                    sum+=l2Iter.val;
                    l2Iter = l2Iter.next;
                }
                sum+=nextRegister;
                nextRegister = sum/10;
                sum = sum % 10;
                iterNode.val = (int) sum;
                if (l1Iter!=null || l2Iter!=null || nextRegister!=0){
                    iterNode.next = new ListNode();
                    iterNode = iterNode.next;
                }
            }
            return head;
        }
    }
}
