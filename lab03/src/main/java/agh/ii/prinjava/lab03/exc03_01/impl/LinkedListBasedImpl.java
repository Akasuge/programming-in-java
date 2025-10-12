package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;

/**
 * A simple implementation of QueueOfInts using a doubly linked list.
 */
public class LinkedListBasedImpl implements QueueOfInts {

    private static class Node {
        int elem;
        Node next;
        Node prev;

        public Node(int elem) {
            this.elem = elem;
        }
    }

    private Node first = null;
    private Node last = null;
    private int numOfElems = 0;

    @Override
    public void enqueue(int x) {
        Node newNode = new Node(x);
        if (last == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        numOfElems++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = first.elem;
        first = first.next;
        if (first == null) {
            last = null;
        } else {
            first.prev = null;
        }
        numOfElems--;
        return value;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return first.elem;
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }
}
