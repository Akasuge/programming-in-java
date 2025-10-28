package agh.ii.prinjava.lab04.exc04_02.impl;

import agh.ii.prinjava.lab04.exc04_02.MyQueue;
import java.util.NoSuchElementException;


public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private final DLinkList<E> elems = new DLinkList<>();

    @Override
    public void enqueue(E x) { elems.addLast(x); }

    @Override
    public E dequeue() {
        if (elems.isEmpty()) throw new NoSuchElementException("queue is empty");
        return elems.removeFirst();
    }

    @Override
    public int numOfElems() { return elems.size(); }

    @Override
    public E peek() {
        if (elems.isEmpty()) throw new NoSuchElementException("queue is empty");
        return elems.peekFirst();
    }
}
