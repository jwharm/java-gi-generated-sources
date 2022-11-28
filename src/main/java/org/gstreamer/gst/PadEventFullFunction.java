package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature to handle an event for the pad.
 * <p>
 * This variant is for specific elements that will take into account the
 * last downstream flow return (from a pad push), in which case they can
 * return it.
 * @version 1.8
 */
@FunctionalInterface
public interface PadEventFullFunction {
        org.gstreamer.gst.FlowReturn onPadEventFullFunction(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.Event event);
}
