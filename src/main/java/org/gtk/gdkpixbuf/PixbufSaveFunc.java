package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Save functions used by {@link Pixbuf#saveToCallback}.
 * <p>
 * This function is called once for each block of bytes that is "written"
 * by {@code gdk_pixbuf_save_to_callback()}.
 * <p>
 * If successful it should return {@code TRUE}; if an error occurs it should set
 * {@code error} and return {@code FALSE}, in which case {@code gdk_pixbuf_save_to_callback()}
 * will fail with the same error.
 * @version 2.4
 */
@FunctionalInterface
public interface PixbufSaveFunc {
        boolean onPixbufSaveFunc(PointerByte buf, long count, @NotNull Out<PointerProxy<org.gtk.glib.Error>> error);
}
