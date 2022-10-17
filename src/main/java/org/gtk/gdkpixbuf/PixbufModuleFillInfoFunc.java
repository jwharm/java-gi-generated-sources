package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function used to fill a
 * {@link PixbufFormat} structure with information about a module.
 */
@FunctionalInterface
public interface PixbufModuleFillInfoFunc {
        void onPixbufModuleFillInfoFunc(@NotNull PixbufFormat info);
}
