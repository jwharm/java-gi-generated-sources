package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Loads a file from a standard C file stream into a new {@code GdkPixbufAnimation}.
 * <p>
 * In case of error, this function should return {@code NULL} and set the {@code error} argument.
 */
@FunctionalInterface
public interface PixbufModuleLoadAnimationFunc {
        org.gtk.gdkpixbuf.PixbufAnimation onPixbufModuleLoadAnimationFunc(@Nullable java.lang.foreign.MemoryAddress f);
}
