package org.gtk.glib;

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return %TRUE if both values are equal
 * and %FALSE otherwise.
 */
@FunctionalInterface
public interface EqualFunc {
        boolean onEqualFunc(jdk.incubator.foreign.MemoryAddress a, jdk.incubator.foreign.MemoryAddress b);
}
