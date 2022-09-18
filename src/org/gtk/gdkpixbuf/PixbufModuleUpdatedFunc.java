package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function that gets called every time a region
 * of @pixbuf is updated.
 * 
 * {@link org.gtk.gdkpixbuf.PixbufLoader} uses a function of this type to emit the
 * &<code>#34</code> &<code>#60</code> link linkend=&<code>#34</code> GdkPixbufLoader-area-updated&<code>#34</code> &<code>#62</code> area_updated&<code>#60</code> /link&<code>#62</code> &<code>#34</code> 
 * signal.
 */
@FunctionalInterface
public interface PixbufModuleUpdatedFunc {
        void onPixbufModuleUpdatedFunc(Pixbuf pixbuf, int x, int y, int width, int height);
}
