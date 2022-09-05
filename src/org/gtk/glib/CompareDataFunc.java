package org.gtk.glib;

@FunctionalInterface
public interface CompareDataFunc {

    /**
     * Specifies the type of a comparison function used to compare two
     * values.  The function should return a negative integer if the first
     * value comes before the second, 0 if they are equal, or a positive
     * integer if the first value comes after the second.
     */
    public int onCompareDataFunc(jdk.incubator.foreign.MemoryAddress a, jdk.incubator.foreign.MemoryAddress b, jdk.incubator.foreign.MemoryAddress userData);
}