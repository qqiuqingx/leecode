package com.company.addTwoNumbers;



/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *

 */
public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode listNode1 = new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5))));

        ListNode solution = ce(listNode, listNode1,0);
        System.out.println(listNode);
        System.out.println(listNode1);
        System.out.println(solution);

    }
    private static ListNode ce(ListNode l1, ListNode l2, int isc){
        if (l1==null&&l2==null&&isc==0) return null;
        int add=(l1==null?0:l1.val)+(l2==null?0:l2.val)+isc;
        ListNode listNode = new ListNode(add % 10);

            ListNode recur = ce(l1==null?l1:l1.next, l2==null?l2:l2.next, add>=10?1:0);
            listNode.next=recur;
            return listNode;


    }



    }



