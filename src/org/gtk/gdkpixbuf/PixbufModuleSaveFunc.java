package org.gtk.gdkpixbuf;

/**
 * Saves a <code>GdkPixbuf</code> into a standard C file stream.
 * <p>
 * The optional <code>param_keys</code> and <code>param_values</code> arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
@FunctionalInterface
public interface PixbufModuleSaveFunc {
        boolean onPixbufModuleSaveFunc(jdk.incubator.foreign.MemoryAddress f, Pixbuf pixbuf, java.lang.String[] paramKeys, java.lang.String[] paramValues);
}
