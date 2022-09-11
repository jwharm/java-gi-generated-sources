package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function that gets called once the initial
 * setup of @pixbuf is done.
 * 
 * #GdkPixbufLoader uses a function of this type to emit the
 * "<link linkend="GdkPixbufLoader-area-prepared">area_prepared</link>"
 * signal.
 */
@FunctionalInterface
public interface PixbufModulePreparedFunc {
        void onPixbufModulePreparedFunc(Pixbuf pixbuf, PixbufAnimation anim);
}
