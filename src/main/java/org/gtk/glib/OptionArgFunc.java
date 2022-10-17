package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of function to be passed as callback for {@link OptionArg#CALLBACK}
 * options.
 */
@FunctionalInterface
public interface OptionArgFunc {
        boolean onOptionArgFunc(@NotNull java.lang.String optionName, @NotNull java.lang.String value);
}
