package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Incrementally loads a buffer into the image data.
 */
@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {
        boolean onPixbufModuleIncrementLoadFunc(@Nullable java.lang.foreign.MemoryAddress context, @NotNull PointerByte buf, @NotNull int size);
}
