package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;

/**
 * Finalizes the image loading state.
 * <p>
 * This function is called on success and error states.
 */
@FunctionalInterface
public interface PixbufModuleStopLoadFunc {
        boolean onPixbufModuleStopLoadFunc(java.lang.foreign.MemoryAddress context);
}
