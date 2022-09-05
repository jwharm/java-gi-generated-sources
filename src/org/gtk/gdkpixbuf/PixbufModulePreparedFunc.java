package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModulePreparedFunc {

    /**
     * Defines the type of the function that gets called once the initial
     * setup of @pixbuf is done.
     * 
     * #GdkPixbufLoader uses a function of this type to emit the
     * "<link linkend="GdkPixbufLoader-area-prepared">area_prepared</link>"
     * signal.
     */
    public void onPixbufModulePreparedFunc(Pixbuf pixbuf, PixbufAnimation anim, jdk.incubator.foreign.MemoryAddress userData);
}
