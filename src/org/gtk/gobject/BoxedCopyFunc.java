package org.gtk.gobject;

/**
 * This function is provided by the user and should produce a copy
 * of the passed in boxed structure.
 */
@FunctionalInterface
public interface BoxedCopyFunc {
        jdk.incubator.foreign.MemoryAddress onBoxedCopyFunc(jdk.incubator.foreign.MemoryAddress boxed);
}
