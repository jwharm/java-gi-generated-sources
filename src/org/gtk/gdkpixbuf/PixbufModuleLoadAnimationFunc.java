package org.gtk.gdkpixbuf;

/**
 * Loads a file from a standard C file stream into a new <code>GdkPixbufAnimation</code>.
 * <p>
 * In case of error, this function should return <code>NULL</code> and set the <code>error</code> argument.
 */
@FunctionalInterface
public interface PixbufModuleLoadAnimationFunc {
        PixbufAnimation onPixbufModuleLoadAnimationFunc(jdk.incubator.foreign.MemoryAddress f);
}
