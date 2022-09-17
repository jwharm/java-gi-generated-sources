package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function that gets called every time a region
 * of @pixbuf is updated.
 * 
 * #GdkPixbufLoader uses a function of this type to emit the
 * &#34;&#60;link linkend=&#34;GdkPixbufLoader-area-updated&#34;&#62;area_updated&#60;/link&#62;&#34;
 * signal.
 */
@FunctionalInterface
public interface PixbufModuleUpdatedFunc {
        void onPixbufModuleUpdatedFunc(Pixbuf pixbuf, int x, int y, int width, int height);
}
