package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function that gets called once the initial
 * setup of @pixbuf is done.
 * 
 * {@link org.gtk.gdkpixbuf.PixbufLoader} uses a function of this type to emit the
 * &<code>#34</code> &<code>#60</code> link linkend=&<code>#34</code> GdkPixbufLoader-area-prepared&<code>#34</code> &<code>#62</code> area_prepared&<code>#60</code> /link&<code>#62</code> &<code>#34</code> 
 * signal.
 */
@FunctionalInterface
public interface PixbufModulePreparedFunc {
        void onPixbufModulePreparedFunc(Pixbuf pixbuf, PixbufAnimation anim);
}
