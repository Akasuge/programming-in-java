package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Stack implementation using a linked list (simple and unidirectional).
 */
public class LinkedListBasedImpl implements StackOfInts {

    private static class Node {
        int elem;
        Node next;

        public Node(int elem, Node next) {
            this.elem = elem;
            this.next = next;
        }
    }

    private Node first = null; // top of the stack
    private int numOfElems = 0;

    /**
     * Removes and returns the top element of the stack
     *
     * @return the removed element
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = first.elem;
        first = first.next;
        numOfElems--;
        return value;
    }

    /**
     * Adds an element to the top of the stack
     *
     * @param x the element to add
     */
    @Override
    public void push(int x) {
        first = new Node(x, first);
        numOfElems++;
    }

    /**
     * Returns the number of elements in the stack
     *
     * @return number of elements
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * Returns the top element of the stack without removing it
     *
     * @return the top element
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return first.elem;
    }
}
