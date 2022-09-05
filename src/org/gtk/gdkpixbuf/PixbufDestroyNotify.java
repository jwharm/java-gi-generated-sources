package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufDestroyNotify {

    /**
     * A function of this type is responsible for freeing the pixel array
     * of a pixbuf.
     * 
     * The gdk_pixbuf_new_from_data() function lets you pass in a pre-allocated
     * pixel array so that a pixbuf can be created from it; in this case you
     * will need to pass in a function of type `GdkPixbufDestroyNotify` so that
     * the pixel data can be freed when the pixbuf is finalized.
     */
    public void onPixbufDestroyNotify(byte[] pixels, jdk.incubator.foreign.MemoryAddress data);
}
