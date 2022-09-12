package org.gtk.gdkpixbuf;

/**
 * Loads a file from a standard C file stream into a new `GdkPixbufAnimation`.
 * 
 * In case of error, this function should return `NULL` and set the `error` argument.
 */
@FunctionalInterface
public interface PixbufModuleLoadAnimationFunc {
        PixbufAnimation onPixbufModuleLoadAnimationFunc(jdk.incubator.foreign.MemoryAddress f);
}
