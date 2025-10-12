package agh.ii.prinjava.lab03.exc03_01;

/**
 * Interface for an integer queue.
 */
public interface QueueOfInts {

    /**
     * Adds an element to the end of the queue.
     *
     * @param x the integer to add
     */
    void enqueue(int x);

    /**
     * Removes and returns the first element of the queue.
     *
     * @return the first element
     * @throws IllegalStateException if the queue is empty
     */
    int dequeue();

    /**
     * Checks if the queue is empty.
     *
     * @return true if queue is empty, false otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return the number of elements
     */
    int numOfElems();

    /**
     * Returns the first element without removing it.
     *
     * @return the first element
     * @throws IllegalStateException if the queue is empty
     */
    int peek();
}
