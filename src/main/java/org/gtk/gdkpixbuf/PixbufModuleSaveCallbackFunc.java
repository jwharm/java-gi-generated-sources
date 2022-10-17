package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Saves a {@code GdkPixbuf} by calling the provided function.
 * <p>
 * The optional {@code option_keys} and {@code option_values} arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
@FunctionalInterface
public interface PixbufModuleSaveCallbackFunc {
        boolean onPixbufModuleSaveCallbackFunc(@NotNull PixbufSaveFunc saveFunc, @NotNull Pixbuf pixbuf, @Nullable PointerString optionKeys, @Nullable PointerString optionValues);
}
