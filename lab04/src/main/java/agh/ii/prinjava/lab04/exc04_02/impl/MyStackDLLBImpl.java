package agh.ii.prinjava.lab04.exc04_02.impl;

import agh.ii.prinjava.lab04.exc04_02.MyStack;
import java.util.NoSuchElementException;


public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems = new DLinkList<>();

    @Override
    public E pop() {
        if (elems.isEmpty()) throw new NoSuchElementException("stack is empty");
        return elems.removeFirst();
    }

    @Override
    public void push(E x) { elems.addFirst(x); }

    @Override
    public int numOfElems() { return elems.size(); }

    @Override
    public E peek() {
        if (elems.isEmpty()) throw new NoSuchElementException("stack is empty");
        return elems.peekFirst();
    }
}
