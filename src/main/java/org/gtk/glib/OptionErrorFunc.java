package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function to be used as callback when a parse error occurs.
 */
@FunctionalInterface
public interface OptionErrorFunc {
        void onOptionErrorFunc(@NotNull org.gtk.glib.OptionContext context, @NotNull org.gtk.glib.OptionGroup group);
}
