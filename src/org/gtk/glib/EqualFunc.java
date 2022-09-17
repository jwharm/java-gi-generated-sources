package org.gtk.glib;

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return <code>true</code> if both values are equal
 * and <code>false</code> otherwise.
 */
@FunctionalInterface
public interface EqualFunc {
        boolean onEqualFunc(jdk.incubator.foreign.MemoryAddress a, jdk.incubator.foreign.MemoryAddress b);
}
