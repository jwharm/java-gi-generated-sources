package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;

/**
 * Defines the type of the function used to set the vtable of a
 * {@link PixbufModule} when it is loaded.
 */
@FunctionalInterface
public interface PixbufModuleFillVtableFunc {
        void onPixbufModuleFillVtableFunc(PixbufModule module);
}
