package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;

/**
 * Save functions used by {@link Pixbuf#saveToCallback}.
 * <p>
 * This function is called once for each block of bytes that is "written"
 * by {@code gdk_pixbuf_save_to_callback()}.
 * <p>
 * If successful it should return {@code TRUE}; if an error occurs it should set
 * {@code error} and return {@code FALSE}, in which case {@code gdk_pixbuf_save_to_callback()}
 * will fail with the same error.
 */
@FunctionalInterface
public interface PixbufSaveFunc {
        boolean onPixbufSaveFunc(PointerIterator<Byte> buf, long count);
}
