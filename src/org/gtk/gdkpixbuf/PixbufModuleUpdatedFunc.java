package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function that gets called every time a region
 * of @pixbuf is updated.
 * 
 * #GdkPixbufLoader uses a function of this type to emit the
 * "<link linkend="GdkPixbufLoader-area-updated">area_updated</link>"
 * signal.
 */
@FunctionalInterface
public interface PixbufModuleUpdatedFunc {
        void onPixbufModuleUpdatedFunc(Pixbuf pixbuf, int x, int y, int width, int height);
}
