package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function that gets called every time a region
 * of {@code pixbuf} is updated.
 * <p>
 * {@link PixbufLoader} uses a function of this type to emit the
 * "&lt;link linkend="GdkPixbufLoader-area-updated"&gt;area_updated&lt;/link&gt;"
 * signal.
 */
@FunctionalInterface
public interface PixbufModuleUpdatedFunc {
        void onPixbufModuleUpdatedFunc(@NotNull Pixbuf pixbuf, @NotNull int x, @NotNull int y, @NotNull int width, @NotNull int height);
}
