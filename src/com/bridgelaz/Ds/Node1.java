package com.bridgelaz.Ds;

public class Node1 {

    public int data;
    public Node next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
}