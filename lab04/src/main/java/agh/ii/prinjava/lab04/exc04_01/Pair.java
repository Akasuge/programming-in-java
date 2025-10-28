package agh.ii.prinjava.lab04.exc04_01;

import java.util.Objects;

public class Pair<F, S> implements Cloneable {
    private F fst;
    private S snd;

    // Constructor
    public Pair(F fst, S snd) {
        this.fst = fst;
        this.snd = snd;
    }

    // Getters
    public F getFst() {
        return fst;
    }

    public S getSnd() {
        return snd;
    }

    // Setters
    public void setFst(F fst) {
        this.fst = fst;
    }

    public void setSnd(S snd) {
        this.snd = snd;
    }

    // toString
    @Override
    public String toString() {
        return "Pair(" + fst + ", " + snd + ")";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?> pair)) return false;
        return Objects.equals(fst, pair.fst) && Objects.equals(snd, pair.snd);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(fst, snd);
    }

    // clone
    @Override
    public Pair<F, S> clone() {
        try {
            @SuppressWarnings("unchecked")
            Pair<F, S> cloned = (Pair<F, S>) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should not occur since we implement Cloneable
        }
    }
}
