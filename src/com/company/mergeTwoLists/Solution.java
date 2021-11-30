package com.company.mergeTwoLists;

import java.util.Comparator;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 */
public class Solution {





    public static ListNode set2(ListNode list1, ListNode list){
        if (list1==null) return list;
        if (list==null) return list1;


        ListNode  listNode=list1.val<list.val?list1:list;
            listNode.next=set2(listNode.next,list1.val>=list.val?list1:list);

        return listNode;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode1 = set2(listNode, listNode2);
        System.out.println(listNode1);
    }

}
