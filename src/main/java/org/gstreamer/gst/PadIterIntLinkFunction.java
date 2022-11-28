package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The signature of the internal pad link iterator function.
 */
@FunctionalInterface
public interface PadIterIntLinkFunction {
        org.gstreamer.gst.Iterator onPadIterIntLinkFunction(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent);
}
