package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function for returning an array of values starting at a given timestamp.
 */
@FunctionalInterface
public interface ControlSourceGetValueArray {
        boolean onControlSourceGetValueArray(@NotNull org.gstreamer.gst.ControlSource self, @NotNull org.gstreamer.gst.ClockTime timestamp, @NotNull org.gstreamer.gst.ClockTime interval, int nValues, PointerDouble values);
}
