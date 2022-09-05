package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {

    /**
     * Incrementally loads a buffer into the image data.
     */
    public boolean onPixbufModuleIncrementLoadFunc(jdk.incubator.foreign.MemoryAddress context, byte[] buf, int size);
}
