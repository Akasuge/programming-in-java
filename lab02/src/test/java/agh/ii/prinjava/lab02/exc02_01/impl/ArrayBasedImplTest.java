package agh.ii.prinjava.lab02.exc02_01.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBasedImplTest {

    private ArrayBasedImpl stack;

    @BeforeEach
    void setUp() {
        stack = new ArrayBasedImpl();
    }

    @Test
    void testIsEmptyInitially() {
        assertTrue(stack.isEmpty(), "Stack should be empty at the beginning");
    }

    @Test
    void testPushThenPeek() {
        stack.push(42);
        assertEquals(42, stack.peek(), "Top should be 42");
        assertFalse(stack.isEmpty(), "Stack should not be empty after push");
    }

    @Test
    void testPushThenPop() {
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.pop(), "Should return last pushed element (10)");
        assertEquals(5, stack.pop(), "Should return next element (5)");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

    @Test
    void testNumOfElems() {
        assertEquals(0, stack.numOfElems(), "Initial number of elements should be 0");
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.numOfElems(), "Number of elements should be 2 after two pushes");
    }

    @Test
    void testPopOnEmptyStackThrows() {
        assertThrows(IllegalStateException.class, () -> stack.pop(), "Popping empty stack should throw");
    }

    @Test
    void testPeekOnEmptyStackThrows() {
        assertThrows(IllegalStateException.class, () -> stack.peek(), "Peeking empty stack should throw");
    }
}
