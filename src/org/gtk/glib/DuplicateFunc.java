package org.gtk.glib;

@FunctionalInterface
public interface DuplicateFunc {

    /**
     * The type of functions that are used to 'duplicate' an object.
     * What this means depends on the context, it could just be
     * incrementing the reference count, if @data is a ref-counted
     * object.
     */
    public jdk.incubator.foreign.MemoryAddress onDuplicateFunc(jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress userData);
}
