package org.gtk.gdkpixbuf;

/**
 * Incrementally loads a buffer into the image data.
 */
@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {
        boolean onPixbufModuleIncrementLoadFunc(java.lang.foreign.MemoryAddress context, byte[] buf, int size);
}
