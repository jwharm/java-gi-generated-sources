package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the message handler function.
 */
@FunctionalInterface
public interface ScannerMsgFunc {
        void onScannerMsgFunc(@NotNull Scanner scanner, @NotNull java.lang.String message, @NotNull boolean error);
}
