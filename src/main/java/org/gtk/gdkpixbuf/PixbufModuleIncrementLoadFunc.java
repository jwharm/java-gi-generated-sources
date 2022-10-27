package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Incrementally loads a buffer into the image data.
 */
@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {
        boolean onPixbufModuleIncrementLoadFunc(@Nullable java.lang.foreign.MemoryAddress context, PointerByte buf, int size);
}
