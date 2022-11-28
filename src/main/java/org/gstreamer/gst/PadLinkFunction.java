package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature to handle a new link on the pad.
 */
@FunctionalInterface
public interface PadLinkFunction {
        org.gstreamer.gst.PadLinkReturn onPadLinkFunction(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.Pad peer);
}
