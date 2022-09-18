package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function used to set the vtable of a
 * {@link org.gtk.gdkpixbuf.PixbufModule} when it is loaded.
 */
@FunctionalInterface
public interface PixbufModuleFillVtableFunc {
        void onPixbufModuleFillVtableFunc(PixbufModule module);
}
