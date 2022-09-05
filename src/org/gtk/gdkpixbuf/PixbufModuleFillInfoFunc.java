package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleFillInfoFunc {

    /**
     * Defines the type of the function used to fill a
     * #GdkPixbufFormat structure with information about a module.
     */
    public void onPixbufModuleFillInfoFunc(PixbufFormat info);
}
