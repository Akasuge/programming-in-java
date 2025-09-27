package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBasedImplTest {

    @Test
    void testPushAndPop() {
        StackOfInts stack = new LinkedListBasedImpl();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void testIsEmpty() {
        StackOfInts stack = new LinkedListBasedImpl();
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeek() {
        StackOfInts stack = new LinkedListBasedImpl();
        stack.push(42);
        assertEquals(42, stack.peek());

        stack.push(99);
        assertEquals(99, stack.peek());
        assertEquals(99, stack.pop());
        assertEquals(42, stack.peek());
    }

    @Test
    void testNumOfElems() {
        StackOfInts stack = new LinkedListBasedImpl();
        assertEquals(0, stack.numOfElems());

        stack.push(1);
        assertEquals(1, stack.numOfElems());

        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.numOfElems());

        stack.pop();
        assertEquals(2, stack.numOfElems());
    }

    @Test
    void testPopOnEmptyThrows() {
        StackOfInts stack = new LinkedListBasedImpl();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void testPeekOnEmptyThrows() {
        StackOfInts stack = new LinkedListBasedImpl();
        assertThrows(IllegalStateException.class, stack::peek);
    }
}
