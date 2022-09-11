package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleSaveCallbackFunc {

        void onPixbufModuleSaveCallbackFunc(PixbufSaveFunc saveFunc, jdk.incubator.foreign.MemoryAddress userData, Pixbuf pixbuf, java.lang.String[] optionKeys);
}
