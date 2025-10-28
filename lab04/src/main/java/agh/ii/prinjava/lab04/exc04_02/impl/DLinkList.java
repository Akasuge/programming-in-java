package agh.ii.prinjava.lab04.exc04_02.impl;

import java.util.NoSuchElementException;


public class DLinkList<E> {
    private Node<E> head, tail;
    private int size;

    private static class Node<T> {
        T elem;
        Node<T> next, prev;
        Node(T e, Node<T> p, Node<T> n) { elem = e; prev = p; next = n; }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void addFirst(E x) {
        Node<E> h = head;
        Node<E> n = new Node<>(x, null, h);
        head = n;
        if (h == null) tail = n; else h.prev = n;
        size++;
    }

    public void addLast(E x) {
        Node<E> t = tail;
        Node<E> n = new Node<>(x, t, null);
        tail = n;
        if (t == null) head = n; else t.next = n;
        size++;
    }

    public E removeFirst() {
        if (head == null) throw new NoSuchElementException("empty");
        E e = head.elem;
        Node<E> n = head.next;
        head = n;
        if (n == null) tail = null; else n.prev = null;
        size--;
        return e;
    }

    public E removeLast() {
        if (tail == null) throw new NoSuchElementException("empty");
        E e = tail.elem;
        Node<E> p = tail.prev;
        tail = p;
        if (p == null) head = null; else p.next = null;
        size--;
        return e;
    }

    public E peekFirst() {
        if (head == null) throw new NoSuchElementException("empty");
        return head.elem;
    }

    public E peekLast() {
        if (tail == null) throw new NoSuchElementException("empty");
        return tail.elem;
    }

    public void clear() { head = tail = null; size = 0; }
}
