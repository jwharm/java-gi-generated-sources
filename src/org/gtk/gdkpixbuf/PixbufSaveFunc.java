package org.gtk.gdkpixbuf;

/**
 * Save functions used by {@link org.gtk.gdkpixbuf.Pixbuf#saveToCallback}.
 * <p>
 * This function is called once for each block of bytes that is &#34;written&#34;
 * by <code>gdk_pixbuf_save_to_callback()</code>.
 * <p>
 * If successful it should return <code>TRUE</code>; if an error occurs it should set<code>error</code> and return <code>FALSE</code>, in which case <code>gdk_pixbuf_save_to_callback()</code>
 * will fail with the same error.
 */
@FunctionalInterface
public interface PixbufSaveFunc {
        boolean onPixbufSaveFunc(byte[] buf, long count);
}
