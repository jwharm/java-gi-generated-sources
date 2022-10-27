package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function used to set the vtable of a
 * {@link PixbufModule} when it is loaded.
 * @version 2.2
 */
@FunctionalInterface
public interface PixbufModuleFillVtableFunc {
        void onPixbufModuleFillVtableFunc(@NotNull org.gtk.gdkpixbuf.PixbufModule module);
}
