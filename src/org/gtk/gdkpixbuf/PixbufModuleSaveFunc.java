package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleSaveFunc {

        void onPixbufModuleSaveFunc(jdk.incubator.foreign.MemoryAddress f, Pixbuf pixbuf, java.lang.String[] paramKeys);
}
