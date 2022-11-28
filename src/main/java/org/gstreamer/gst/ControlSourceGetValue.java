package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function for returning a value for a given timestamp.
 */
@FunctionalInterface
public interface ControlSourceGetValue {
        boolean onControlSourceGetValue(@NotNull org.gstreamer.gst.ControlSource self, @NotNull org.gstreamer.gst.ClockTime timestamp, PointerDouble value);
}
