package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Loads XPM data into a new {@code GdkPixbuf}.
 */
@FunctionalInterface
public interface PixbufModuleLoadXpmDataFunc {
        Pixbuf onPixbufModuleLoadXpmDataFunc(@NotNull PointerString data);
}
