package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of function to be used as callback when a parse error occurs.
 */
@FunctionalInterface
public interface OptionErrorFunc {
        void onOptionErrorFunc(@NotNull OptionContext context, @NotNull OptionGroup group);
}
