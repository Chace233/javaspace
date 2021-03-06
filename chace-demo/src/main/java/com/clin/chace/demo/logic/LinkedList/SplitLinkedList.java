package com.clin.chace.demo.logic.LinkedList;

/**
 * 解题思路：
 * 申请两个链表 smallList 和 greaterList，分别存储链表中小于X和大约等于X的节点，直接遍历链表，将小于
 * X的节点存入smallList，将大于等于X的节点存储greaterList
 *
 * 注意点：
 * 在遍历完链表之后，要将greaterNode.next设置为null，最后一步greaterNode=curNode，curNode是有nextNode，
 * 不清楚greaterNode.next会导致链表环的出现
 */
public class SplitLinkedList {

    public static ListNode solution(ListNode head, int x) {
        ListNode curNode = head;
        ListNode smallNode = new ListNode(0);
        ListNode greaterNode = new ListNode(0);
        ListNode newHead = smallNode;
        ListNode greaterHead = greaterNode;

        while (curNode != null) {
            if (curNode.val < x) {
                smallNode.next = curNode;
                smallNode = smallNode.next;
            } else {
                greaterNode.next = curNode;
                greaterNode = greaterNode.next;
            }
            curNode = curNode.next;
        }
        greaterNode.next = null;
        smallNode.next = greaterHead.next;
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(2);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode newHead = SplitLinkedList.solution(head, 3);

        ListNode curNode = newHead;
        while (curNode != null) {
            System.out.println(curNode.val);
            ListNode nextNode = curNode.next;
            curNode = nextNode;
        }
    }
}
