package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the message handler function.
 */
@FunctionalInterface
public interface ScannerMsgFunc {
        void onScannerMsgFunc(@NotNull org.gtk.glib.Scanner scanner, @NotNull java.lang.String message, boolean error);
}
