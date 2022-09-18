package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function used to fill a
 * {@link org.gtk.gdkpixbuf.PixbufFormat} structure with information about a module.
 */
@FunctionalInterface
public interface PixbufModuleFillInfoFunc {
        void onPixbufModuleFillInfoFunc(PixbufFormat info);
}
