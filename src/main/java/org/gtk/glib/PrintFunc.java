package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the print handler functions.
 * These are called with the complete formatted string to output.
 */
@FunctionalInterface
public interface PrintFunc {
        void onPrintFunc(@NotNull java.lang.String string);
}
