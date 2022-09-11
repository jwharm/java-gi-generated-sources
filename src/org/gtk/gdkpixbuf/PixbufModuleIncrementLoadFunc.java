package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {

        void onPixbufModuleIncrementLoadFunc(jdk.incubator.foreign.MemoryAddress context, byte[] buf);
}
