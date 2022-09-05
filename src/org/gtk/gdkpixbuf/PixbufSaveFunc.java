package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufSaveFunc {

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
    public boolean onPixbufSaveFunc(byte[] buf, long count, org.gtk.glib.Error[] error, jdk.incubator.foreign.MemoryAddress data);
}
