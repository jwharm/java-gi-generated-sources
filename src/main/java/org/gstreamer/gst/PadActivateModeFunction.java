package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype of the push and pull activate functions.
 */
@FunctionalInterface
public interface PadActivateModeFunction {
        boolean onPadActivateModeFunction(@NotNull org.gstreamer.gst.Pad pad, @NotNull org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.PadMode mode, boolean active);
}
