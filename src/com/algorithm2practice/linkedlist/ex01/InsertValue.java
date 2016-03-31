package com.algorithm2practice.linkedlist.ex01;

import java.util.*;

/**
 * 环形链表插值练习题
 * <p>
 * 有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，并且保证这个环形单链表依然有序。
 * 给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，请构造出这个环形链表，并插入该值。
 * 测试样例：
 * [1,3,4,5,7],[1,2,3,4,0],2
 * 返回：{1,2,3,4,5,7}
 */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class InsertValue {
    public ListNode insert(int[] A, int[] nxt, int val) {
        if (A == null || A.length <= 0) {
            return null;
        }

        ListNode now = new ListNode(val);

        if (A.length <= 1) {
            return now;
        }

        ListNode head = new ListNode(A[0]);
        ListNode node = head;
        ListNode next;
        for (int i = 1; i < A.length; i++) {
            next = new ListNode(A[i]);
            node.next = next;
            node = next;
        }

        if (val < head.val) {
            now.next = head;
            head = now;
        } else if (val > node.val) {
            node.next = now;
        } else {
            node = head;
            while (node.next != null) {
                if (val >= node.val && val <= node.next.val) {
                    now.next = node.next;
                    node.next = now;
                    break;
                }
                node = node.next;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}