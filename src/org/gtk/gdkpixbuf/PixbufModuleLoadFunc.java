package org.gtk.gdkpixbuf;

/**
 * Loads a file from a standard C file stream into a new {@code GdkPixbuf}.
 * <p>
 * In case of error, this function should return {@code NULL} and set the {@code error} argument.
 */
@FunctionalInterface
public interface PixbufModuleLoadFunc {
        Pixbuf onPixbufModuleLoadFunc(java.lang.foreign.MemoryAddress f);
}
