package com.clin.chace.demo.logic.LinkedList;

public class ListNode {

    private int value;

    private ListNode nextNode;


    public ListNode() {

    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public int getValue() {
        return this.value;
    }

    public ListNode getNextNode() {
        return this.nextNode;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }
}
