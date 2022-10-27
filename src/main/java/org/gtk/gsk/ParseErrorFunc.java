package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of callback that is called when an error occurs
 * during node deserialization.
 */
@FunctionalInterface
public interface ParseErrorFunc {
        void onParseErrorFunc(@NotNull org.gtk.gsk.ParseLocation start, @NotNull org.gtk.gsk.ParseLocation end, @NotNull org.gtk.glib.Error error);
}
