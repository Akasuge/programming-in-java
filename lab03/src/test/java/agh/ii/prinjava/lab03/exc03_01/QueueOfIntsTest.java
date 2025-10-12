package agh.ii.prinjava.lab03.exc03_01.impl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListBasedImplTest {

    @Test
    void testEnqueueAndDequeue() {
        LinkedListBasedImpl queue = new LinkedListBasedImpl();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.numOfElems());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testPeek() {
        LinkedListBasedImpl queue = new LinkedListBasedImpl();
        queue.enqueue(10);
        assertEquals(10, queue.peek());
        assertEquals(10, queue.peek()); // still the same
    }

    @Test
    void testDequeueEmpty() {
        LinkedListBasedImpl queue = new LinkedListBasedImpl();
        assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @Test
    void testPeekEmpty() {
        LinkedListBasedImpl queue = new LinkedListBasedImpl();
        assertThrows(IllegalStateException.class, queue::peek);
    }
}
