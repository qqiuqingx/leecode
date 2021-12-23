package com.company.hasCycle;

public class ListNode {
       public     int val;
        protected    ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    ListNode(int x,ListNode next) {
        val = x;
        this.next = next;
    }



}
