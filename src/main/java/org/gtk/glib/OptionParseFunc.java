package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function that can be called before and after parsing.
 */
@FunctionalInterface
public interface OptionParseFunc {
        boolean onOptionParseFunc(@NotNull org.gtk.glib.OptionContext context, @NotNull org.gtk.glib.OptionGroup group);
}
