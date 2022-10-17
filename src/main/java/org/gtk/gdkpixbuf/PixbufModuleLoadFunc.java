package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Loads a file from a standard C file stream into a new {@code GdkPixbuf}.
 * <p>
 * In case of error, this function should return {@code NULL} and set the {@code error} argument.
 */
@FunctionalInterface
public interface PixbufModuleLoadFunc {
        Pixbuf onPixbufModuleLoadFunc(@Nullable java.lang.foreign.MemoryAddress f);
}
