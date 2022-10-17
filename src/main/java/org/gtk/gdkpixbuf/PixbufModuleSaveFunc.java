package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Saves a {@code GdkPixbuf} into a standard C file stream.
 * <p>
 * The optional {@code param_keys} and {@code param_values} arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
@FunctionalInterface
public interface PixbufModuleSaveFunc {
        boolean onPixbufModuleSaveFunc(@Nullable java.lang.foreign.MemoryAddress f, @NotNull Pixbuf pixbuf, @Nullable PointerString paramKeys, @Nullable PointerString paramValues);
}
