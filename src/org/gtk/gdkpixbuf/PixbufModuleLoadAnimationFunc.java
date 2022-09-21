package org.gtk.gdkpixbuf;

/**
 * Loads a file from a standard C file stream into a new {@code GdkPixbufAnimation}.
 * <p>
 * In case of error, this function should return {@code NULL} and set the {@code error} argument.
 */
@FunctionalInterface
public interface PixbufModuleLoadAnimationFunc {
        PixbufAnimation onPixbufModuleLoadAnimationFunc(jdk.incubator.foreign.MemoryAddress f);
}
