package org.gtk.gio;

/**
 * Changes the size of the memory block pointed to by @data to
 * @size bytes.
 * 
 * The function should have the same semantics as realloc().
 */
@FunctionalInterface
public interface ReallocFunc {
        jdk.incubator.foreign.MemoryAddress onReallocFunc(long size);
}
