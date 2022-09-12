package org.gtk.gdkpixbuf;

/**
 * Save functions used by [method@GdkPixbuf.Pixbuf.save_to_callback].
 * 
 * This function is called once for each block of bytes that is "written"
 * by `gdk_pixbuf_save_to_callback()`.
 * 
 * If successful it should return `TRUE`; if an error occurs it should set
 * `error` and return `FALSE`, in which case `gdk_pixbuf_save_to_callback()`
 * will fail with the same error.
 */
@FunctionalInterface
public interface PixbufSaveFunc {
        boolean onPixbufSaveFunc(byte[] buf, long count);
}
