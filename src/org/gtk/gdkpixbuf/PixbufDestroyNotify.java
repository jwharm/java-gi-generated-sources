package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufDestroyNotify {

        void onPixbufDestroyNotify(byte[] pixels);
}
