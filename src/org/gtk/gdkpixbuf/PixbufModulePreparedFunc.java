package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModulePreparedFunc {

        void onPixbufModulePreparedFunc(Pixbuf pixbuf, PixbufAnimation anim);
}
