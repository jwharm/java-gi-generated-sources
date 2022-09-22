package org.gtk.glib;

/**
 * Specifies the type of a comparison function used to compare two
 * values.  The function should return a negative integer if the first
 * value comes before the second, 0 if they are equal, or a positive
 * integer if the first value comes after the second.
 */
@FunctionalInterface
public interface CompareDataFunc {
        int onCompareDataFunc(java.lang.foreign.MemoryAddress a, java.lang.foreign.MemoryAddress b);
}
