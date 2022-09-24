package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;

/**
 * Saves a {@code GdkPixbuf} into a standard C file stream.
 * <p>
 * The optional {@code param_keys} and {@code param_values} arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
@FunctionalInterface
public interface PixbufModuleSaveFunc {
        boolean onPixbufModuleSaveFunc(java.lang.foreign.MemoryAddress f, Pixbuf pixbuf, java.lang.String[] paramKeys, java.lang.String[] paramValues);
}
