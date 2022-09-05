package org.gtk.glib;

@FunctionalInterface
public interface SequenceIterCompareFunc {

    /**
     * A #GSequenceIterCompareFunc is a function used to compare iterators.
     * It must return zero if the iterators compare equal, a negative value
     * if @a comes before @b, and a positive value if @b comes before @a.
     */
    public int onSequenceIterCompareFunc(SequenceIter a, SequenceIter b, jdk.incubator.foreign.MemoryAddress data);
}
