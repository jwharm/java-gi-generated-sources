package org.gtk.glib;

/**
 * A #GSequenceIterCompareFunc is a function used to compare iterators.
 * It must return zero if the iterators compare equal, a negative value
 * if @a comes before @b, and a positive value if @b comes before @a.
 */
@FunctionalInterface
public interface SequenceIterCompareFunc {
        int onSequenceIterCompareFunc(SequenceIter a, SequenceIter b);
}
