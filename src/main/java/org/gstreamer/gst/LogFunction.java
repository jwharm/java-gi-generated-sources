package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function prototype for a logging function that can be registered with
 * gst_debug_add_log_function().
 * Use G_GNUC_NO_INSTRUMENT on that function.
 */
@FunctionalInterface
public interface LogFunction {
        void onLogFunction(@NotNull org.gstreamer.gst.DebugCategory category, @NotNull org.gstreamer.gst.DebugLevel level, @NotNull java.lang.String file, @NotNull java.lang.String function, int line, @NotNull org.gtk.gobject.Object object, @NotNull org.gstreamer.gst.DebugMessage message);
}
