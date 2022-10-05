package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * Changes the size of the memory block pointed to by {@code data} to
 * {@code size} bytes.
 * <p>
 * The function should have the same semantics as realloc().
 */
@FunctionalInterface
public interface ReallocFunc {
        java.lang.foreign.MemoryAddress onReallocFunc(long size);
}