package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function that gets called once the initial
 * setup of @pixbuf is done.
 * 
 * #GdkPixbufLoader uses a function of this type to emit the
 * &#34;&#60;link linkend=&#34;GdkPixbufLoader-area-prepared&#34;&#62;area_prepared&#60;/link&#62;&#34;
 * signal.
 */
@FunctionalInterface
public interface PixbufModulePreparedFunc {
        void onPixbufModulePreparedFunc(Pixbuf pixbuf, PixbufAnimation anim);
}
