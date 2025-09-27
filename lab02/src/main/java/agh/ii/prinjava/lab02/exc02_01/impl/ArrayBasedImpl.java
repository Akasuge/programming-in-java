package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Stack implementation using a dynamic array of ints
 */
public class ArrayBasedImpl implements StackOfInts {

    private int[] arr = new int[4]; // initial capacity
    private int numOfElems = 0;     // number of elements in the stack

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack");
        }

        int top = arr[--numOfElems];
        arr[numOfElems] = 0; // optional: clear the popped value

        // shrink array if needed
        if (numOfElems > 0 && numOfElems == arr.length / 4) {
            resize(arr.length / 2);
        }

        return top;
    }

    @Override
    public void push(int x) {
        if (numOfElems == arr.length) {
            resize(arr.length * 2); // grow array when full
        }

        arr[numOfElems++] = x;
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek from an empty stack");
        }
        return arr[numOfElems - 1];
    }

    /**
     * Resize the internal array to a new size
     *
     * @param newSize the new capacity of the array
     */
    private void resize(int newSize) {
        int[] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, numOfElems);
        arr = newArr;
    }
}
