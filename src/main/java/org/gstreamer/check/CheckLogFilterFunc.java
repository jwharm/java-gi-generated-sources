package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that is called for messages matching the filter added by
 * {@code gst_check_add_log_filter}.
 * @version 1.12
 */
@FunctionalInterface
public interface CheckLogFilterFunc {
        boolean onCheckLogFilterFunc(@NotNull java.lang.String logDomain, @NotNull org.gtk.glib.LogLevelFlags logLevel, @NotNull java.lang.String message);
}
