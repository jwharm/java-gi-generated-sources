package org.gtk.gio;

/**
 * Changes the size of the memory block pointed to by {@code data} to
 * {@code size} bytes.
 * <p>
 * The function should have the same semantics as realloc().
 */
@FunctionalInterface
public interface ReallocFunc {
        jdk.incubator.foreign.MemoryAddress onReallocFunc(long size);
}
