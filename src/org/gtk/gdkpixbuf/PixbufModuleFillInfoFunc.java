package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;

/**
 * Defines the type of the function used to fill a
 * {@link PixbufFormat} structure with information about a module.
 */
@FunctionalInterface
public interface PixbufModuleFillInfoFunc {
        void onPixbufModuleFillInfoFunc(PixbufFormat info);
}
