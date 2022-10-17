package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of function that can be called before and after parsing.
 */
@FunctionalInterface
public interface OptionParseFunc {
        boolean onOptionParseFunc(@NotNull OptionContext context, @NotNull OptionGroup group);
}
