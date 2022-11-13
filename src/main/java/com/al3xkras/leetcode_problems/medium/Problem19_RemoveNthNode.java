package com.al3xkras.leetcode_problems.medium;

import java.util.Deque;
import java.util.LinkedList;

import static com.al3xkras.leetcode_problems.medium.Problem2_AddTwoNumbers.*;

public class Problem19_RemoveNthNode {
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
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head.next==null && n==1)
                return null;

            Deque<ListNode> buffer = new LinkedList<>();
            ListNode iter = head;
            while (buffer.size()<n){
                buffer.add(iter);
                if (iter.next==null) {
                    iter = null;
                    break;
                }
                iter = iter.next;
            }
            if (iter==null && buffer.size()==n){
                return head.next;
            }
            if (buffer.size()<n){
                return head;
            }
            ListNode lastRemoved=null;
            while (iter!=null){
                lastRemoved=buffer.removeFirst();
                buffer.addLast(iter);
                iter=iter.next;
            }
            if (lastRemoved==null)
                return head;
            buffer.removeFirst();
            if (buffer.isEmpty())
                lastRemoved.next=null;
            else
                lastRemoved.next=buffer.getFirst();
            return head;
        }
    }
}
