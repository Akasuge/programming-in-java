package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 * <p>
 * Defines the basic operations of a stack (Last-In-First-Out - LIFO)
 */
public interface StackOfInts {

    /**
     * Removes and returns the top element of the stack
     *
     * @return the top element
     * @throws IllegalStateException if the stack is empty
     */
    int pop();

    /**
     * Pushes an element onto the top of the stack
     *
     * @param x the integer to push
     */
    void push(int x);

    /**
     * Checks whether the stack is empty
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Returns the number of elements in the stack
     *
     * @return the number of elements
     */
    int numOfElems();

    /**
     * Returns the top element without removing it
     *
     * @return the top element
     * @throws IllegalStateException if the stack is empty
     */
    int peek();
}
