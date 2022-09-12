package org.gtk.gdkpixbuf;

/**
 * Incrementally loads a buffer into the image data.
 */
@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {
        boolean onPixbufModuleIncrementLoadFunc(jdk.incubator.foreign.MemoryAddress context, byte[] buf, int size);
}
