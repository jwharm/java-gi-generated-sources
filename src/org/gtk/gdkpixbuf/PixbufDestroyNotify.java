package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;

/**
 * A function of this type is responsible for freeing the pixel array
 * of a pixbuf.
 * <p>
 * The gdk_pixbuf_new_from_data() function lets you pass in a pre-allocated
 * pixel array so that a pixbuf can be created from it; in this case you
 * will need to pass in a function of type {@code GdkPixbufDestroyNotify} so that
 * the pixel data can be freed when the pixbuf is finalized.
 */
@FunctionalInterface
public interface PixbufDestroyNotify {
        void onPixbufDestroyNotify(PointerIterator<Byte> pixels);
}
