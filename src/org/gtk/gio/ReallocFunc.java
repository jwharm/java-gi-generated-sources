package org.gtk.gio;

@FunctionalInterface
public interface ReallocFunc {

    /**
     * Changes the size of the memory block pointed to by @data to
     * @size bytes.
     * 
     * The function should have the same semantics as realloc().
     */
    public jdk.incubator.foreign.MemoryAddress onReallocFunc(jdk.incubator.foreign.MemoryAddress data, long size);
}
