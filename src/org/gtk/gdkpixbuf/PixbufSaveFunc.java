package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufSaveFunc {

        void onPixbufSaveFunc(byte[] buf, long count, org.gtk.glib.Error[] error);
}
