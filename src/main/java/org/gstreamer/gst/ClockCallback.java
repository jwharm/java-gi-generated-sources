package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The function prototype of the callback.
 */
@FunctionalInterface
public interface ClockCallback {
        boolean onClockCallback(@NotNull org.gstreamer.gst.Clock clock, @NotNull org.gstreamer.gst.ClockTime time, @NotNull org.gstreamer.gst.ClockID id);
}
