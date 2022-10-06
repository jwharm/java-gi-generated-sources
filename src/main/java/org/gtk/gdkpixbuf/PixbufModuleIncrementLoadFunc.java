package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;

/**
 * Incrementally loads a buffer into the image data.
 */
@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {
        boolean onPixbufModuleIncrementLoadFunc(java.lang.foreign.MemoryAddress context, PointerByte buf, int size);
}
