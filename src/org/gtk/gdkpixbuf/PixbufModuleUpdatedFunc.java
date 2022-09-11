package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleUpdatedFunc {

        void onPixbufModuleUpdatedFunc(Pixbuf pixbuf, int x, int y, int width, int height);
}
