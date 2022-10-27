package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function used to fill a
 * {@link PixbufFormat} structure with information about a module.
 * @version 2.2
 */
@FunctionalInterface
public interface PixbufModuleFillInfoFunc {
        void onPixbufModuleFillInfoFunc(@NotNull org.gtk.gdkpixbuf.PixbufFormat info);
}
