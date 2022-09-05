package org.gtk.gobject;

@FunctionalInterface
public interface BoxedCopyFunc {

    /**
     * This function is provided by the user and should produce a copy
     * of the passed in boxed structure.
     */
    public jdk.incubator.foreign.MemoryAddress onBoxedCopyFunc(jdk.incubator.foreign.MemoryAddress boxed);
}
