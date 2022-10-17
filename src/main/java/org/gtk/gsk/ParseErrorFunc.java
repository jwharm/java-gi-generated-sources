package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Type of callback that is called when an error occurs
 * during node deserialization.
 */
@FunctionalInterface
public interface ParseErrorFunc {
        void onParseErrorFunc(@NotNull ParseLocation start, @NotNull ParseLocation end, @NotNull org.gtk.glib.Error error);
}
