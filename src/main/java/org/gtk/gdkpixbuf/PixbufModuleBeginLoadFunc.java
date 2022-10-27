package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Sets up the image loading state.
 * <p>
 * The image loader is responsible for storing the given function pointers
 * and user data, and call them when needed.
 * <p>
 * The image loader should set up an internal state object, and return it
 * from this function; the state object will then be updated from the
 * {@code GdkPixbuf.PixbufModuleIncrementLoadFunc} callback, and will be freed
 * by {@code GdkPixbuf.PixbufModuleStopLoadFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleBeginLoadFunc {
        java.lang.foreign.MemoryAddress onPixbufModuleBeginLoadFunc(@NotNull org.gtk.gdkpixbuf.PixbufModuleSizeFunc sizeFunc, @NotNull org.gtk.gdkpixbuf.PixbufModulePreparedFunc preparedFunc, @NotNull org.gtk.gdkpixbuf.PixbufModuleUpdatedFunc updatedFunc);
}
