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
        ListNode smallNode = new ListNode();
        ListNode greaterNode = new ListNode();
        ListNode newHead = smallNode;
        ListNode greaterHead = greaterNode;

        while (curNode != null) {
            if (curNode.getValue() < x) {
                smallNode.setNextNode(curNode);
                smallNode = smallNode.getNextNode();
            } else {
                greaterNode.setNextNode(curNode);
                greaterNode = greaterNode.getNextNode();
            }
            curNode = curNode.getNextNode();
        }
        greaterNode.setNextNode(null);
        smallNode.setNextNode(greaterHead.getNextNode());
        return newHead.getNextNode();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(2);

        head.setNextNode(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);

        ListNode newHead = SplitLinkedList.solution(head, 3);

        ListNode curNode = newHead;
        while (curNode != null) {
            System.out.println(curNode.getValue());
            ListNode nextNode = curNode.getNextNode();
            curNode = nextNode;
        }
    }
}
